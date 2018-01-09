package data;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class FileData {

	SimpleStringProperty filename;

	public String getFilename() {
		return filename.get();
	}

	public FileData(String filename) {
		this.filename = new SimpleStringProperty(filename);
	}
	
	public StringProperty filenameProperty() {
		return filename;
	}
	
}
