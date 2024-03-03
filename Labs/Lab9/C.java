// **********************************************************************************************
// Course: COMP 1123 FA01, 2022 
// Lab 9
// Author: Kayla Moorcroft
// Date: 2022-11-09
// **********************************************************************************************

public class C extends B 
{
  protected int w;
  
  public C(int x, int y, int z, int w) 
  { 
    super(x,y,z);
    this.w = w;
  }
  
  public void setW(int value) { w = value; }
  public int getW() { return w; }
  
  public String toString() { return "x: " + x + ", y: " + y + ", z: " + z + ", w: " + w; }
}
