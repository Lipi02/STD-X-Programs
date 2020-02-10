/**
 4. Write a Program in Java to input a list of names and display first name with 
 initials in alphabetic order. 
 
 SAMPLE INPUT             SAMPLE OUTPUT 
 Jemyl Aby                  ANJU S. A. 
 Renju Raju Zack            ANNA G. 
 Anju Sara Abraham          DEENA S.
 Deena Sathish              JEMYL A.
 Anna George                RENJU R. Z.
 
 The school office keeps the records of all the students of a class by entering Admission Number and 
 the Name of the students. 
 Write a program to store all the names along with the admission numbers. 
 Now, enter a name or admission number of a student and search whether it is present in the list. 
 If it is present then display the name along with the admission number, 
 otherwise, display an appropriate message using 'Linear search' technique.
 
 (I have used BufferedReader since nextLine() function in Scanner causes certain errors.)
 */
import java.io.*;
public class arrays_4
{
   public static void main(String args[]) throws IOException
   {
     InputStreamReader read=new InputStreamReader(System.in);
     BufferedReader in=new BufferedReader(read);
     
     System.out.println("Enter the number of students: ");
     int n=Integer.parseInt(in.readLine());
    
     
     String name[]=new String [n]; String name2[]=new String[n];
     int admno[]=new int[n];
 
     System.out.println("Enter the admission number and name one by one: ");
     for(int i=0;i<n;i++)
     {
       admno[i]=Integer.parseInt(in.readLine());
       name[i]=in.readLine();
        }
        
     System.out.println("Names with initials in ascending order: ");
     for(int i=0;i<n;i++)
     {
       int len=name[i].length();
       name[i]=name[i].toUpperCase(); name[i]=name[i].trim();
       
       String fn=name[i].substring(0, name[i].indexOf(' '));
       String ln=" "+name[i].substring(name[i].indexOf(' ')), init="";
       int len2=ln.length();
        for(int k=0;k<len2;k++)
        {
           char c2=ln.charAt(k);
           if(c2==' ')
            init=init+ln.charAt(k+1)+". ";
        }
       name2[i]=fn+init;  
        }
        
     for(int i=0;i<n-1;i++)
     {
       for(int j=0;j<n-i-1;j++)
       {
          if(name2[j].compareToIgnoreCase(name2[j+1])>0)
           {
             String temp=name2[j];
             name2[j]=name2[j+1];
             name2[j+1]=temp;
             
             int temp2=admno[j];
             admno[j]=admno[j+1];
             admno[j+1]=temp2;
             
             String temp3=name[j];
             name[j]=name[j+1];
             name[j+1]=temp3;
           }
        }
        }
        
     for(int i=0;i<n;i++)
     {
       System.out.println(name2[i]);
        }
        
     System.out.println("This program checks whether a name or admission number is present in the list.");
     System.out.println("Enter 1 to search name and 2 to search admission number: ");
     int ch=Integer.parseInt(in.readLine());
     int count=0;
     switch(ch)
     {
       case 2:
       System.out.println("Enter the name: ");
       String search=in.readLine();
       
       for(int i=0;i<n;i++)
        {
          if(name[i].equalsIgnoreCase(search))
         {
           System.out.println("Search successful.");
           System.out.println("Name: "+name[i]);
           System.out.println("Admission number: "+admno[i]);
           count++;
            }
        }
       if(count==0)
        System.out.println("Search unsuccessful. Entered name is not present.");
        break;
       
       case 1:
       System.out.println("Enter the admission number: ");
       int searchad=Integer.parseInt(in.readLine());
       
       for(int i=0;i<n;i++)
        {
          if(admno[i]==searchad)
         {
           System.out.println("Search successful.");
           System.out.println("Name: "+name[i]);
           System.out.println("Admission number: "+admno[i]);
           count++;
            }
        }
       if(count==0)
        System.out.println("Search unsuccessful. Entered admission number not present.");
       break;
       
       default:
       System.out.println("Wrong choice!");
    }
  }
}
/**Description Table:
  VARIABLE        DATA TYPE        DESCRIPTION
  n               int            - number of students
  name[]          String         - to store the names
  name2[]         String         - to store first names with initials
  admno[]         int            - to store admission numbers
  i, k, j         int            - control variables
  len             int            - length of each name
  len2            int            - length of name after first name
  c2              char           - extract characters after first name
  temp, temp3     String         - helping variable to switch positions
  temp2           int            - helping variable to switch positions
  ch              int            - to store choice of user
  count           int            - to see if there is at least one matching name or admission number
  search          String         - to store the name to be searched
  searchad        int            - to store admission number to be searched
 */