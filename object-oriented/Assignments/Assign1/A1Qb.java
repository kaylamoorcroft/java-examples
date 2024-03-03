/************************ 
Course: COMP 1123 FA01, 2022 
Assignment 1, Question b
Author: Kayla Moorcroft
Date: 2022-09-21
*/////////////////////////

import java.util.Scanner;

public class A1Qb
{
  public static void main(String args[]){
    Scanner scan = new Scanner(System.in);
    
    print("How many students are there?");
    int noStudents = scan.nextInt();
    print("Number of sections required: "+(noStudents/30+1));
  }
  
  public static void print(String s)
    {
        System.out.println(s);
    }
}