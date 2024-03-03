/************************ 
Course: COMP 1123 FA01, 2022 
Assignment 1, Question a
Author: Kayla Moorcroft
Date: 2022-09-21
*/////////////////////////

import java.util.Scanner;

public class A1Qa {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        
        final int FOUNDED = 1838;
        final int ENROLLMENT = 4542;
      
        print("When did Acadia University open?");
        int foundedGuess = scan.nextInt();
        print("How many students were enrolled at Acadia in 2021-2022?");
        int enrollmentGuess = scan.nextInt();
        print("Number of years in error: "+ Math.abs(FOUNDED-foundedGuess)+" years");
        print("Number of students in error: "+ Math.abs(ENROLLMENT-enrollmentGuess)+" students");
    }
    
    public static void print(String s)
    {
        System.out.println(s);
    }
}