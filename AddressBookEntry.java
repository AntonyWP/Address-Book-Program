/*********************************************************************
 *                                                                   *
 *  CSCI 470               Assignment 5           Fall 2018          *
 *                                                                   *
 *  Developer(s):   Antony Pierson                                   *
 *                                                                   *
 *  Section:        1                                                *
 *                                                                   *
 *  Due Date/Time:  10/15/18 11:59p.m.                               *
 *                                                                   *
 *  Purpose:        A java program to display and add entries to an  *
 *                  address book                                     *
 ********************************************************************/
public class AddressBookEntry
{
  private String name;
  private String email;
  private String cellNumber;
  
  // name get method
  public String getName()
  {
    return name;
  }
  
  // name set method
  public void setName(String newName)
  {
    name = newName;
  }
  
  // email get method
  public String getEmail()
  {
    return email;
  }
  
  // email set method
  public void setEmail(String newEmail)
  {
    email = newEmail;
  }
  
     // name get method
  public String getCellNumber()
  {
    return cellNumber;
  }
  
  // name set method
  public void setCellNumber(String newCellNumber)
  {
    cellNumber = newCellNumber;
  }

}