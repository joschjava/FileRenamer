package view;

import java.io.File;

import data.FileData;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.DirectoryChooser;
import javafx.stage.Stage;

public class ViewController {

	private Stage stage;
	private MainApp mainApp;
	
    @FXML
    private TableColumn<FileData, String> fileDataColumn;
	
    @FXML
    private TableView<FileData> table;
    
	@FXML
	private void initialize(){

		fileDataColumn.setCellValueFactory(
			    new PropertyValueFactory<FileData,String>("filename")
			);
        
        // Initialize the person table with the two columns.
		fileDataColumn.setCellValueFactory(cellData -> cellData.getValue().filenameProperty());
   

	}
	
	@FXML
	private void openFileChooser() {
		DirectoryChooser fileChooser = new DirectoryChooser();
		fileChooser.setTitle("Open Resource File");
		File chosenDir = fileChooser.showDialog(stage);
		mainApp.getOperations().setDirectory(chosenDir);
		table.setItems(mainApp.updateDirectoryListing());
	}
	
	public void setStage(Stage stage) {
		this.stage = stage;
	}
	
	public void setMainApp(MainApp mainApp) {
		this.mainApp= mainApp;
	}
}
