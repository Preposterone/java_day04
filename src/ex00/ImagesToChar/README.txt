# Compilation:
    # this command compiles .java files into .class files, put them into target directory
 javac -d ./target/ src/java/edu/school21/printer/app/Main.java src/java/edu/school21/printer/logic/Logic.java

# Launch app
    # Usage: app <char for white pixels> <char for black pixels> <full path to black & white bmp image>
# java -cp ./target edu.school21.printer.app.Main
cp -r src/resources target/     #this is in the subject
# Example use:
 java -cp ./target edu.school21.printer.app.Main . 0 $PWD/../../../resources/it.bmp
