package oop.ex1.filters;

import java.io.File;
import java.util.ArrayList;

public class OrFilter extends Filter {

	ArrayList<Filter> orFilters = null;
	
	public OrFilter() {
		
	}
	
	public void addFilter(FilterSet filt, String value) throws FilterNotFound {
		switch(filt) {
		case before:
			orFilters.add(new BeforeFilter(value));
			break;
		case after:
			orFilters.add(new AfterFilter(value));
			break;
		case greater_than:
			orFilters.add(new GreaterFilter(value));
			break;
		case smaller_than:
			orFilters.add(new SmallerFilter(value));
			break;
		case file:
			orFilters.add(new NameFilter(value));
			break;
		case prefix:
			orFilters.add(new PrefixFilter(value));
			break;
		case suffix:
			orFilters.add(new SuffixFilter(value));
			break;
		case writable:
			orFilters.add(new WritableFilter());
			break;
		case executable:
			orFilters.add(new ExecutableFilter());
			break;
		case hidden:
			orFilters.add(new HiddenFilter());
			break;
		default:
			throw new FilterNotFound();
		}
	}
	
	@Override
	public boolean accept(File arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	


}
