package oop.ex1.filters;

import java.io.File;

public class SmallerFilter extends Filter {
	
	double size;
	
	public SmallerFilter(String size) {//test
		this.size = Double.parseDouble(size) * 128 ;// in bytes
	}
	@Override
	public boolean accept(File path) {
		return (path.length() < size ? true :false);
	}	

}
