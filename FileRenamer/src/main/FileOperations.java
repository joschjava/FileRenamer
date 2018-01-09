package main;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.filefilter.TrueFileFilter;

import data.FileData;

public class FileOperations {

	private File dir;

	public void setDirectory(File chosenDir) {
		this.dir = chosenDir;		
	}
	
	public List<FileData> getDirectoryListing() {
		List<File> files = (List<File>) FileUtils.listFiles(dir, TrueFileFilter.INSTANCE, null);
		List<FileData> output = new ArrayList<FileData>();
		for(File f : files) {
			output.add(new FileData(f.getName()));
		}
		return output;
	}
	
}
