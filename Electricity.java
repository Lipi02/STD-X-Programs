/**
 4) Define a class Electricity described as follows:

 Data Members : Name, Consumer Number, Previous Meter reading,
Present Meter reading, Units consumed.

Member methods:

(i) To accept the name, consumer no., Previous Meter reading, and
Present Meter reading.

(ii) To compute the electricity charges accordingly:
Units                            Charge
Upto 100 units              Rs.1.50 per unit
For next 100 units          Rs.1.90 per unit
For more than 200 units     Rs.2.50 per unit

(iii) To display the details including name, consumer number and other details.
Write a main method to create object of a class and call the above member methods.
 */

import java.util.*;
public class Electricity
{
   Scanner in=new Scanner (System.in);
   double charge=0;
   String Name;
   int prevmr;
   int presmr;
   int unit;
   long cono;
   void accept()
   {
    System.out.println("Enter the name: ");
    Name=in.next();
    System.out.println("Enter the consumer number: ");
    cono=in.nextLong();
    System.out.println("Enter the previous meter reading: ");
    prevmr=in.nextInt();
    System.out.println("Enter the present meter reading: ");
    presmr=in.nextInt();
    }
    
   void compute()
   {
    unit=presmr-prevmr;
    
    if(unit<=100)
      charge=1.50*unit;
    else if(unit<=200)
     charge=100*1.50+(unit-100)*1.90;
    else if(unit>200)
     charge=100*1.50+100*1.90+(unit-200)*2.50;
    }
    
   void display()
   {
    System.out.println("Name: "+Name);
    System.out.println("Consumer number: "+cono);
    System.out.println("Previous meter reading: "+prevmr);
    System.out.println("Present meter reading: "+presmr);
    System.out.println("Units consumed: "+unit);
    System.out.println("Total Amount: Rs."+charge);
    }
    
   public static void main(String args[])
   {
    Electricity ob=new Electricity();
    ob.accept();
    ob.compute();
    ob.display();
    }
}

/**Description Table
   VARIABLE       DATA TYPE      DESCRIPTION
    charge         double        - to store the charge
     Name          String        - to store name.
    prevmr          int          - previous meter reading
    presmr          int          - present meter reading
     unit           int          - units consumed
     cono           int          - consumer number
 */