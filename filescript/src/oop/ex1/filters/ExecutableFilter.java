package oop.ex1.filters;

import java.io.File;

public class ExecutableFilter extends Filter {
		
	public ExecutableFilter() {//default
	}
	@Override
	public boolean accept(File path) {
		return (path.canExecute() ? true :false);
	}	

}
