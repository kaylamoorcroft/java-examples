/************************ 
Course: COMP 1123 FA01, 2022 
Assignment 2, Question 1
Author: Kayla Moorcroft
Date: 2022-09-22
*/////////////////////////

import java.text.NumberFormat;

public class Exam
{
  // Instance data
  private String subject, location;
  private int noPages, noQuestions, noAnswersCorrect;
  
  // formatting
  private NumberFormat percent = NumberFormat.getPercentInstance();
  
  // Constructor
  public Exam(String subject, String location, int noPages, int noQuestions)
  {
    this.subject = subject;
    this.location = location;
    this.noPages = noPages;
    this.noQuestions = noQuestions;
    this.noAnswersCorrect = 0;
  }
  
  // Accessors and mutators for each instance data
  public String getSubject(){return subject;}
  public String getLocation(){return location;}
  public int getNoPages(){return noPages;}
  public int getNoQuestions(){return noQuestions;}
  public int getNoAnswersCorrect(){return noAnswersCorrect;}
  
  public void setSubject(String subject){this.subject = subject;}
  public void setLocation(String location){this.location = location;}
  public void setNoPages(int noPages){this.noPages = noPages;}
  public void setNoQuestions(int noQuestions){this.noQuestions = noQuestions;}
  public void setNoAnswersCorrect(int noAnswersCorrect){this.noAnswersCorrect = noAnswersCorrect;}
  
  public String toString()
  {
    String toReturn = "";
    toReturn += "This " + subject + " exam has " + noPages + " pages and will be written in " + location + "\n";
    toReturn += "This exam has " + noQuestions + " and " + noAnswersCorrect + " answered correctly for a score of " + percent.format((float)noAnswersCorrect/noQuestions) + "\n";
    return toReturn;
  }
}