// **********************************************************************************************
// Course: COMP 1123 FA01, 2022 
// Assignment 6
// Author: Kayla Moorcroft
// Date: 2022-11-18
// **********************************************************************************************

import java.util.ArrayList;

public class Employee extends Person 
{
  ArrayList<Job> jobs;
  
  public Employee(String fName, String lName, int age, Address address, ArrayList<Job> jobs) 
  { 
    super(fName, lName, age, address);
    this.jobs = jobs;
  }
  
  //Accessors
  public ArrayList<Job> getJobs() {return jobs;}
  
  //Mutators
  public void setJobs(ArrayList<Job> jobs) {this.jobs = jobs;} 
  
  public String toString() 
  {
    String toReturn = "Employee: " + super.toString().substring(8,super.toString().length()-2) + ", Past jobs: \n";
    for(Job job : jobs){toReturn += job + "\n";}
    return toReturn;
  }
}
