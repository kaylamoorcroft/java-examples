// // **********************************************************************************************
// Course: COMP 1123 FA01, 2022 
// Assignment 6
// Author: Kayla Moorcroft
// Date: 2022-11-18
// **********************************************************************************************

import java.util.ArrayList;

public class Persons 
{
  public static void main(String[] args) 
  { 
    Address address1 = new Address(33, "Hayview Avenue", "Snowville", "3P5 D8J");
    Address address2 = new Address(19, "Hayward Drive", "Bashington", "I94 BI4");
    Address address3 = new Address(89, "Greystone Road", "Mariopolis", "33P UY3");
    Address address4 = new Address(34, "Hayview Avenue", "Snowville", "3P5 D8J");
    Address address5 = new Address(2, "High Road", "Snowville", "3P5 D9K");
    
    ArrayList<Publication> publications = new ArrayList<Publication>();
    publications.add(new Publication("How to eat apples", "The Food Society", "109293451", "4 April 2021"));
    publications.add(new Publication("A new perspective to Rolle's theorem", "Mathematicians' daily digest", "203434912", "31 October 2018"));
    
    ArrayList<Job> jobs = new ArrayList<Job>();
    jobs.add(new Job("Accountant", 53781));
    jobs.add(new Job("Electrical engineer", 89000));
    jobs.add(new Job("English teacher", 54982));
    
    Employee employee1 = new Employee("Henry", "Dash", 54, address1, jobs);
    Employee employee2 = new Employee("Blitz", "Conrai", 17, address2, new ArrayList<Job>());
    Student student = new Student("Barbara", "Honey", 18, address3, "0123456");
    Person person = new Person("Sandra", "Sunny", 32, address4);
    GraduateStudent graduateStudent = new GraduateStudent("Sarah", "Underwood", 33, address5, "0987654", publications);
    
    System.out.println(employee1);
    System.out.println(employee2);
    System.out.println(student);
    System.out.println(person);
    System.out.println(graduateStudent);
  } 
}
