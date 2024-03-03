// **********************************************************************************************
// Course: COMP 1123 FA01, 2022 
// Lab 9
// Author: Kayla Moorcroft
// Date: 2022-11-09
// **********************************************************************************************

public class B extends A 
{
  protected int z;
  
  public B(int x, int y, int z) 
  { 
    super(x,y);
    this.z = z;
  }
  
  public void setZ(int value) { z = value; }
  public int getZ() { return z; }
  
  public String toString() { return "x: " + x + ", y: " + y + ", z: " + z; }
}
