/**
 1. Write a program to check Symmetric matrix.
*/
import java.util.*;
public class TD_array_1
{
  public static void main(String args[])
  {
    Scanner in=new Scanner (System.in);
    
    System.out.println("Enter the number of rows (or columns) of the square matrix: ");
    int n=in.nextInt();
    int a[][]=new int[n][n];
    int at[][]=new int[n][n];
    
    System.out.println("Enter the elements of the matrix one by one: ");
    for(int i=0;i<n;i++)
    {
      for(int j=0;j<n;j++)
      {
        a[i][j]=in.nextInt();
        }
    }
    
    for(int i=0;i<n;i++)
    {
      for(int j=0;j<n;j++)
      {
        at[i][j]=a[j][i];
        }
    }
    
    System.out.println("Transpose of matrix: ");
    for(int i=0;i<n;i++)
    {
      for(int j=0;j<n;j++)
       System.out.print(at[i][j]+" ");
      System.out.println();
    }
    
    int flag=0,count=0;
    for(int i=0;i<n;i++)
    {
      for(int j=0;j<n;j++)
      {
        flag++;
        if(at[i][j]==a[j][i])
         count++;
        }
    }
    
    if(flag==count)
     System.out.println("The matrix is a symmetrical matrix.");
    }
}
/**Description Table:
   VARIABLE       DATA TYPE       DESCRIPTION
   n              int            - number rows and columns
   a[][]          int            - to store matrix
   at[][]         int            - to store transpose of a[][]
   i, j           int            - control variable
   flag           int            - number of total elements
   count          int            - number of matching elements of transpose
 */