package WeekTwoAssignments;

/*CST-105
 *Robert C Wagner
 *Week2 Assignments
 *
 *Programming Exercise: 
 *(Algebra: solve 2*2linear equations) A linear equation can 
 *be solved using Cramer’s rule given in Programming Exercise 1.13. 
 *Write a program that prompts the user to enter a,b,c,d,e, and f 
 *and displays the result. If ad-bc is 0, report that “The equation 
 *has no solution.”  
 *
 **/

import java.util.Scanner;
public class Solve2X2LinearEquations {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double x,y,ad,bc, adbcTotal;
		
		System.out.print("Enter a number for each variable: (a, b, c, d, e, f): \n");
		 double a = input.nextDouble();
		 double b = input.nextDouble();
		 double c = input.nextDouble();
		 double d = input.nextDouble();
		 double e = input.nextDouble();
		 double f = input.nextDouble();
		 
		 x = ((e * d) - (b * f)) / ((a * d) - (b * c));
		 y = ((a * f) - (e * c)) / ((a * d) - (b * c));
		 ad = (a * d);
		 bc = (b * c);
		 adbcTotal = (ad - bc);
				
		if(adbcTotal == 0 ) {
                    System.out.println("The equation has no solution.");
                } else {
                    System.out.println("x is " + x + " and y is " + y);
                }
		
		
		
		 
		
		
		

	}

}