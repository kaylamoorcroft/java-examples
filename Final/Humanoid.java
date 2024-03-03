public class Humanoid extends Robot 
{
  private int vocabSize;
  
  public Humanoid(String name, int age, int IDNumber, double batteryCharge, char identifier, int vocabSize) 
  { 
    super(name, age, IDNumber, batteryCharge, identifier);
    this.vocabSize = vocabSize;
  } 
  
  //Accessors
  public int getVocabSize() {return vocabSize;}
  
  //Mutators
  public void setVocabSize(int vocabSize) {this.vocabSize = vocabSize;}
  
  public String toString() {return super.toString() + " with vocab size " + vocabSize;}
}
