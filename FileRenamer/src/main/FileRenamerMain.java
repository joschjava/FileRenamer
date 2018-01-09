package main;
import java.io.File;

import javafx.application.Application;
import view.MainApp;


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
