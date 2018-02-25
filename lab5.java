import java.util.*;

public class lab5{

	public static void main(String[] args) {
		
		ArrayList<Person> plist = new ArrayList<Person>();

		Person p = new Person("Person",1);
		Teacher t = new Teacher("Teacher",2,"coe");
		Employee e = new Employee("Employee",3,"5x35512xxx");
		ContractEmployee ce = new ContractEmployee("ContractEmployee",4,"5x35512xxx",100);
		PermanentEmployee pe = new PermanentEmployee("PermanentEmployee",5,"5x35512xxx",120);
		
		p.printDetails();
		t.printDetails();
		e.printDetails();
		ce.printDetails();
		pe.printDetails();

		plist.add(p);
		plist.add(t);
		plist.add(e);
		plist.add(ce);
		plist.add(pe);


		for (int i = 0;i < plist.size();i++ ) {
			plist.get(i).printDetails();	
		}
		
	}
}