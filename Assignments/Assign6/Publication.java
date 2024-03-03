// **********************************************************************************************
// Course: COMP 1123 FA01, 2022 
// Assignment 6
// Author: Kayla Moorcroft
// Date: 2022-11-18
// **********************************************************************************************

public class Publication 
{
  private String title, journalName, journalID, date;
  
  public Publication(String title, String journalName, String journalID, String date) 
  { 
    this.title = title;
    this.journalName = journalName;
    this.journalID = journalID;
    this.date = date; 
  }
  
  //Accessors
  public String getTitle() {return title;}
  public String getJournalName() {return journalName;}
  public String getJournalID() {return journalID;}
  public String getDate() {return date;}
  
  //Mutators
  public void setTitle(String title) {this.title = title;}
  public void setJournalName(String journalName) {this.journalName = journalName;}
  public void setJournalID(String journalID) {this.journalID = journalID;}
  public void setDate(String date) {this.date = date;}
  
  public String toString() {return "\"" + title + "\" (" + journalName + ", ID: " + journalID + ") - " + date;}
}
