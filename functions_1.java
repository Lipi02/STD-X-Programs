/**
 1)Write a program in java to perform the following 
   operations by using functions.
(i)generate(int n ) : To use the function with an integer 
     type argument to generate Fibonacci series up to a given value(n).
(ii) generate(int x, int y): To use the function with two integer 
   arguments and print the prime nos. between the limits.
 */

import java.util.*;
public class functions_1
{
  public void generate(int n)
  {
    System.out.println("Fibonacci series upto "+n+": ");
    int a=0, b=1, c=0;
    System.out.print(a+", "+b);
    for(int i=1;c<=n;i++)
    {
      c=a+b;
      System.out.print(", "+c);
      a=b;
      b=c;
    }
    }
    
  public void generate(int x, int y)
  {
    int flag=0;
    System.out.println("Prime numbers between "+x+" and "+y+" are: ");
    for(int i=x;i<=y;i++)
    {
      for(int j=2;j<i;j++)
      {
        if(i%j==0)
         flag++;
        }
      if(flag==0)
       System.out.print(i+", ");
      flag=0;
    }
    }
}

/**
Description Table:
   VARIABLE         DATA TYPE         DESCRIPTION
     n                int            - to store the inputted number
     a                int            - to store the first term
     b                int            - to store second term
     c                int            - to store thord term
   i, j               int            - control variables
     x                int            - lower limit
     y                int            - upper limit
   flag               int            - no. of factors
*/