// **********************************************************************************************
// Course: COMP 1123 FA01, 2022 
// Lab 12
// Author: Kayla Moorcroft
// Date: 2022-12-01
// **********************************************************************************************

import java.text.NumberFormat;

public class TwoJobPerson extends Person 
{
  protected float secondIncome;
  
  private NumberFormat format = NumberFormat.getCurrencyInstance();
  
  public TwoJobPerson(String fName, String lName, int age, float income, float secondIncome) 
  { 
    super(fName, lName, age, income);
    this.secondIncome = secondIncome;
  }
  
  public void giveSecondRaise() {secondIncome *= 1.10;}
  
  public float getSecondIncome() {return secondIncome;}
  
  public void setSecondIncome(float secondIncome) {this.secondIncome = secondIncome;}
  
  public String toString() { return super.toString() + " and a second income of " + format.format(secondIncome);}
}
