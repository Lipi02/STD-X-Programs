/**
 
1) A transport company charges for the parcels of its customers as per the following specifications given below: 
Class name : Atransport 

Member variables: 
String name – to store the name of the customer 
int w – to store the weight of the parcel in Kg 
int charge – to store the charge of the parcel 

Member functions: 
void accept ( ) – to accept the name of the customer, weight of the parcel from the user (using Scanner class) 
void calculate ( ) – to calculate the charge as per the weight of the parcel as per the following criteria. 

Weight in Kg                            Charge per Kg 
Upto 10 Kgs                             Rs.25 per Kg 
Next 20 Kgs                             Rs.20 per Kg 
Above 30 Kgs                            Rs.10 per 
A surcharge of 5% is charged on the bill. 

void print ( ) – to print the name of the customer, weight of the parcel, 
                 total bill inclusive of surcharge in a tabular form in the following format : 
                 Name 
                 Weight 
                 Bill amount 
Define a class with the above-mentioned specifications, create the main method, create an object and invoke the member methods.
*/

import java.util.*;
public class Atransport
{
  Scanner in=new Scanner (System.in);
  
  String name; int w, charge;
  double amt=0;
  Atransport()
  {
    name="";
    w=0;
    charge=0;
   }
    
   void accept()
   {
     System.out.println("Enter the name of the customer:");
     name=in.nextLine();
     System.out.println("Enter weight of parcel (in kg):");
     w=in.nextInt();
    }
    
   void calculate()
   {
     if(w<=10)
      charge=25*w;
     else if(w<=30)
      charge=10*25+(w-10)*20;
     else if(w>30)
      charge=10*25+20*20+(w-30)*10;
      
     amt=charge+5.0/100*charge;
    }
    
   void print()
   {
     System.out.println("Name\t\tWeight\t\tBill amount");
     System.out.println(name+"\t\t"+w+"kg\t\tRs."+amt);
    }
    
   public static void main(String args[])
   {
      Atransport ob=new Atransport();
      ob.accept();
      ob.calculate();
      ob.print();
   }
}
/**Description Table:
  VARIABLE      DATA TYPE          DESCRIPTION
  name           String           - to store name
  w               int             - to store weight of parcel
  charge          int             - to store charge of parcel
 */
