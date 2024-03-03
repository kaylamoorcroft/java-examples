// **********************************************************************************************
// Course: COMP 1123 FA01, 2022 
// Assignment 6
// Author: Kayla Moorcroft
// Date: 2022-11-18
// **********************************************************************************************
import java.util.ArrayList;

public class GraduateStudent extends Student 
{
  private ArrayList<Publication> publications;
  
  public GraduateStudent(String fName, String lName, int age, Address address, String ID, ArrayList<Publication> publications) 
  { 
    super(fName, lName, age, address, ID);
    this.publications = publications;
  }
  
  //Accessors
  public ArrayList<Publication> getPublications() {return publications;}
  
  //Mutators
  public void setPublications(ArrayList<Publication> publications) {this.publications = publications;}
  
  public String toString() 
  {
    String toReturn = "Graduate student: " + super.toString().substring(9,super.toString().length()-2) + ", Publications: \n";
    for(Publication pub : publications){toReturn += pub + "\n";}
    return toReturn;
  }
  
}
