fun main () {
  var availableRooms:MutableList<Int> = mutableListOf(1,5,9,10,11,15,20);
  println(availableRooms.size);

  var greetings: String = "Greetings! My name is Bob.\n";


  greetings = greetings + "The room numbers ";

  for ( room in 0..availableRooms.size-2 ){
    greetings = greetings + "${availableRooms[room]}, ";
  }

  greetings = greetings + "and ${availableRooms[availableRooms.size-1]} is available.\n";
  print(greetings)
}
