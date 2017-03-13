package WeekTwoAssignments;

/*CST-105
 *Robert C Wagner
 *Week2 Assignments
 *
 *(Cost of shipping) A shipping company uses the following function 
 *to calculate the cost (in dollars) of shipping based on the weight of 
 *the package (in pounds). 
 *
 *Write a program that prompts the user to enter the weight of the 
package and display the shipping cost. If the weight is greater than 50, 
display a message “the package cannot be shipped.”     
 *
 *
 **/
import java.util.*;
public class CostOfShipping {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the weight of the package you wish to ship: ");
		double weight = input.nextDouble();
		  double cost = 0;
		 
		  if (weight > 0 && weight <= 1) {
		   cost = 3.50;
		   System.out.print("The cost of shipping is $" + cost);
		  } 
		  else if (weight > 1 && weight <= 3) {
		   cost = 5.50;
		   System.out.print("The cost of shipping is $" + cost);
		  } 
		  else if (weight > 3 && weight <= 10) {
		   cost = 8.50;
		   System.out.print("The cost of shipping is $" + cost);
		  } 
		  else if (weight > 10 && weight <= 20) {
		   cost = 10.50;
		   System.out.print("The cost of shipping is $" + cost);
		  }
		 
		  else 
		   System.out.print("the package cannot be shipped.");
		   System.exit(0);
		  }
			 
		 
		 
		 
		}
