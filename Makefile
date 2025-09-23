run: 
	javac -cp "lib/sqlite.jar" -d out -sourcepath src src/com/educompass/App.java
	java -cp "out;lib/sqlite.jar" com.educompass.App
