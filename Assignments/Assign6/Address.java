// **********************************************************************************************
// Course: COMP 1123 FA01, 2022 
// Assignment 6
// Author: Kayla Moorcroft
// Date: 2022-11-18
// **********************************************************************************************

public class Address
{
  private int stNo;
  private String stName, townName, postalCode;
  
  public Address(int stNo, String stName, String townName, String postalCode)
  {
    this.stNo = stNo;
    this.stName = stName;
    this.townName = townName;
    this.postalCode = postalCode;
  }
  
  //Accessors
  public int getStNo() {return stNo;}
  public String getStName() {return stName;}
  public String getTownName() {return townName;}
  public String getPostalCode() {return postalCode;}
  
  //Mutators
  public void setStNo(int stNo) {this.stNo = stNo;}
  public void setStName(String stName) {this.stName = stName;}
  public void setTownName(String townName) {this.townName = townName;}
  public void setPostalCode(String postalCode) {this.postalCode = postalCode;}

  public String toString() { return "Address: " + stNo + " " + stName +", " + townName + " " + postalCode; }
}