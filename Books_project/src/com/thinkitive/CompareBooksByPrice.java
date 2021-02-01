package com.thinkitive;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CompareBooksByPrice implements Comparator<Book>{

	public int compare(Book o1, Book o2) {
		if(o1.getPrice()>o2.getPrice())
			return 1;
		else if(o1.getPrice()<o2.getPrice())
			return -1;
		else
		return 0;
	}

	

	



	
		
}
