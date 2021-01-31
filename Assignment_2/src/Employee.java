public class Employee {
	int empid;
	String ename;
	double basicsalary,hra,pf,grosssalary,netsalary,medical,pt;
	static int count=1001;
	
	public Employee() {
		
		this.empid=count;
		count++;
	}

	
	public Employee(String ename,int basicsalary,int medical) {
		this();
		this.ename=ename;
		this.basicsalary=basicsalary;
		this.hra=0.5*basicsalary;
		this.pf=0.12*basicsalary;
		this.pt=200;
		this.medical=medical;
		
	}
	public void calculategross() {
		this.grosssalary=this.basicsalary+this.hra+this.medical;
			
		}
	
public void calculatenet() {
	this.netsalary=(this.grosssalary-this.pf)-this.pt;
		
	}

	

	public void printData() {
		System.out.println(this.empid);
		System.out.println(this.ename);
		System.out.println(this.grosssalary);
		System.out.println(this.netsalary);
		
		
	}
}
