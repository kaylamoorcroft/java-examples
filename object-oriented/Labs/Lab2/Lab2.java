/************************ 
Course: COMP 1123 FA01, 2022 
Lab 2
Author: Kayla Moorcroft
Date: 2022-09-16
*/////////////////////////

import java.util.Scanner;

public class Lab2
{
  public static void main(String args[])
  {
    Scanner scan = new Scanner(System.in);
    final int AGE;
    
    print("I'm going to do some math for you. \nTell me how many years old you are. ");
    AGE = scan.nextInt();
    
    print("While I don't know your exact birthday, I can tell you this:");
    print("\tYou are at least "+AGE*12+" months old.");
    print("\tYou are at least "+AGE*365+" days old.");
    print("\tThe square root of your age is "+Math.sqrt(AGE));
    print("\tIt's over "+(99-AGE)+" years until you are 100.");
    //99 not 100 because it could be 1 day before the person's birthday and hence there won't be an extra full year.
  }
  
  public static void print(String s)
  {
    System.out.println(s);
  }
}

