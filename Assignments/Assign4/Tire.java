public class Tire
{
  private String company, model;
  private int diameter;
  private double roundness;
  
  public Tire(String company, String model, int diameter, 
                double roundness)
  {
    this.company = company;
    this.model = model;
    this.diameter = diameter;
    this.roundness = roundness;
  }
  
  public Tire()
  {
    company = "";
    model = "";
    diameter = 0;
    roundness = 0;
  
  }
 
  public double getRoundness(){return roundness;}
  public int getDiameter(){return diameter;}
  public String getModel(){return model;}
  public String getCompany(){return company;}
  
  public void setRoundness(double r){roundness = r;}
  public void setDiameter(int d){diameter = d;}
  public void setModel(String m){model = m;}
  public void setCompany(String c){company = c;}
  
  public void reduceRoundness(double r){roundness -= r;}
  public void reduceDiameter(int d){diameter-=d;}
  
  public String toString()
  {
    String toReturn = "";
    toReturn = toReturn + company + ":" + model +
      " with diameter " + diameter + " inches and roundness "
      + roundness;
    return toReturn;
  }
  
}

//company
//make
//diameter
//fr
//vr