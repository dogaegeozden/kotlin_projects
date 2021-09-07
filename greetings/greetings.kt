fun main(){
  var name: String; // var/val variableName: type to create variables var(mutable) val not
  print("Please enter your name: ") // print()/println() to print out value. print() will print in same line, println() will pass to next line after it finished printing the statement/value.
  name = readLine()!! // readLine to get input from user. !! is for null safety so user can avoid entering input wihtout causing to program crash.
  println("Greeints ${name}.\n") // ${variableName} to use functions or variables in strings. \n for new line.
}
