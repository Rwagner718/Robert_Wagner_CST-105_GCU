/*CST-105
 *Robert C Wagner
 *Week3 Assignments
 *
 *(Fibonacci numbers) Rewrite the fib method in Listing 18.2 using iterations.
Hint: To compute fib(n) without recursion, you need to obtain fib(n - 2)andfib(n - 1) first. 
Let f0 and f1 denote the two previous Fibonacci numbers.    
 *
 *
 **/
package week3.assignments;

import java.util.Scanner;
public class FibonacciNumbers {
    public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);

		// Prompt the user to enter an index
		System.out.print("Enter an index for a Fibonacci number: ");
		int index = input.nextInt();

		// Find and display the Fibonacci number
		System.out.println("The Fibonacci number at index " 
			+ index + " is " + fib(index));

	}

	/** The method for finding the Fibonacci number */
	public static long fib(long index) {
		long f0 = 0; // For fib(0)         
		long f1 = 1; // For fib(1)
		long currentFib = 0;  

		if (index == 0)
			return f0;
		else if (index == 1)
			return f1;       
      else {
			for (int i = 1; i < index; i++) {
				currentFib = f0 + f1;     
				f0 = f1;                  
				f1 = currentFib;          
			} 
			return currentFib;                            
      }                       
	}
} 

