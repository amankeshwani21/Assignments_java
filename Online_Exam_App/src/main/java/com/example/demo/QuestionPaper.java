package com.example.demo;

import java.util.ArrayList;
import java.util.List;

public class QuestionPaper {
  
	private List<Student> stu=new ArrayList<Student>();
	private List<Questions> ques=new ArrayList<Questions>();
	
	public QuestionPaper() {
		// TODO Auto-generated constructor stub
	}

	public QuestionPaper(List<Student> stu, List<Questions> ques) {
		super();
		this.stu = stu;
		this.ques = ques;
	}

	public List<Student> getStu() {
		return stu;
	}

	public void setStu(List<Student> stu) {
		this.stu = stu;
	}

	public List<Questions> getQues() {
		return ques;
	}

	public void setQues(List<Questions> ques) {
		this.ques = ques;
	}

	@Override
	public String toString() {
		return "QuestionPaper [stu=" + stu + ", ques=" + ques + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ques == null) ? 0 : ques.hashCode());
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
		QuestionPaper other = (QuestionPaper) obj;
		if (ques == null) {
			if (other.ques != null)
				return false;
		} else if (!ques.equals(other.ques))
			return false;
		return true;
	}

	
	
}
