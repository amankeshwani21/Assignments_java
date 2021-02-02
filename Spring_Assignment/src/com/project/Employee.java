package com.project;

public class Employee {
   private int id,pt;
   private String name;
   private double hra,pf,basicsalary,medical,grosssalary,netsalary;

   public Employee() {
	// TODO Auto-generated constructor stub
}

public Employee(int id, String name, double basicsalary, double medical) {
	super();
	this.id = id;
	this.pt = 200;
	this.name = name;
	this.basicsalary = basicsalary;
	this.hra = 0.50*basicsalary;
	this.pf = 0.12*basicsalary;
	this.medical = medical;	
}

@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + id;
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
	Employee other = (Employee) obj;
	if (id != other.id)
		return false;
	return true;
}

  public double gsalary(){
	  this.grosssalary=this.basicsalary+this.hra+this.medical;
	return this.grosssalary;
	  
  }
  public double nsalary(){
	  this.netsalary=(this.gsalary()-this.pf)-this.pt;
	  return this.netsalary;  
  }

@Override
public String toString() {
	return "Employee [id=" + id + ", pt=" + pt + ", name=" + name + ", hra=" + hra + ", pf=" + pf + ", basicsalary="
			+ basicsalary + ", medical=" + medical + ", grosssalary=" + grosssalary + ", netsalary=" + netsalary + "]";
}

  


}



