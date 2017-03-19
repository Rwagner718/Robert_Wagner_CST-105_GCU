/*CST-105
 *Robert C Wagner
 *Week3 Assignments
 *
 *(Financial application: compute the future investment value) Write a method 
that computes future investment value at a given interest rate for a specified 
number of years. The future investment is determined using the formula in 
Programming Exercise 2.21.
Use the following method header:

public static double futureInvestmentValue(double investmentAmount, 
double monthlyInterestRate, int years)

For example, futureInvestmentValue(10000, 0.05/12, 5) returns 12833.59.
Write a test program that prompts the user to enter the investment amount 
(e.g., 1000) and the interest rate (e.g., 9%) and prints a table that displays 
future value for the years from 1 to 30, as shown below:   
 *
 *
 **/
package week3.assignments;

import java.util.Scanner;

public class FinancialApplication {
     public static void main(String[] Strings) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the amount that was invested: ");
        double invest = input.nextDouble();

        System.out.print("Enter interest rate: ");
        double interest = input.nextDouble() / 100;

        
        System.out.printf("\n%3s%20s\n", "Years", "\t Future Value");
        for (int i = 1; i <= 30; i++) {

            System.out.printf("%-4d%20.2f\n", i, futureInvestmentValue(invest, 
                    interest / 12, i));


        }

    }

    public static double futureInvestmentValue
            (double invest, double interest, int years) {

        return invest *  Math.pow((1 + interest), (years * 12));
    }
}

