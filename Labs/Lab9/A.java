// **********************************************************************************************
// Course: COMP 1123 FA01, 2022 
// Lab 9
// Author: Kayla Moorcroft
// Date: 2022-11-09
// **********************************************************************************************

public class A
{
  protected int x,y;
  
  public A(int x, int y)
  {
    this.x = x;
    this.y = y;
  }
  
  public void setX(int value) { x = value; }
  public void setY(int value) { y = value; }
  
  public int getX() { return x; }
  public int getY() { return y; }
  
  public String toString() { return "x: " + x + ", y: " + y; }
}