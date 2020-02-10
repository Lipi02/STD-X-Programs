/**
3) Define a class named movieMagic with the following description: 

Instance variables/data members: 
int year – to store the year of release of a movie 
String title – to store the title of the movie. 
float rating – to store the popularity rating of the movie. (minimum rating = 0.0 and maximum rating = 5.0) 

Member Methods: 
(i) movieMagic(): Default constructor to initialize numeric data members to 0 and String data member to “”. 
(ii) void accept(): To input and store year, title and rating. 
(iii) void display(): To display the title of a movie and a message based on the rating as per the table below. 
RATING                                 MESSAGE TO BE DISPLAYED 
0.0 to 2.0                                  Flop 
2.1 to 3.4                                  Semi-hit 
3.5 to 4.5                                  Hit 
4.6 to 5.0                                  Super Hit 

Write a main method to create an object of the class and call the above member methods.
**/

import java.util.*;
public class movieMagic
{
  Scanner in=new Scanner (System.in);
  int year;
  String title;
  float rating;
  
  movieMagic()
  {
    year=0;
    title="";
    rating=0;
    }
    
  void accept()
  {
     System.out.println("Enter the year: ");
     year=in.nextInt();
     System.out.println("Enter the title: ");
     title=in.next();
     System.out.println("Enter the rating: ");
     rating=in.nextFloat();
     
    }
    
  void display()
  {
    System.out.println("Movie title: "+title);
    
    if(rating<=2.0)
     System.out.println("FLOP");
    else if(rating<=3.4)
     System.out.println("SEMI-HIT");
    else if(rating<=4.5)
     System.out.println("HIT");
    else
     System.out.println("SUPER HIT");
   }
   
  public static void main(String args[])
  {
     movieMagic ob=new movieMagic();
     ob.accept();
     ob.display();
  }
}
/**Description Table:
  VARIABLE       DATA TYPE        DESCRIPTION
  year           int            - to store year
  title          String         - to store title of movie
  rating         float          - to store rating of movie
 */