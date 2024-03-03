// **********************************************************************************************
// Course: COMP 1123 FA01, 2022 
// Lab 12
// Author: Kayla Moorcroft
// Date: 2022-12-01
// **********************************************************************************************

public class LuckyPerson extends Person 
{
  protected float luckFactor;
  
  public LuckyPerson(String fName, String lName, int age, float income, float luckFactor) 
  { 
    super(fName, lName, age, income);
    this.luckFactor = luckFactor;
  }
  
  public void giveRaise() { income *= 1+(luckFactor/100); }
  
  public float getLuckFactor() {return luckFactor;}
  
  public void setLuckFactor(float luckFactor) {this.luckFactor = luckFactor;}
  
  public String toString() { return super.toString() + " with luck factor " + luckFactor ; }
}
