/**
 5) Define a class called mobike with the following description: 
 
 Instance variables/data members: 
 int bno – to store the bike’s number 
 int phno – to store the phone number of the customer 
 String name – to store the name of the customer 
 int days – to store the number of days the bike is taken on rent 
 int charge – to calculate and store the rental charge 
 
 Member methods: 
 mobike()- to initialize initialize numeric data members to 0 and String data member to “”. 
 void input( ) – to input and store the detail of the customer. 
 
 void computer( ) – to compute the rental charge 
 The rent for a mobike is charged on the following basis. 
 First five days      Rs 500 per day; 
 Next five days       Rs 400 per day 
 Rest of the days     Rs 200 per day 
 
 void display ( ) – to display the details in the following format: 
 Bike No. 
 PhoneNo. 
 No. of days 
 Charge
 */

import java.util.Scanner;
public class mobike
{
  Scanner in=new Scanner (System.in);
  int bno, days, charge;
  long phno;
  String name;
  
  mobike()
  {
    bno=0;
    phno=0;
    days=0;
    charge=0;
    name="";
    }
    
  void input()
  {
    System.out.println("Enter Customer Details:\nName: ");
    name=in.next();
    System.out.println("Phone number: ");
    phno=in.nextLong();
    System.out.println("No. of days to take bike on rent: ");
    days=in.nextInt();
    System.out.println("Bike number: ");
    bno=in.nextInt();
        }
        
  void computer()
  {
    if(days<=5)
     charge=500*days;
    else if(days<=10)
     charge=5*500+(days-5)*400;
    else if(days>10)
     charge=5*500+5*400+(days-10)*200;
    }
    
  void display()
  {
    System.out.println("RECEIPT: ");
    System.out.println("Bike number: "+bno);
    System.out.println("Phone number: "+phno);
    System.out.println("No. of days: "+days);
    System.out.println("Charge: Rs."+charge);
    }
    
  public static void main(String args[])
  {
     mobike ob=new mobike ();
     ob.input();
     ob.computer();
     ob.display();
    }
}
/**Description Table
  VARIABLE         DATA TYPE        DESCRIPTION
  bno              int             - to store bike number
  phno             int             - to store phone number
  days             int             - to store number of days
  charge           int             - to store the charge
  name             String          - to store the name
 */