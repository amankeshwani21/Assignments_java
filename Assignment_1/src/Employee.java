public class Employee {
private int empid;
private String ename;
private int salary;
static Employee e; // by default null

private Employee() {
	
}
public static Employee getEmployee() {
	if(e==null) {
		e=new Employee();
		return e;
	}
	else {
		System.out.println("object already exist..!!!");
		return e;
	}
	
}
public int getEmpid() {
	return empid;
}

public void setEmpid(int empid) {
	this.empid = empid;
}

public String getEname() {
	return ename;
}
public void setEname(String ename) {
	this.ename = ename;
}

public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}
public void printData() {
	System.out.println(getEmpid());
	System.out.println(getEname());
	System.out.println(getSalary());
}
}
