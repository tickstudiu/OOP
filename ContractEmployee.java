public class ContractEmployee extends Employee{
	
	private int payment;

	public ContractEmployee(){
		super();
	}

	public ContractEmployee(String n,int a,String eid,int p){
		super(n,a,eid);
		this.payment = p;
	}

	public int getPayment(){
		return payment;
	}

	public void setPayment(int p){
		this.payment = p;
	}

	public void printDetails(){
		super.printDetails();
		System.out.println("Payment: " + this.payment);
	}

}