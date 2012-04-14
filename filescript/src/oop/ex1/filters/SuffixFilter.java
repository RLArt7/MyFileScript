package oop.ex1.filters;

import java.io.File;

public class SuffixFilter extends Filter {
	
	String suffix;
	
	public SuffixFilter(String suffix) {//test
		this.suffix = suffix;
	}
	@Override
	public boolean accept(File path) {
		return (path.getName().endsWith(suffix) ? true :false);
	}	

}
