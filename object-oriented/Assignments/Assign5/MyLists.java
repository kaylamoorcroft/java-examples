// **********************************************************************************************
// Course: COMP 1123 FA01, 2022 
// Assignment 5
// Author: Kayla Moorcroft
// Date: 2022-11-06
// **********************************************************************************************

import java.text.DecimalFormat;
import java.util.*;

public class MyLists
{
  private int[] myInts;
  private double[] myDoubles;
  
  public MyLists(int intArraySize, int doubleArraySize)
  {
    myInts = new int[intArraySize];
    myDoubles = new double[doubleArraySize];
  }
  
  public void fillRandomInts(int min, int max)
  {
    Random gen = new Random();
    
    for (int i = 0; i < myInts.length; i++)
      myInts[i] = gen.nextInt(max - min + 1) + min;
  }
  
  public void fillRandomDoubles()
  {
    Random gen = new Random();
    
    for (int i = 0; i < myDoubles.length; i++)
      myDoubles[i] = gen.nextFloat();
  }
  
  public int getLargestInt() 
  {
    int max = 0;
    //keep comparing each element with the next one until find max
    for (int num : myInts) {if (num > max) {max = num;}}
    return max;
  }
  
  public double getLargestDouble() 
  {
    double max = 0;
    //keep comparing each element with the next one until find max
    for (double num : myDoubles) {if (num > max) {max = num;}}
    return max;
  }
  
  public void multiply(int factor)
  {
    for (int i = 0; i < myInts.length; i++)
      myInts[i] = myInts[i]*4;
    for (int i = 0; i < myDoubles.length; i++)
      myDoubles[i] = myDoubles[i]*4;
  }
  
  public boolean isIntListLonger()
  {
    if (myInts.length > myDoubles.length) {return true;}
    else {return false;}
  }
  
  public String toString()
  {
    DecimalFormat format = new DecimalFormat("#.###");
    
    String toReturn = "myInts: \n";
    for (int i = 0; i < myInts.length; i++)
      toReturn += (i+1) + ": " + myInts[i] + " ";
    
    toReturn += "\nmyDoubles: \n";
    for (int i = 0; i < myDoubles.length; i++)
      toReturn += (i+1) + ": " + format.format(myDoubles[i]) + " ";
    
    return toReturn;
  }
}