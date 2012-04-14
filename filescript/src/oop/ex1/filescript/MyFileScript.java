package oop.ex1.filescript;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import oop.ex1.filters.*;


public class MyFileScript {

	/**
	 * @param args
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException {
		
//		ArrayList<Command> commands;
//		sections = readSections(args[1]);
		
		
		File sourceDir = new File(args[0]);
		List<File> files = MyFileScript.importFiles(sourceDir);
		
		
		System.out.println(files.toString());
	//	files.get(1).list(filter)
//		for (int i=0; i< sections.size() ; i++) {
//			actOnFiles(files, sections.get(i));
//		}
	}
	
	
	public static List<File> importFiles(File source) 
	throws FileNotFoundException {
		validateDir(source);
		List<File> result = fileListing(source);
		Collections.sort(result);
	    return result;
	}


	private static List<File> fileListing(File source)
	throws FileNotFoundException{
		List<File> result =new ArrayList<File>();
		
//		Filter filter = new HiddenFilter(); //test
		
		File[] filesAndDirs = source.listFiles(/*filter*/);
		List<File> filesDirs = Arrays.asList(filesAndDirs);
		for(File file:filesDirs){
			if (file.isFile() ) {
				result.add(file);
			}else{
				 List<File> deeper =fileListing(file);
				 result.addAll(deeper);
			}
		}
		return result;
	}


	private static void validateDir(File source) throws FileNotFoundException 
		 {
		    if (source == null) {
		      throw new IllegalArgumentException("Directory should not be null."); // why not throw this out?
		    }
		    if (!source.exists()) {
		      throw new FileNotFoundException("Directory does not exist: " + source);
		    }
		    if (!source.isDirectory()) {
		      throw new IllegalArgumentException("Is not a directory: " + source);
		    }
		    if (!source.canRead()) {
		      throw new IllegalArgumentException("Directory cannot be read: " + source);
		    }
		  }
		
	
	

	

}
