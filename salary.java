/**
 2)Write a program by using a class with the following specifications:

 Class name : salary

Data members : double basic, DA, HRA, PF, NetPay, GrossPay; String name;

Member functions:

void input() : to input the name and basic pay

void compute() : to find the following
DA = 25% of the basic
HRA = 15% of the basic
PF = 8.33% of the basic
NetPay = basic + DA + HRA−PF
GrossPay = NetPay – Tax

double tax(double n) : to find the tax amount
If the Net Pay is above Rs. 3,00,000/- per annum then income tax at the rate 
of 5% of the annual salary exceeding Rs. 3,00,000/- is deducted on monthly basis at source.

void display() : to display the pay slip
 */

import java.util.*;
public class salary
{
   double basic, DA, HRA, PF, NetPay, GrossPay, tax=0;
   String name;
   Scanner in=new Scanner (System.in);
   public void input()
   {
     System.out.println("Enter the name: ");
     name=in.next();
     System.out.println("Enter the basic pay: ");
     basic=in.nextDouble();
    }
    
   void compute()
   {
     DA=25.0/100*basic;
     HRA=15.0/100*basic;
     PF=8.33/100*basic;
     NetPay=basic+DA+HRA-PF;
     double Tax=tax(NetPay);
     GrossPay=NetPay-Tax;
     
    }
    
   double tax(double n)
   {
     tax=0;
     n=n*12;
     if(n>300000)
     {
        tax=((n-300000)*5.0/100)/12.0;
        }
     return (tax);
    }
    
   void display()
   {
     System.out.println("\t\tPAY SLIP:");
     System.out.println("Name: "+name);
     System.out.println("Basic: Rs."+basic);
     System.out.println("Dearness Allowance: Rs."+DA);
     System.out.println("House Rent Allowance: Rs."+HRA);
     System.out.println("Provident Fund: Rs."+PF);
     System.out.println("Net Pay: Rs."+NetPay);
     System.out.println("Income Tax: Rs."+tax);
     System.out.println("Gross Pay: Rs."+GrossPay);
    }
    
   public void main(String args[])
   {
     input();
     compute();
     display();
    }
}

/**
 Description Table:
   VARIABLE       DATA TYPE      DESCRIPTION
    basic          double        - basic pay
     DA            double        - dearness allowance
    HRA            double        - house rent allowance
     PF            double        - provident fund
   NetPay          double        - net pay
   GrossPay        double        - gross pay (final)
    tax            double        - income tax
    name           String        - name of employee
 */