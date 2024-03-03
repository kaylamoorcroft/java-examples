// **********************************************************************************************
// Course: COMP 1123 FA01, 2022 
// Assignment 4
// Author: Kayla Moorcroft
// Date: 2022-10-21
// **********************************************************************************************
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class Assignment4Moorcroft
{
  static ArrayList<String> models, colours;
  static ArrayList<Tire> goodTires, badTires;
  static ArrayList<Car> cars;
  static Random gen = new Random();
  
  public static void main(String args[])
  {
    Scanner scan = new Scanner(System.in);
    int numCars, carToDelete;
    cars = new ArrayList<Car>();
    
    print("How many cars are we storing?");
    numCars = scan.nextInt();
    
    addModels();
    addColours();
    createTires();
    
    print("Here are your cars:");
    addRandomCars(numCars);
    
    print("Here are your cars after painting, mileage and diameter changes: ");
    updateCars();
    
    do 
    {
      print("Which car could you like to get rid of? [Car 1-" + cars.size() + "]");
      carToDelete = scan.nextInt(); 
    } while (!(carToDelete >= 1 && carToDelete <= cars.size()));
    cars.remove(carToDelete-1);
    
    print("Here are your cars after deleting the car you specified:");
    for(Car car : cars) System.out.println(car);
  }
  
  public static void addRandomCars(int numCars)
  {
    for(int i = 0; i < numCars; i++)
    {
      // generate random parameters to create cars.
      String model = models.get(gen.nextInt(5));
      int mileage = gen.nextInt(400001);
      int year = gen.nextInt(43)+1980;
      String colour = colours.get(gen.nextInt(5));
      
      // add the car
      cars.add(new Car(model, mileage, year, colour));
      
      Boolean goodTiresTrue = (gen.nextInt(3) > 0? true : false); //gen.nextInt(3)>0 means it is 1 or 2 but not 0. therefore 2/3 chance for good tires
      
      // add tires
      for (int j = 0; j < 4; j++)
      { // have to create new objects. if just set equal to goodTires, then point to same object and change applies to all cars, not just one.
        if (goodTiresTrue) cars.get(i).addTire(new Tire(goodTires.get(j).getCompany(), goodTires.get(j).getModel(), goodTires.get(j).getDiameter(), goodTires.get(j).getRoundness()));
        else cars.get(i).addTire(new Tire(badTires.get(j).getCompany(), badTires.get(j).getModel(), badTires.get(j).getDiameter(), badTires.get(j).getRoundness()));
      }
      System.out.println(cars.get(i));
    }
  }
  
  public static void updateCars()
  {
    for(int i = 0; i < cars.size(); i++)
    {
      cars.get(i).addMileage(gen.nextInt(151)+50);
      if (i % 2 == 0) cars.get(i).setColour("Black");
      else cars.get(i).setColour("White");
      
      for (int j = 0; j < 4; j++) cars.get(i).getTires().get(j).reduceDiameter(gen.nextInt(3)+1);
      
      System.out.println(cars.get(i));
    }
  }
  
  public static void addModels()
  {
    models = new ArrayList<String>();
    models.add("Volvo");
    models.add("Ferrari");
    models.add("Porsche");
    models.add("Kia");
    models.add("BMW");
  }
  
  public static void addColours()
  {
    colours = new ArrayList<String>();
    colours.add("Pink");
    colours.add("Blue");
    colours.add("Grey");
    colours.add("White");
    colours.add("Purple");
  }
  
  public static void createTires()
  {
    goodTires = new ArrayList<Tire>();
    badTires = new ArrayList<Tire>();
    
    for(int i = 0; i < 4; i++) goodTires.add(new Tire("Michelin", "X-Ice", 20, 0.9));
    for(int i = 0; i < 4; i++) badTires.add(new Tire("Bridgestone", "Blizzak", 16, 0.8));
  }
  
  public static void print(String s) { System.out.println(s); }
}