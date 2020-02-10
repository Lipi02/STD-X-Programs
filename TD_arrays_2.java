/**
 2. Write a program to find transpose of a matrix.
 */
import java.util.*;
public class TD_arrays_2
{
  public static void main(String args[])
  {
    Scanner in=new Scanner (System.in);
    
    System.out.println("Enter the number of rows of matrix: ");
    int m=in.nextInt();
    
    System.out.println("Enter the number of columns of the matrix: ");
    int n=in.nextInt();
    
    int a[][]=new int[m][n];
    System.out.println("Enter the elements of the matrix one by one: ");
    for(int i=0;i<m;i++)
    {
      for (int j=0;j<n;j++)
      {
        a[i][j]=in.nextInt();
        }
    }
    
    int b[][]=new int[n][m];
    
    for(int i=0;i<m;i++)
    {
      for(int j=0;j<n;j++)
      {
        b[j][i]=a[i][j];
        }
    }
    
    System.out.println("Transpose of matrix entered: ");
    
    for(int i=0;i<n;i++)
    {
       for(int j=0;j<m;j++)
       {
         System.out.print(b[i][j]+" ");
        }
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
  b[][]           int              - transpose of matric a[][]
 */