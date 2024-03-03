/************************ 
Course: COMP 1123 FA01, 2022 
Assignment 2, Question 1
Author: Kayla Moorcroft
Date: 2022-09-22
*/////////////////////////

public class Assignment2 {
  
  
  public static void main(String[] args) 
  {
    Exam exam1 = new Exam("Java", "BAC 208", 2, 10);
    Exam exam2 = new Exam("Python", "Main Gym", 22, 21);
    
    System.out.println(exam1.toString());
    System.out.println(exam2.toString());
    
    exam1.setNoPages(3);
    exam2.setLocation("CAR 410");
    System.out.println("There have been updates");
    System.out.println(exam1.toString());
    System.out.println(exam2.toString());
    
    exam1.setNoAnswersCorrect(8);
    exam2.setNoAnswersCorrect(13);
    System.out.println("The exams have been written");
    System.out.println(exam1.toString());
    System.out.println(exam2.toString());
  }
}
