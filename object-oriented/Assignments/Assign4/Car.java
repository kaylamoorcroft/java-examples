import java.util.ArrayList;

public class Car
{
   private String model;
   private int mileage;
   private int year;
   private String colour;
   ArrayList<Tire> tires;
   
   public Car(String m, int mile, int y, String c)
   {
     model = m;
     mileage = mile;
     year = y;
     colour = c;
     tires = new ArrayList<Tire>();
     
   }
   
   public Car()
   {
     model = "";
     mileage = 0;
     year = 0;
     colour = "none";
     
   }
   
   public int getYear(){return year;}
   public String getModel(){return model;}
   public String getColour(){return colour;}
   public ArrayList<Tire> getTires(){return tires;}
   
   public void setColour(String c){colour = c;}
   public void setYear(int y){year = y;}
   public void setModel(String m){model = m;}
   
   public void addMileage(int miles)
   {
     mileage = mileage + miles;
   }
   
   public void addTire(Tire t)
   {
     tires.add(t);
     
   }
   public String toString()
   {
     String toReturn = "Model: " + model + ", Year: " + year +
       ", Mileage: " + mileage + ", Colour: " + colour +
       "\nTires: \n";
     for(Tire t: tires)
       toReturn+=t + "\n";
     return toReturn;
     
   }
  
}