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

public class Validator
{
  public static int getInt(Scanner keyScan, String prompt)
  {
    int i = 0;
    boolean isValid = false;
    
    while (isValid == false)
    {
      System.out.print(prompt);
      
      if (keyScan.hasNextInt())
      {
        i = keyScan.nextInt();
        isValid = true;
      }
      else
      {
        System.out.println("Error! Invalid integer value. Try again.");
      }
      keyScan.nextLine();       // dikeyScanard any other data entered on the line
    }
    return i;
  }
  public static int getIntWithinRange(Scanner keyScan, String prompt,int min, int max)
  {
    int i = 0;
    boolean isValid = false;
 
    while (isValid == false)
    {
      i = getInt(keyScan, prompt);
      
      if (i <= min)
      {
        System.out.println("Error! Number must be greater than " + min);
      }
      else if (i >= max)
      {
        System.out.println("Error! Number must be less than " + max);
      }
      else
      {
        isValid = true;
      } 
    }
    return i;
  }
  
  public static double getDouble(Scanner keyScan, String prompt)
  {
    double d = 0;
    boolean isValid = false;

    while (isValid == false)
    {
      System.out.print(prompt);

      if (keyScan.hasNextDouble())
      {
         d = keyScan.nextDouble();
         isValid = true;
      } 
      else 
      {
         System.out.println("Error! Invalid decimal value. Try again.");
      }
 
      keyScan.nextLine();   
    } 
    return d;
   }
 
  public static double getDoubleWithinRange(Scanner keyScan, String prompt, double min, double max)
  { 
    double d = 0;
    boolean isValid = false;
    
    while (isValid == false) 
    { 
      d = getDouble(keyScan, prompt); 

      if (d <= min) 
      {
        System.out.println( "Error! Number must be greater than " + min); 
      }
      else if (d >= max)
      {
        System.out.println( "Error! Number must be less than " + max);
      }
      else 
      {
        isValid = true; 
      }
    } 
    return d;
   }
 
  public static String getRequiredString(Scanner keyScan, String prompt) 
  {
    String s = "";
    boolean isValid = false;
 
    while (isValid == false)
    {
      System.out.print(prompt); 
      s = keyScan.nextLine(); 
   
      if (s == null || s.equals(""))
      {
        System.out.println("Error! This entry is required. Try again."); 
      }
      else  
      {
        isValid = true;
      }
     }
     return s;
    } 
}

      
