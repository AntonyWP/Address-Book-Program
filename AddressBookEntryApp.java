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
import java.util.Scanner;

public class AddressBookEntryApp
{
  public static void main(String args[])
  {
    // display a welcome message
    System.out.println("Welcome to the Address Book Application");
    
    // create the Scanner object
    Scanner keyScan = new Scanner(System.in);
    
    // 
    int menuNumber = 0;
    while (menuNumber !=3)
    {
      // menu
      System.out.println("1 - List entries");
      System.out.println("2 - Add entry");
      System.out.println("3 - Exit\n");
      
      // get input from user
      menuNumber = Validator.getIntWithinRange(keyScan, "Enter Menu Number: ", 0, 4);
      
      switch (menuNumber)
      {
        case 1:
        {
          String entriesString = AddressBookIO.getEntriesString();
          System.out.println(entriesString);
          break;
        }
        case 2:
        { 
          // get data from user 
          String name = Validator.getRequiredString(keyScan, "Enter Name: "); 
          String email = Validator.getRequiredString(keyScan, "Enter Email Address: ");
          String cellNumber = Validator.getRequiredString(keyScan, "Enter Phone Number: ");

          // create AddressBookEntry object and fill with data 
          AddressBookEntry entry = new AddressBookEntry(); 
          entry.setName(name);
          entry.setEmail(email);
          entry.setCellNumber(cellNumber); 
          
          // save the AddressBookEntry object and display confirmation message 
          AddressBookIO.saveEntry(entry); 
          System.out.println(); 
          System.out.println("This entry has been saved.\n");
          break;
        } 
        case 3:
        { 
          System.out.println("Goodbye.\n");
          break; 
        } 

      }
    }
  }
}