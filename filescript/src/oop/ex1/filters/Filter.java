package oop.ex1.filters;

import java.io.*;

public class Filter implements FileFilter {

	enum FilterSet {before, after, greater_than, smaller_than, file, prefix, suffix, writable, executable, hidden}
	
	
	@Override
	public boolean accept(File path) {
		// TODO Auto-generated method stub
		return false;
	}


}
