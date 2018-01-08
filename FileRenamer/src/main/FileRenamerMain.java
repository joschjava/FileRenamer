import java.io.File;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.filefilter.TrueFileFilter;


public class FileRenamerMain {


	FileRenamerMain(){
		File dir = new File("C:\\HTW\\1semester\\AngewMathe\\Übung\\renameTest");
		List<File> files = (List<File>) FileUtils.listFiles(dir, TrueFileFilter.INSTANCE, null);
		for(File f : files) {
			Logger.log(f.getName());
		}
	}
	
	public static void main(String[] args) {
		new FileRenamerMain();
	}

}
