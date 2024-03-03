import java.util.Random;

public class FutureCommunity 
{
  public static void main(String[] args) 
  { 
    //Creating the population
    LifeForm[] population = new LifeForm[4];
    population[0] = new Student("Samia", 22, 44, 98.4, 22.5, 123456);
    population[1] = new Worker("Ilsa", 40, 114, 96.2, 15.1, 67421);
    population[2] = new Humanoid("Bert", 12, 91, 44.5, 'b', 180);
    population[3] = new Pet("Doggie", 3, 4, 77.3, 'd', 0.9);
    
    System.out.println("Population: \n");
    for(LifeForm lifeForm : population)
      System.out.println(lifeForm);
    
    //Making changes
    Random gen = new Random();
    population[0].setIDNumber(gen.nextInt(100000)+600000);
    ((Human)population[1]).setO2Level(99.1);
    population[2].setName("Bret");
    ((Robot)population[3]).setIdentifier('g');
    
    System.out.println("\nPopulation: \n");
    for(LifeForm lifeForm : population)
      System.out.println(lifeForm);

    //Making more changes
    for(LifeForm lifeForm : population)
    {
      for (int i = 0; i < lifeForm.getName().length(); i++)
      {
        if (lifeForm.getName().substring(i,i+1).equalsIgnoreCase("e"))
        {
          lifeForm.setName(lifeForm.getName().toUpperCase());
          break;
        }
      }
    }
   
    System.out.println("\nPopulation: \n");
    for(LifeForm lifeForm : population)
      System.out.println(lifeForm);
  }
}
