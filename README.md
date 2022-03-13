# Introduction 
This repository is for my kotlin applications. It's one of the best programming language. In order to use these applications, you should read installing the language and it's compiler and, usage sections carefully. 

# Desktop Applications
## Installing the language and it's compiler
1) Download Java Development Kit from OpenJDK. Hint: This is development kit is open source. 
https://jdk.java.net/archive/
https://download.java.net/java/GA/jdk17.0.1/2a2082e5a09d4267845be086888add4f/12/GPL/openjdk-17.0.1_windows-x64_bin.zip
2) Extract all files. Hint: You can use 7-zip. 
3) Find the bin folder, in extracted folder, and copy it's path as text. Ex: D:\downloads\jdk-16\bin
4) On windows computer, first press windows key + x and, then windows key + y . In the settings window search "edit environment variables for your account" and select it. Click edit environment variables.
5) Select the variable named "Path" in user variables, press edit and, add the development kit path. Note: There will be lot's of paths assigned to that variable don't delete all of them. First select, second edit, third new, forth copy paste and, finally ok.
6) Download kotlin programming language compiler. 
https://github.com/JetBrains/kotlin/releases/download/v1.6.10/kotlin-compiler-1.6.10.zip
Hint: Check the fallowing link for the latest compiler and, download the regular compiler not, native mac, windows or, linux: https://kotlinlang.org/docs/tutorials/command-line.html
7) Extract all the files.
8) Find the bin folder, insdie extracted files.
9) Copy it's address/path as text. Ex: D:\downloads\kotlin-compiler-1.5.30\kotlinc\bin
10) On windows computer, first press windows key + x and, then windows key + y . In the settings window search "edit the system environment variables" and select it. Click edit environment variables.
11) Select the variable named "Path" in system variables, press edit and add the compiler path. Note: There will be lot's of paths assigned to that variable don't delete all of them. First click select, second edit, third new, forth copy paste and finally, ok.
12) Press ok one more time after you are sure that you added both path/address to correct variables. 

## Usage 
1) Compile the app using cmd or wt. If it's not compiled. If it's compiled, skip this step and read step 2.
```batch
kotlinc hello_world.kt -include-runtime -d hello_world.jar
```    
2) Run the application.
```batch
java -jar hello_world.jar
```

Hint: Type the fallowing command to get more information about kotlin compiler 
```batch 
kotlinc -help
```

## Atom 
If you want to use Atom text editor to write kotlin applications. Install the language-kotlin package to see typing errors, auto code completion advises and etc. Write your app save it as appname.kt. Compile and run it as it described in Usage section. 

# Mobile Applications 
You can buy my mobile applications from the fallowing [link][developerprofile].

[developerprofile]: https://play.google.com/store/apps/dev?id=5106309994896081965
