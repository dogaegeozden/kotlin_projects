fun main() {
  // Welcome String
  println("Welcome To The Guess The Number Game");

  // Settings Map
  val settingsMap = HashMap<String, Int>()
    settingsMap["Start The Game"] = 1;
    settingsMap["Rules"] = 2;
    settingsMap["Settings"] = 3;
    settingsMap["Exit"] = 4;

  // Print the settings to users so they can know what to do
  for ((k,v) in settingsMap){
    println("${k}: ${v}");
  }
  println();

  settings_loop@ while(true) {
    print("Press 1 and then enter to start the game: ");
    var sS:Int = readLine()!!.toInt();

    when(sS) {
      1 -> startGame();
      2 -> gameRules();
      3 -> gameSettings();
      4 -> break;
    }
  }
}

// Default Game Settings
class defaultSettings() {
  var mode:String = "Normal"; // Easy 8 lifes, Normal 7 lifes, Hard 6 lifes.
  var uT:Int = 0;
}

// Game Functionalities
fun startGame() {
  var classDefaultSettings = defaultSettings();

  the_main_game_loop@ while(classDefaultSettings.uT<7) {
    var rN:Int = (1..100).random();
    println("This is the random number for production=${rN}");
    print("Enter your guess as an integer here: ");
    var sG = readLine()!!.toInt();
    if (sG<rN) {
      println("It's higher!");
    } else if (sG==rN) {
      println("Congrugulations You Won!");
      break;
    } else {
      println("It's lower!");
    }
  }
}

fun gameRules() {
  println("1. You are playing against the computer.\n2. Your purpose is to guess the random number.\n3. You have 6 life.\n\n")
}

fun gameSettings() {
  val modeMap = HashMap<String, Int>()
    modeMap["Easy"] = 1;
    modeMap["Normal"] = 2;
    modeMap["Hard"] = 3;

  for ((k,v) in modeMap){
    println("${k}: ${v}");
  }

  print("Enter the mode you want here: ");
  var uMS = readLine()!!.toInt();
  if (uMS == 1) {
    var classDefaultSettings = defaultSettings();
    classDefaultSettings.uT = 8;
    println(classDefaultSettings.uT);
  } else if (uMS == 2) {
    var classDefaultSettings = defaultSettings();
    classDefaultSettings.uT = 7;
    println(classDefaultSettings.uT);
  } else if (uMS == 3) {
    var classDefaultSettings = defaultSettings();
    classDefaultSettings.uT = 6;
    println(classDefaultSettings.uT);
  }

}
