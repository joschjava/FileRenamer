package view;

import java.io.IOException;
import java.net.URL;
import java.util.List;

import data.FileData;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import main.FileOperations;

public class MainApp extends Application{

	private Stage stage;
	private BorderPane rootLayout;
	private ViewController controller;
	private FileOperations operations;
	
	ObservableList<FileData> files = FXCollections.observableArrayList();; 

	
	@Override
	public void start(Stage primaryStage) throws Exception {
		this.stage = primaryStage;
		initRootLayout();
		operations = new FileOperations();
	}

	public Stage getStage() {
		return stage;
	}
	
	public ObservableList<FileData> updateDirectoryListing() {
		files.clear();
		List<FileData> directoryFiles = operations.getDirectoryListing();
		files.addAll(directoryFiles);
		return files;
	}
	
	public ObservableList<FileData> getObservableList (){
		return files;
	}
	
    /**
     * Initializes the root layout.
     */
    public void initRootLayout() {
        try {
            // Load root layout from fxml file.
            FXMLLoader loader = new FXMLLoader();
            URL res = MainApp.class.getResource("mainscene.fxml");
            loader.setLocation(res);

            rootLayout = (BorderPane) loader.load();
            // Show the scene containing the root layout.
            Scene scene = new Scene(rootLayout);
            stage.setScene(scene);
            stage.show();
            controller = loader.getController();
            controller.setStage(stage);
            controller.setMainApp(this);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
	
    public FileOperations getOperations() {
    	return operations;
    }
    
}
