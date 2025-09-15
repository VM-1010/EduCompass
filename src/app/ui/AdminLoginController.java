package app.ui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import app.ui.Controller;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class AdminLoginController {
	
	@FXML
	private PasswordField pass;
	
	@FXML
	private Button submit;
	
	private String passHash = "";
	
	@FXML
	private void adminpressedlogin(ActionEvent e) throws Exception {
		submit.setText("wait..");
		MessageDigest md = MessageDigest.getInstance("SHA-256");
		byte[] hashbytes = md.digest(pass.getText().getBytes());
		String hash = bytesToHex(hashbytes);
		if (hash.equals("bd94dcda26fccb4e68d6a31f9b5aac0b571ae266d822620e901ef7ebe3a11d4f"))
			Control.changeScene(e, Scenetype.Adminlogin);
		else {
			pass.setText("");
			pass.setStyle("-fx-border-color: #ff0000");
			pass.setPromptText("Invalid Password");
			submit.setText("Login");
		}
		
	}
	
	private static String bytesToHex(byte[] bytes) {
        StringBuilder sb = new StringBuilder();
        for (byte b : bytes) {
            sb.append(String.format("%02x", b));
        }
        return sb.toString();
    }
	
	
}


