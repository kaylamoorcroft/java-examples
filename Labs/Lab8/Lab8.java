// **********************************************************************************************
// Course: COMP 1123 FA01, 2022 
// Lab 8
// Author: Kayla Moorcroft
// Date: 2022-10-28
// **********************************************************************************************

import java.util.Random;

public class Lab8
{
  public static void main(String args[])
  {
    Random gen = new Random();
    
    String[] favouriteNames = new String[] {"Sarah", "Madeline", "Hannah", "Autumn", "Eleanor"};
    int[] favouriteNumbers = new int[] {33, 89, 3, 303, 189};
    
    print("My favourite names and numbers:");
    for(int i = 0; i < favouriteNames.length; i++)
    {
      print("In position: " + (i + 1));
      print(favouriteNames[i]);
      print(favouriteNumbers[i]);
    }
    
    favouriteNames[1] = "Erin";
    favouriteNames[3] = favouriteNames[3].toUpperCase();
    favouriteNumbers[1] = gen.nextInt(11) + 20;
    favouriteNumbers[2] = favouriteNumbers[1] + 5;
    
    print("My favourite names and numbers after changes: ");
    for(int i = 0; i < favouriteNames.length; i++)
    {
      print("In position: " + (i + 1));
      print(favouriteNames[i]);
      print(favouriteNumbers[i]);
    }
  }
  
  public static void print(String s) { System.out.println(s); }  
  public static void print(int i) { System.out.println(i); }  
}