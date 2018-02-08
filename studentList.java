import java.util.*;

public class studentList {

	// studentList code 
    private ArrayList<Student> studentList;

    // consturctor
    public studentList() {
       this.studentList = new ArrayList<Student>();
    }
    
    // method add student
    public void addStudent(Student st){
    	this.studentList.add(st);
    }

    // method search student by student code
    public int searchStudentBystCode(String stCode){
    	int i;

    	for (i = 0;i < this.studentList.size();i++) {
    		if(this.studentList.get(i).getCode() == stCode){
	    		return i;
	    	}
	    	else {
	    		continue;
	    	}
    	}
    	return -1;
    }

    // method remove student by student code
    public boolean removeStudentBystCode(String stCode){
    	if (this.searchStudentBystCode(stCode) != -1) {
    		this.studentList.remove(this.searchStudentBystCode(stCode));
    		return true;
    	}else {
    		return false;
    	}
    }

    // method show all student info
    public void showAllStudentInfo(){
    	int i;
    	for (i = 0;i < this.studentList.size();i++) {
    		System.out.println(this.studentList.get(i));
    	}
    }

    // method get number of student
    public int getNumberOfStudent(){
    	return this.studentList.size();
    }
}
