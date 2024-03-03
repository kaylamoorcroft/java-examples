// **********************************************************************************************
// Course: COMP 1123 FA01, 2022 
// Assignment 6
// Author: Kayla Moorcroft
// Date: 2022-11-18
// **********************************************************************************************

public class Job 
{
  private String name;
  private int salary;
  
  public Job(String name, int salary) 
  { 
    this.name = name;
    this.salary = salary;
  }
  
  //Accessors
  public String getName() {return name;}
  public int getSalary() {return salary;}
  
  //Mutators
  public void setName(String name) {this.name = name;}
  public void setSalary(int salary) {this.salary = salary;}
  
  public String toString() {return name + ", Salary: " + salary;}
}
