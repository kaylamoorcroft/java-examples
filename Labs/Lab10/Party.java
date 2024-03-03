// **********************************************************************************************
// Course: COMP 1123 FA01, 2022 
// Lab 10 
// Author: Kayla Moorcroft
// Date: 2022-11-18
// **********************************************************************************************

public class Party implements Celebratory 
{
  private int attendanceNo;
  private String partyName, celMessage;
  
  static private int noParties = 0;
    
  public Party(int attendanceNo, String partyName, String celMessage) 
  { 
    this.attendanceNo = attendanceNo;
    this.partyName = partyName; 
    this.celMessage = celMessage;
    
    noParties += 1;
  }
  
  public void celebrate() { System.out.println(celMessage); }
  
  public static int getNoParties() {return noParties; }
  
  public String toString()
  {
    return "This party is called " + partyName + " and there are " + attendanceNo + " people here!";
  }
  
}
