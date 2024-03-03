/************************ 
Course: COMP 1123 FA01, 2022 
Lab 3
Author: Kayla Moorcroft
Date: 2022-09-23
*/////////////////////////

import java.util.Scanner;
import java.util.Random;

public class Lab3
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);
    Random generator = new Random();
    
    print("Please enter a number between 1 and 15: ");
    int userNo = keyboard.nextInt();
    
    int myNo = generator.nextInt(10)+16;
    print("Your number is " + userNo + " and mine is " + myNo);
    
    int betweenNo = generator.nextInt(myNo-userNo+1)+userNo; // The +1 is to make it an inclusive range
    print("A random number between our numbers is " + betweenNo + "!");
  }
  
  public static void print(String s)
  {
    System.out.println(s);
  }
}