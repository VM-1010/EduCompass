package app.ui;

enum Scenetype {
	UserWelcome("/resources/userloggedin.fxml"),
	AdminWelcome("/resources/adminloggedin.fxml"),
	LoginScreen("/resources/menulayout.fxml"),
	Adminlogin("/resources/adminwelcome.fxml");
	private final String fxmlLocation;
	private Scenetype(String location) {
		this.fxmlLocation = location;
	}
	String getFxml() {
		System.out.println("Navigating to " + this.fxmlLocation);
		return this.fxmlLocation;
	}
}

