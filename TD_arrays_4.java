/**
 4. Write a program to find sum of each row and column of a matrix.
 */

import java.util.*;
public class TD_arrays_4
{
  public static void main(String args[])
  {
    Scanner in=new Scanner (System.in);
    System.out.println("Enter the number of rows and columns: ");
    int r=in.nextInt();
    int c=in.nextInt();
    int a[][]=new int[r][c];
    
    System.out.println("Enter the elements: ");
    for(int i=0;i<r;i++)
    {
      for(int j=0;j<c;j++)
       a[i][j]=in.nextInt();
    }
    
    for(int i=0;i<r;i++)
     {
       int sumr=0;
       int sumc=0;
       for(int j=0;j<c;j++)
       { 
           sumr=sumr+a[i][j];
           sumc=sumc+a[j][i];
        }
       System.out.println("Sum of row "+(i+1)+": "+sumr);
        System.out.println("Sum of column "+(i+1)+": "+sumc);
      }
}
}
/**Description Table:
  VARIABLE       DATA TYPE        DESCRIPTION
  r              int              - number of rows
  c              int              - number of columns
  a[][]          int              - to store matrix
  i, j           int              - control variables
  sumr           int              - sum of each row
  sumc           int              - sum of each column
 */