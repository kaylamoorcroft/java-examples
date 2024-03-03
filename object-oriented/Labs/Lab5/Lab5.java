// **********************************************************************************************
// Course: COMP 1123 FA01, 2022 
// Lab 5
// Author: Kayla Moorcroft
// Date: 2022-10-07
// **********************************************************************************************
import java.util.ArrayList;
import java.util.Scanner;

public class Lab5
{
  static ArrayList<Car> cars = new ArrayList<Car>();
  static Scanner scan = new Scanner(System.in);

  
  public static void main(String args[])
  {
    String model, colour;
    int mileage, year;
    
    print("I will store 3 cars for you");
    
    for (int i = 0; i < 3; i++)
    {
      print("Please give me car #" + (i+1) + " to store");
      
      // Get the info for the car from the user
      print("Model: ");
      model = scan.next();
      print("Colour: ");
      colour = scan.next();
      print("Mileage: ");
      mileage = scan.nextInt();
      print("Year: ");
      year = scan.nextInt();
      
      //Create the car
      cars.add(new Car(model, mileage, year, colour));
      
      // Add the tires
      for (int j = 0; j < 4; j++)
        cars.get(i).addTire(new Tire("Michelin", "X-ice", 16, 0.9));
    }
    
    print("Here are your cars");
    for(Car car : cars)
      print(car);
  }
  
  private static void print(String s)
  {
    System.out.println(s);
  }
  
  private static void print(Car c)
  {
    System.out.println(c);
  }
}