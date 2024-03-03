public abstract class LifeForm 
{
  protected String name;
  protected int age, IDNumber; 
  
  public LifeForm(String name, int age, int IDNumber) 
  { 
    this.name = name;
    this.age = age;
    this.IDNumber = IDNumber;
  } 
  
  //Accessors
  public String getName() {return name;}
  public int getAge() {return age;}
  public int getIDNumber() {return IDNumber;}
  
  //Mutators
  public void setName(String name) {this.name = name;}
  public void setAge(int age) {this.age = age;}
  public void setIDNumber(int IDNumber) {this.IDNumber = IDNumber;}
  
  public String toString() {return name + " is " + age + " years old";}
}
