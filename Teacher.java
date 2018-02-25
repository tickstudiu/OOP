public class Teacher extends Person{
	
	private String faculty;

	public Teacher(){
		super();
	}

	public Teacher(String n,int a,String f){
		super(n,a);
		this.faculty = f;
	}

	public String getFaculty(){
		return faculty;
	}

	public void setFaculty(String f){
		this.faculty = f;
	}

	public void printDetails(){
		super.printDetails();
		System.out.println("Faculty: " + this.faculty);
	}

}