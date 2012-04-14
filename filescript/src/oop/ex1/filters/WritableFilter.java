package oop.ex1.filters;

import java.io.File;

public class WritableFilter extends Filter {
		
	public WritableFilter() {//default
	}
	@Override
	public boolean accept(File path) {
		return (path.canWrite() ? true :false);
	}	

}
