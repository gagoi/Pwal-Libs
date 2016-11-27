package fr.gagoi.pwal.logger;

import java.io.File;
import java.util.ArrayList;

public class LoggerFile {
	
	private File logFile;
	private ArrayList<ILoggedItem> items = new ArrayList<>();
	
	public LoggerFile(String path) {
		logFile = new File(path);
	}
	
	public void save(){
		
	}

}
