#Compile .class files, put them into target directory
javac -d ./target/ src/java/edu/school21/printer/app/Main.java src/java/edu/school21/printer/logic/Logic.java

#run app, usage app <char for white pixels> <char for black pixels> <full path to black & white bmp image>
java -cp ./target edu.school21.printer.app.Main
#example use:
#java -cp ./target edu.school21.printer.app.Main . 0 $PWD/../../../resources/it.bmp
