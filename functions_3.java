/**
 3)Design a class to overload a function SumSeries as follows:
(i) void SumSeries(int n, double a ) – with one integer argument and one double argument to find and display the sum of the series given below:
S= 1 – a^2/3+ a^4/5 – a^6/7 . . . . . . . . . . to n terms
(ii) void SumSeries(int n) – with one integer argument to find and display the sum of the following series:
S= 1!/(1+2) + 2!/(3+4) + 3!/(5+6) +. . . . . . . . to n terms
  
 */

import java.util.*;
public class functions_3
{
  void SumSeries(int n, double a)
  {
    double sum=1;
    int p=2;
    int d=3;
    for(int i=2;i<=n;i++)
    {
       if(p%4==0)
         sum=sum-((Math.pow(a,p))/d);
       else
         sum=sum+((Math.pow(a,p))/d);
         
       p=p+2;
       d=d+2;
    }
    
    System.out.println("Sum of the series: "+sum);
    }
    
  void SumSeries(int n)
  {
    int p=1;
    double sum=0;
    for(int i=1;i<=n;i++)
    {
      int f=1;
      for(int j=1;j<=i;j++)
       f=f*j;
      
      sum=sum+(f/(p+(p+1)));
      p=p+2;
      f=1;
    }
    
    System.out.println("Sum of the series: "+sum);
    }
}
/**
 Description Table:
  VARIABLE     DATA TYPE        DESCRIPTION 
     n           int            - to store no. of terms
     a          double          - to store value of a
    sum         double          - to store sum of series
     p           int            - power of numerator
     d           int            - denominator
    i,j          int            - control variables
     f           int            - to store factorial
 */