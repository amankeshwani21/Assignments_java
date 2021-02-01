package com.thinkitive;


import java.util.ArrayList;
import java.util.List;

public class StoreUtil {
	

	List<Book> records=new ArrayList<Book>();
			
		public void addRecords(Book b){
			records.add(b);
		}
		
		public List getRecords(){
			return this.records;
		}
		
		public int getNumOfRecords(){
			return this.records.size();
		}
			
	}


