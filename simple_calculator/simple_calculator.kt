fun main() {
  fun additionFunc(x:Double,y:Double):Double {
    return x + y;
  }
  fun subtractionFunc(x:Double,y:Double):Double {
    return x - y;
  }
  fun multiplicationFunc(x:Double,y:Double):Double {
    return x * y;
  }
  fun divisionFunc(x:Double,y:Double):Double {
    return x / y;
  }

  println("List Of Operators");
  val operatorsMap = HashMap<String, String>()
    operatorsMap["Addition"] = "+"
    operatorsMap["Subtraction"] = "-"
    operatorsMap["Multiplication"] = "*"
    operatorsMap["Division"] = "/"
    operatorsMap["Power"] = "^"

  for ((k,v) in operatorsMap){
    println("${k}: ${v}")
  }

  println()

  print("Enter your first number here: ")
  var n1 = readLine()!!.toDouble();
  println();
  var oP:String? = null;

  simple_calculator_loop@ while(oP != "exit") {
    print("Enter your selection of operator here: ")
    oP = readLine()!!;
    print("\n");
    print("Enter your second number here: ")
    var n2 = readLine()!!.toDouble();
    print("\n");
    if ( oP == operatorsMap["Addition"] ) {
      n1 = additionFunc(n1,n2)
      println(n1);
    } else if ( oP == operatorsMap["Subtraction"] ) {
      n1 = subtractionFunc(n1,n2)
      println(n1);
    } else if ( oP == operatorsMap["Multiplication"] ) {
      n1 = multiplicationFunc(n1,n2)
      println(n1);
    } else if ( oP == operatorsMap["Division"] ) {
      n1 = divisionFunc(n1,n2)
      println(n1);
    } else if ( oP == operatorsMap["Power"] ) {
      n1 = Math.pow(n1, n2)
      println(n1);
    }
  }
}
