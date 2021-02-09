package com.example.demo;

import java.util.ArrayList;
import java.util.List;

public class Exam {
    
	private int examid;
	private String examname;

	
	public Exam() {
		// TODO Auto-generated constructor stub
	}

	public Exam(int examid, String examname, List<Questions> questions) {
		super();
		this.examid = examid;
		this.examname = examname;
	
	}

	public int getExamid() {
		return examid;
	}

	public void setExamid(int examid) {
		this.examid = examid;
	}

	public String getExamname() {
		return examname;
	}

	public void setExamname(String examname) {
		this.examname = examname;
	}



	@Override
	public String toString() {
		return "Exam [examid=" + examid + ", examname=" + examname + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + examid;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Exam other = (Exam) obj;
		if (examid != other.examid)
			return false;
		return true;
	}
		
}
