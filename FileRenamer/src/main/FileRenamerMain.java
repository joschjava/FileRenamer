package main;
import java.io.File;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.filefilter.TrueFileFilter;

import javafx.application.Application;
import javafx.stage.Stage;
import view.MainApp;
import view.ViewController;


public class FileRenamerMain {

	private File dir;

	
	public FileRenamerMain(String[] args){
//		File dir = new File("C:\\HTW\\1semester\\AngewMathe\\Übung\\renameTest");
//		List<File> files = (List<File>) FileUtils.listFiles(dir, TrueFileFilter.INSTANCE, null);
//		for(File f : files) {
//			Logger.log(f.getName());
//		}

		Application.launch(MainApp.class, args);
	}
	
	public static void main(String[] args) {

		new FileRenamerMain(args);
	}


	public void setDirectory(File dir) {
		this.dir = dir;
	}


	
}
