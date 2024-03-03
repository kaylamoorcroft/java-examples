// **********************************************************************************************
// Course: COMP 1123 FA01, 2022 
// Lab 10 
// Author: Kayla Moorcroft
// Date: 2022-11-18
// **********************************************************************************************

public class Lab10
{
  
  public static void main(String[] args) 
  { 
    Party party1 = new Party(32, "Best Bash Ever!", "Woot woot");
    Party party2 = new Party(14, "Quiet Fun", "Shhhh");
    
    System.out.println(party1);
    System.out.println(party2);
    
    party1.celebrate();
    party2.celebrate();
    
    System.out.println("We have " + Party.getNoParties() + " parties happening");
  }
  
}
