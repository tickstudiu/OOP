public class Student{

  // student code 
  private String stCode; 
  private String name;  
  private double gpa;

  // constuctor
  public Student(){ 

  }
  public Student(String c, String nm){
    this.stCode = c;
    this.name = nm;
  }
  public Student(String c, String nm, double g){
    this.stCode = c;
    this.name = nm;
    this.gpa = g;
  }

  // getter method
  public String getCode(){
    return stCode;
  }
   public String getName( ){
    return name;
  }
  public double getGPA( ) {
    return gpa;
  }

  // setter method
  public void setGPA(double g){
    this.gpa = g;
  }

  public String toString(){
    String s = stCode + " " + name + " " + gpa;
    return s;
  }
}