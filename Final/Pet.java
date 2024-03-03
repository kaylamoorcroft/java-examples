public class Pet extends Robot 
{
  private double fuzziness;
    
  public Pet(String name, int age, int IDNumber, double batteryCharge, char identifier, double fuzziness) 
  { 
    super(name, age, IDNumber, batteryCharge, identifier);
    this.fuzziness = fuzziness;
  }  
  
  //Accessors
  public double getFuzziness() {return fuzziness;}
  
  //Mutators
  public void setFuzziness(double fuzziness) {this.fuzziness = fuzziness;}
  
  public String toString() {return super.toString() + " with fuzziness " + fuzziness;}
}
