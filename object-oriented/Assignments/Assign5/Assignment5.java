// **********************************************************************************************
// Course: COMP 1123 FA01, 2022 
// Assignment 5
// Author: Kayla Moorcroft
// Date: 2022-11-06
// **********************************************************************************************
import java.util.Scanner;
import java.text.DecimalFormat;

public class Assignment5
{
  public static void main(String args[])
  {
    Scanner scan = new Scanner(System.in);
    System.out.println("Please enter integer array size");
    int intArraySize = scan.nextInt();
    System.out.println("Please enter double array size");
    int doubleArraySize = scan.nextInt();
    
    MyLists myLists = new MyLists(intArraySize, doubleArraySize);
    myLists.fillRandomInts(1,10);
    myLists.fillRandomDoubles();
    System.out.println(myLists);
    
    myLists.multiply(4);
    System.out.println("After multiplying by 4:");
    System.out.println(myLists);
    
    DecimalFormat format = new DecimalFormat("#.###");
    System.out.println("The largest int is " + myLists.getLargestInt());
    System.out.println("The largest double is " + format.format(myLists.getLargestDouble()));
    
    if (myLists.isIntListLonger()) {System.out.println("Integer list is longer");}
    else {System.out.println("Integer list is not longer");}
  }
}
