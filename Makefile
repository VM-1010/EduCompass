

run: 
	javac -cp "lib/*" -d out -sourcepath src src/com/educompass/App.java 
	java --module-path lib --add-modules javafx.controls,javafx.fxml -cp "out;lib/*" com.educompass.App

ui-test:
	javac -cp "lib/*" -d out -sourcepath src src/com/educompass/gui/Main.java 
	java --module-path lib --add-modules javafx.controls,javafx.fxml -cp "out;lib/*" com.educompass.gui.Main
	


prepare:
	if not exist out mkdir out
	if not exist out\fxml xcopy /E /I fxml out\fxml
	if not exist out\database xcopy /E /I database out\database


package: prepare
	rem clean old jar
	if exist app.jar del app.jar

	rem copy resources
	xcopy /E /I fxml out\fxml
	xcopy /E /I database out\database

	rem unpack all jars in lib into out
	for %%f in (lib\*.jar) do jar xf %%f

	rem create jar with manifest inline
	echo Main-Class: com.educompass.gui.Main > MANIFEST.tmp
	jar cfm app.jar MANIFEST.tmp -C out .
	del MANIFEST.tmp
