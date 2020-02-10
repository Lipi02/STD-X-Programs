/**
4) Define a class taximeter having the following description:

Data members/instance variables
int taxino - to store taxi number
String name - to store passenger's name
int km - to store number of kilometres travelled

Member functions:
taximeter() -- constructor to initialize taxino to 0, name to “ ”and b to 0.
input() - to store taxino,name,km
calculate() - to calculate bill for a customer according to given conditions

kilometers travelled(km)               Rate/km
      1 km                              Rs 25
     1 km 6                             Rs 10
    6 < km 12                           Rs 15
   12 < km 18                           Rs 20
     >18 km                             Rs 25

display()- To display the details in the following format:
Taxino    Name    Kilometres travelled     Bill amount
  -         -               -                  -
Create an object in the main method and call all the above methods in it.
 */

import java.util.*;
public class taximeter
{
  Scanner in=new Scanner (System.in);
  int taxino, km;
  String name;
  double amt;
  taximeter()
  {
    taxino=0;
    name="";
    km=0;
    }
  
  void input()
  {
    System.out.println("Enter the taxi number: ");
    taxino=in.nextInt();
    System.out.println("Enter the name: ");
    name=in.next();
    System.out.println("Enter the number of kilometers travelled: ");
    km=in.nextInt();
    }
    
  void calculate()
  {
      if(km==1)
       amt=km*25;
      else if(km<=6)
       amt=1*25+(km-1)*10;
      else if(km<=12)
       amt=1*25+5*10+(km-6)*15;
      else if(km<=18)
       amt=1*25+5*10+6*15+(km-12)*20;
      else if(km>18)
       amt=1*25+5*10+6*15+6*20+(km-18)*25;
    }
    
  void display()
  {
    System.out.println("Taxi no.\t\tName\t\tKilometers travelled\t\tBillamount");
    System.out.println(taxino+"\t\t\t"+name+"\t\t\t"+km+"\t\t\tRs."+amt);
    
    }
    
  public static void main(String args[])
  {
     taximeter ob=new taximeter();
     ob.input();
     ob.calculate();
     ob.display();
    }
}
/**Description Table:
  VARIABLE        DATA TYPE       DESCRIPTION
  taxino          int            - to store taxi number
  km              int            - to store distance in km
  name            String         - to store name
  amt             double         - to store final amount
 */