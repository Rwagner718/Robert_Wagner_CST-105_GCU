/*CST-105
 *Robert C Wagner
 *Week3 Assignments
 *
 *Write a program that will prompt the user to enter a time in a decimal format and print 
the amount of hours and minutes from the value entered.  Example, user enters 4.5 and 
application parses to 4 hours and 30 minutes.
 *
 *This assignment requires students to convert data through the use of a formatter class 
and the use of upcasting and downcasting.
 **/
package week3.assignments;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.TimeZone;

public class TimeConversionPart2 {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);  
      
      System.out.print("Enter a time in decimal: ");
      double time = input.nextDouble();
      
        long timeInSeconds = (long) Math.floor(time * 60 * 1000);
        Date date = new Date(timeInSeconds);
        SimpleDateFormat sdf = new SimpleDateFormat("mm:ss");
        sdf.setTimeZone(TimeZone.getTimeZone("GMT"));
        System.out.println(sdf.format(date));
   }
}