/**
 3. Write a program to multiply two matrices.
 */
import java.util.*;
public class TD_arrays_3
{
  public static void main(String args[])
  {
    Scanner in=new Scanner (System.in);
    
    System.out.println("Enter the number of columns and rows of the 1st matrix: ");
    int m=in.nextInt();
    int n=in.nextInt();
    int a[][]=new int[m][n];
    
    System.out.println("Enter the elements of the matrix one by one: ");
    for(int i=0;i<m;i++)
    {
      for(int j=0;j<n;j++)
       a[i][j]=in.nextInt();
      System.out.println();
    }
    
    System.out.println("Enter the number of columns of the 2nd matrix: ");
    int sc=in.nextInt();
    int b[][]=new int[n][sc];
    
    System.out.println("Enter the elements of the 2nd matrix one by one: ");
    for(int i=0;i<n;i++)
    {
      for(int j=0;j<sc;j++)
       b[i][j]=in.nextInt();
      System.out.println();
    }
    
    int c[][]=new int[m][sc];
    int sum=0;
    for(int i=0;i<m;i++)
    {
      for(int k=0;k<sc;k++)
      {
      for(int j=0;j<n;j++)
       {
         sum=sum+(a[i][j]*b[j][k]);
        }
      c[i][k]=sum;
      sum=0;
     }
    }
    
    System.out.println("The product of the matrices: ");
    for(int i=0;i<m;i++)
    {
      for(int j=0;j<sc;j++)
       System.out.print(c[i][j]+" ");
      System.out.println();
    }
}
}
/**Description Table:
  VARIABLE        DATA TYPE         DESCRIPTION
  m               int              - number of rows
  n               int              - number of columns
  a[][]           int              - to store matrix
  i, j            int              - control variables
  sc              int              - number of columns of 2nd matrix
  b[][]           int              - second matrix
  c[][]           int              - product matrix
  sum             int              - each element of array c[][]
 */