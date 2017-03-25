/*CST-105
 *Robert C Wagner
 *Week2 Assignments
 *
 *(Financial application: compare loans with various interest rates) Write a program 
that lets the user enter the loan amount and loan period in number of years and displays 
the monthly and total payments for each interest rate starting from 5% to 8%, with an
increment of 1/8.     
 *
 *
 **/
package WeekFourAssignments;

import java.util.Scanner;

public class CampareLoans_5_21 {
    public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		
		System.out.print("Enter the loan Amount: ");
		double loan = input.nextDouble();
		
		System.out.print("Loan period in years: ");
		int years = input.nextInt();
		
		System.out.println("\nInterest Rate" + "\t\t Monthly Payment" + "\t\tTotal Payment");
		for (double interest = 5.0; interest <= 8.0; interest = interest + 0.125) {
			
			double monthlyInterestRate = interest / 1200;
			double monthlyPayment = loan * monthlyInterestRate / 
					(1 - 1/Math.pow(1 + monthlyInterestRate, years * 12));
			double totalPayment = monthlyPayment * years * 12;
			
                        
			System.out.printf("\n%4.2f",interest );
			System.out.printf("%27.2f",monthlyPayment);
			System.out.printf("%33.2f\t",totalPayment);
                        
		}
			
	}
}


