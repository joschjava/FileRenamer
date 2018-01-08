package view;

import java.io.File;

import javafx.fxml.FXML;
import javafx.stage.FileChooser;
import main.FileRenamerMain;

public class ViewController {

	private FileRenamerMain mainApp;
	
	@FXML
	private void initialize(){
		
	}
	
	private void openFileChooser() {
		FileChooser fileChooser = new FileChooser();
		fileChooser.setTitle("Open Resource File");
		File chosenDir = fileChooser.showOpenDialog(null);
				
	}
	
	private void setMainApp(FileRenamerMain mainApp) {
		this.mainApp = mainApp;
	}
	
}
