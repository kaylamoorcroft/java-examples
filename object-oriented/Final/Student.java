public class Student extends Human 
{
  private int studentID;
  
  public Student(String name, int age, int IDNumber, double o2Level, double identifier, int studentID) 
  { 
    super(name, age, IDNumber, o2Level, identifier);
    this.studentID = studentID;
  }
  
  //Accessors
  public int getStudentID() {return studentID;}
  
  //Mutators
  public void setStudentID(int studentID) {this.studentID = studentID;}
  
  public String toString() {return super.toString() + " with student ID " + studentID;}
}
