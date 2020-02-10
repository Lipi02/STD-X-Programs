/**
2) Design a class RailwayTicket with the following description: 

Instance variables/data members: 
String name: to store the name of the customer. 
String coach: to store the type of coach customer wants to travel. 
long mobno: to store customer’s mobile number. 
int amt: to store basic amount of ticket. 
int totalamt: to store the amount to be paid after updating the original amount. 

Methods: 
void accept(): to take input for name, coach, mobile number and amount. 
void update(): to update the amount as per the coach selected. Extra amount to be added in the amount as follows: 
Type of coaches        Amount 
First_AC                700 
Second_AC               500 
Third_AC                250 
sleeper                 None 

void display(): To display all details of a customer such as name, coach, total amount and mobile number. 

Write a main() method to create an object of the class and call the above methods.
**/

import java.util.*;
public class RailwayTicket
{
  Scanner in=new Scanner (System.in);
  String name, coach;
  long mobno;
  int amt, totalamt;
  
  RailwayTicket()
  {
    name="";
    coach="";
    mobno=0;
    amt=0;
    totalamt=0;
    }
    
  void accept()
  {
     System.out.println("Enter the name: ");
      name=in.nextLine();
     System.out.println("Enter the type of coach (First_AC/Second_AC/Third_AC/sleeper) :");
     coach=in.next();
     System.out.println("Enter the mobile number: ");
     mobno=in.nextLong();
     System.out.println("Enter original amount of ticket:");
     amt=in.nextInt();
    }
  
  void update()
  {
    if(coach.equals("First_AC"))
     totalamt=700+amt;
    else if(coach.equals("Second_AC"))
     totalamt=500+amt;
    else if(coach.equals("Third_AC"))
     totalamt=250+amt;
    else if(coach.equals("sleeper"))
     totalamt=amt;
    else
     System.out.println("Error");
    }
    
  void display()
  {
     System.out.println("\tYour Ticket: ");
     System.out.println("Name: "+name);
     System.out.println("Coach: "+coach);
     System.out.println("Mobile number: "+mobno);
     System.out.println("Total Amount: Rs."+totalamt);
    }
    
  public static void main(String args[])
  {
    RailwayTicket ob=new RailwayTicket();
    ob.accept();
    ob.update();
    ob.display();
    }
}
/**Description Table:
  VARIABLE      DATA TYPE       DESCRIPTION
  name          String         - to store name
  coach         String         - to store coach type
  mobno         long           - to store mobile no.
  amt           int            - original amount
  totalamt      int            - to store total amount
 */
