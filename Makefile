run: prepare
	javac -cp "lib/*" -d out -sourcepath src src/com/educompass/gui/Main.java
	java --module-path lib --add-modules javafx.controls,javafx.fxml -cp "out;lib/*" com.educompass.gui.Main

prepare:
	if not exist out mkdir out
	if not exist out\fxml xcopy /E /I fxml out\fxml
	if not exist out\database xcopy /E /I database out\database
