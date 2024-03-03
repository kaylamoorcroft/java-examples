import java.text.NumberFormat;

public class Worker extends Human 
{
  private double income;
  
  public Worker(String name, int age, int IDNumber, double o2Level, double identifier, double income) 
  { 
    super(name,age, IDNumber, o2Level, identifier);
    this.income = income;
  }
  
  //Accessors
  public double getIncome() {return income;}
  
  //Mutators
  public void setStudentID(double income) {this.income = income;}
  
  public String toString() 
  {
    NumberFormat nf = NumberFormat.getCurrencyInstance();
    return super.toString() + " and makes " + nf.format(income);
  }
}
