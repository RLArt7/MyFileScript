package oop.ex1.filters;

import java.io.File;

public class GreaterFilter extends Filter {
	
	double size;
	
	public GreaterFilter(String size) {//test
		this.size = Double.parseDouble(size) * 128 ;// in bytes
	}
	@Override
	public boolean accept(File path) {
		return (path.length() > size ? true :false);
	}	

}
