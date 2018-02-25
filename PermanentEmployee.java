public class PermanentEmployee extends Employee {
	
	private int salary;

	public PermanentEmployee(){
		super();
	}

	public PermanentEmployee(String n,int a,String eid,int s){
		super(n,a,eid);
		this.salary = s;
	}

	public int getSalary(){
		return salary;
	}

	public void setSalary(int s){
		this.salary = s;
	}

	public void printDetails(){
		super.printDetails();
		System.out.println("Salary: "+ this.salary);
	}

}