import javafx.beans.property.SimpleStringProperty
import tornadofx.*
package word.counter.tornadofxGUI.jar.kotlinDSL
//import javafx.scene.control.Button
//import javafx.scene.layout.VBox


var listOfWords = listOf<String>() // empty list
var mutableListOfWords = mutableListOf<String>() //empty list

class MyController: Controller() {
    fun countWords(inputValue: String) {
        listOfWords = inputValue.split(" ")
        // Remove ".", "," " " and "<tab>" from listOfWords List.
    }
}

class WordCounterView : View() {
    val controller: MyController by inject()
    val input = SimpleStringProperty()

    override val root = form {
        fieldset {
            field("Text Area:") {
                textfield(input)
            }

            val labelField = label()

            button("Commit") {
                action {
                    runAsync {
                        controller.countWords(input.value)
                        input.value = ""
                        mutableListOfWords = mutableListOf<String>()

                    } ui {
                        for (w in listOfWords) {
                            mutableListOfWords.add(w)
                        }

                        if (" " in mutableListOfWords || "." in mutableListOfWords || "" in mutableListOfWords || "," in mutableListOfWords || " ," in mutableListOfWords) {
                            badWordRemover@ while(true) {
                                if (" " in mutableListOfWords || "" in mutableListOfWords || "." in mutableListOfWords || " ." in mutableListOfWords) {
                                    mutableListOfWords.remove("")
                                    mutableListOfWords.remove(" ")
                                    mutableListOfWords.remove(".")
                                    mutableListOfWords.remove(" .")
                                    mutableListOfWords.remove(". ")
                                    mutableListOfWords.remove(",")
                                    mutableListOfWords.remove(" ,")
                                    mutableListOfWords.remove(", ")
                                } else if ("" !in mutableListOfWords && " " !in mutableListOfWords && "." !in mutableListOfWords && " ." !in mutableListOfWords && ". " !in mutableListOfWords && "," !in mutableListOfWords && " ," !in mutableListOfWords && ", " !in mutableListOfWords) {
                                    labelField.text = "This text includes ${mutableListOfWords.size} words."
                                    break@badWordRemover
                                }

                            }

                        } else {
                            labelField.text = "This text includes ${mutableListOfWords.size} words."
                        }
                    }
                }
            }

        }
    }
}

fun main(args: Array<String>) {
    launch<MyApp>(args)
}



