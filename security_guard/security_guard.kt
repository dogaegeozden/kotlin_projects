fun main (){
  println("How old are you?")
  var age: Int = Integer.valueOf(readLine())
  var idCheck: String?; //This string is null able. But not null.

  if ( age <= 18 ) {
    println("Go away!");
  } else if ( age >= 60 ) {
    println("Aren't you too old grandpa. Can I see your id?");
    idCheck = readLine()!!.lowercase(); // Use !! when the variable is not null/empty.
    if ( idCheck.contains("yes")  == true ) { //.contains to check if a string is containing a substring. It gives true or false out put.
      println("Alright. Get in.")
    } else {
      println("Sorry. I can't let you in without id.")
    }
  } else {
    println("Can I see your id?");
    idCheck = readLine()!!.lowercase();
    if ( idCheck.contains("yes")) {
      println("Get in.")
    } else {
      println("Get out of the line. You can't get in.")
    }
  }
}
