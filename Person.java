public class Person{

	protected String name;
	protected int age;

	public Person(){

	}

	public Person(String n,int a){
		this.name = n;
		this.age = a;
	}

	public String getName(){
		return name;
	}

	public int getAge(){
		return age;
	}

	public void setName(String n){
		this.name = n;
	}

	public void setAge(int a){
		this.age = a;
	}

	public void printDetails(){
		System.out.println("Name: "+ this.name);
		System.out.println("age: "+ this.age);
	}

}