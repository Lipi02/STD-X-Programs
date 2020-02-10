/**
 6. Write a program to enter an odd no. and print the following pattern:
Sample Input : Enter the last odd no. 9
Sample Output:
1 3 5 7 9
3 5 7 9 1
5 7 9 1 3
7 9 1 3 5
9 1 3 5 7
 */
 
import java.util.*;
public class while_loop_5
{
 public static void main(String args[])
 {
   Scanner in=new Scanner(System.in);
   System.out.print("Enter the last odd no.: ");
   int r=in.nextInt();
   System.out.println();
   int count=0;
   System.out.println("Pattern: ");
   int i=1;
   while(i<=r)
   {
     count=0;
     int p=1;
     for(int j=i;j<=r;j=j+2)
     { 
       count=count+2;
       System.out.print(j+" ");
     }
     for(int y=1;y<=r-count;y=y+2)
     {
       System.out.print(p+" ");
       p=p+2;
     }
     System.out.println();
     i=i+2;
   }
 }   
}

/** Description Table:
 
 *   VARIABLE                      DATA TYPE                        DESCRIPTION
 
 *      r                         integer(int)                 - to store the inputted last odd number.
 *    count                       integer(int)                 - to count the number of iterations of the first loop.
 *      i                         integer(int)                 - to use as control variable of the outer loop.
 *      p                         integer(int)                 - to store odd numbers and print them.
 *      j                         integer(int)                 - to use as control variable for the iner first loop.
 *      y                         integer(int)                 - to use as control variable for the inner second loop.
 */