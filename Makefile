run: 
	javac -cp "out;lib/sqlite.jar" -d out src/com/educompass/model/*.java
	javac -cp "out;lib/sqlite.jar" -d out src/com/educompass/dao/*.java
	javac -cp "out;lib/sqlite.jar" -d out src/com/educompass/*.java
	java -cp "out;lib/sqlite.jar" com.educompass.App