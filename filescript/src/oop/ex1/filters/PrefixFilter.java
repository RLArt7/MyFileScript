package oop.ex1.filters;

import java.io.File;

public class PrefixFilter extends Filter {
	
	String prefix;
	
	public PrefixFilter(String prefix) {//test
		this.prefix = prefix;
	}
	@Override
	public boolean accept(File path) {
		return (path.getName().startsWith(prefix) ? true :false);
	}	

}
