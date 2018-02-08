public class MystudenList {
	public static void main(String[] args) {
		studentList sList = new studentList();

		Student st = new Student("5835512100","Mage",4.00);
		Student st2 = new Student("5835512082","Paladin",4.00);
		Student st3 = new Student("5835512104","Kinght",4.00);

		sList.addStudent(st);
		sList.addStudent(st2);
		sList.addStudent(st3);

		sList.showAllStudentInfo();

		System.out.println(sList.searchStudentBystCode("5835512100"));
		System.out.println(sList.removeStudentBystCode("5835512100"));

		sList.showAllStudentInfo();
	}
}