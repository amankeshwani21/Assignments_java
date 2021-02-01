package com.thinkitive;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Test {
   public static void main(String[] args) {
	   
	 Set<String> s1=new HashSet<String>();
	 s1.add("aman");
	 s1.add("rishi");
	 
	 Book b1=new Book(1, "physics", s1, 2000);
	 Book b2=new Book(1, "chemistry", s1, 5000);
	 Book b3=new Book(1, "maths", s1, 3400);
	 
	 StoreUtil s=new StoreUtil();
	 
	 PrintUtil p=new PrintUtil();
	 
	 s.addRecords(b1);
	 s.addRecords(b2);
	 s.addRecords(b3);
	 
	 List <Book> books=new ArrayList<Book>();
	 
	 System.out.println(s.getNumOfRecords());

	 
	 books=p.printRecords(s);
	 
	 System.out.println(books);
	 SortUtil.sortByPrice(books);
	 System.out.println(books);
	 
	 
	 
}
}
