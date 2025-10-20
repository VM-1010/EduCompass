run:
	javac src/gui/*.java -cp "lib/*;bin/"
	javac src/controllers/*.java -cp "lib/*;bin/"
	
	java --module-path "lib" --add-modules javafx.controls,javafx.fxml -cp bin gui.App