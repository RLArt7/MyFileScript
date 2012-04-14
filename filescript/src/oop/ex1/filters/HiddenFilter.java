package oop.ex1.filters;

import java.io.File;

public class HiddenFilter extends Filter {
		
	public HiddenFilter() {//default
	}
	@Override
	public boolean accept(File path) {
		return (path.isHidden() ? true :false);
	}	

}
