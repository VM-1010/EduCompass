run: 
	javac -cp "lib/*" -d out -sourcepath src src/com/educompass/gui/Main.java
	java --module-path lib --add-modules javafx.controls,javafx.fxml -cp "out;lib/*" com.educompass.gui.Main
