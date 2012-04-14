package oop.ex1.filters;

import java.io.File;
import java.util.Date;
import java.text.*;

public class AfterFilter extends Filter {
	
	Date date;
	
	public AfterFilter(String date) {
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		try {
			this.date = format.parse(date);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override
	public boolean accept(File path) {
		return (path.lastModified() > date.getTime() ? true :false);
	}	

}
