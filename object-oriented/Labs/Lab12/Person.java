// **********************************************************************************************
// Course: COMP 1123 FA01, 2022 
// Lab 12
// Author: Kayla Moorcroft
// Date: 2022-12-01
// **********************************************************************************************

import java.text.NumberFormat;

public class Person 
{
  protected String fName, lName;
  protected int age;
  protected float income;
  
  private NumberFormat format = NumberFormat.getCurrencyInstance();
  
  public Person(String fName, String lName, int age, float income) 
  { 
    this.fName = fName;
    this.lName = lName;
    this.age = age;
    this.income = income;
  }
  
  public void giveRaise() { income *= 1.05; }
  
  //Accessors
  public String getFName() {return fName;}
  public String getLName() {return lName;}
  public int getAge() {return age;}
  public float getIncome() {return income;}
  
  //Mutators
  public void setFName(String fName) {this.fName = fName;}
  public void setLName(String lName) {this.lName = lName;}
  public void setAge(int age) {this.age = age;}
  public void setIncome(float income) {this.income = income;}
  
  public String toString() { return fName + " " + lName + " is " + age + " years old and has an income of " + format.format(income); }
}
