// **********************************************************************************************
// Course: COMP 1123 FA01, 2022 
// Lab 9
// Author: Kayla Moorcroft
// Date: 2022-11-09
// **********************************************************************************************

public class D extends A 
{
  protected int q;
  
  public D(int x, int y, int q) 
  { 
    super(x,y);
    this.q = q;
  }
  
  public void setQ(int value) { q = value; }
  public int getQ() { return q; }
  
  public String toString() { return "x: " + x + ", y: " + y + ", q: " + q; }
}
