package oop.ex1.filters;

import java.io.File;
import java.util.ArrayList;

public class AndFilter extends Filter {

	ArrayList<OrFilter> andFilters = null;
	
	public AndFilter() {
		
	}
	
	public void addFilterLine(String line) throws FilterNotFound {
		String[] orFilters;
		OrFilter orFilter = new OrFilter();
		orFilters = line.split(" "); //Magic Character " " - not recommended
		for (int i=0; i < orFilters.length ;i++) {
			String[] pair = orFilters[i].split("%");
			orFilter.addFilter(FilterSet.valueOf(pair[0]), pair[1]);
		}
		andFilters.add(orFilter);
	}
	
	@Override
	public boolean accept(File arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	


}
