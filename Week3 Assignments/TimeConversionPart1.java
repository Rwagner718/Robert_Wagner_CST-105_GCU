/*CST-105
 *Robert C Wagner
 *Week3 Assignments
 *
 *Write a program that will prompt the user to enter an hour in the 24-hour format 
and print it in the 12-hour format. Example, 18 prints 6pm.
 *
 *This assignment requires students to convert data through the use of a formatter 
class and the use of upcasting and downcasting.
 **/
package week3.assignments;

/*import java.util.Formatter;
import java.util.Locale;
import java.util.Scanner;

public class TimeConversionPart1 {
    public static void main(String [] args){
       Scanner input = new Scanner(System.in);  
      
      System.out.print("Enter an hour in 24 hour format: ");
      int time = input.nextInt();
       
    }
}
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
   public static void main(String[] args) {
      Date date = new Date();
      SimpleDateFormat sdf = new SimpleDateFormat("h");
      System.out.println("hour in h format : " + sdf.format(date));
   }
}*/


import java.util.Scanner;


public class TimeConversionPart1 {
   public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.print("Enter the hour is 24 Hour format: ");
       int hour = input.nextInt();
                   
       if(hour <= 12){
           System.out.println(hour + " a.m.");
       }
       else {
           System.out.println(hour - 12 + " p.m.");
       }
     
   }
}
