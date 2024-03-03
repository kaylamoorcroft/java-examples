public abstract class Human extends LifeForm 
{
  protected double o2Level, identifier;
  
  public Human(String name, int age, int IDNumber, double o2Level, double identifier) 
  { 
    super(name,age, IDNumber);
    this.o2Level = o2Level;
    this.identifier = identifier;
  }
  
  //Accessors
  public double getO2Level() {return o2Level;}
  public double getIdentifier() {return identifier;}
  
  //Mutators
  public void setO2Level(double o2Level) {this.o2Level = o2Level;}
  public void setIdentifier(double identifier) {this.identifier = identifier;}
  
  public String toString() {return super.toString() + " with oxygen level " + o2Level + " and ID number: " + IDNumber + ", identifier: " + identifier;}
}
