import java.text.DecimalFormat;

public abstract class Robot extends LifeForm 
{
  protected double batteryCharge;
  protected char identifier; 
  
  public Robot(String name, int age, int IDNumber, double batteryCharge, char identifier) 
  { 
    super(name, age, IDNumber);
    this.batteryCharge = batteryCharge;
    this.identifier = identifier; 
  }
  
  //Accessors
  public double getbatteryCharge() {return batteryCharge;}
  public double getIdentifier() {return identifier;}
  
  //Mutators
  public void setBatteryCharge(double batteryCharge) {this.batteryCharge = batteryCharge;}
  public void setIdentifier(char identifier) {this.identifier = identifier;}
  
  public String toString() 
  {
    DecimalFormat df = new DecimalFormat("00.0%");
    return super.toString() + " with battery charged to " + df.format(batteryCharge/100) + " and ID number: " + IDNumber + ", identifier letter: " + identifier;
  }
}
