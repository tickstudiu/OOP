public class Employee extends Person{
	
	protected String employeeid;

	public Employee(){
		super();
	}

	public Employee(String n,int a,String eid){
		super(n,a);
		this.employeeid = eid;
	}

	public String getEmployeeId(){
		return employeeid;
	}

	public void setEmployeeId(String eid){
		this.employeeid = eid;
	}

	public void printDetails(){
		super.printDetails();
		System.out.println("Employee Id: " + this.employeeid);
	}
}