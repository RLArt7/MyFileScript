package oop.ex1.filters;

import java.io.File;

public class NameFilter extends Filter {
	
	String name;
	
	public NameFilter(String name) {//test
		this.name = name;
	}
	@Override
	public boolean accept(File path) {
		return (path.getName().toLowerCase().equals(name.toLowerCase()) ? true :false);
	}	

}
