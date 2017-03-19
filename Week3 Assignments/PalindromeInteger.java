/*CST-105
 *Robert C Wagner
 *Week3 Assignments
 *
 *(Palindrome integer) Write the methods with the following headers

// Return the reversal of an integer, i.e., reverse(456) returns 654
public static int reverse(int number)

// Return true if number is a palindrome
public static boolean isPalindrome(int number)

Use the reverse method to implement isPalindrome. A number is a palin-drome if its reversal 
is the same as itself. Write a test program that prompts the user to enter an integer and 
reports whether the integer is a palindrome.    
 *
 *
 **/


package week3.assignments;

import java.util.Scanner;

public class PalindromeInteger {
	/** Main Method
     * @param args */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 

		
		System.out.print("Enter an integer: ");
		int num = input.nextInt();

		if (num != reverse(num)) {
                    System.out.println(num + " is not a palindrome.");
                } else {
                    System.out.println(num + " is a palindrome.");
                }
	}

        /** 
     * @param num
     * @return  */
	public static boolean isPalindrome(int num) {
		return num == reverse(num);
	}

	/** 
     * @param num
     * @return  */
	public static int reverse(int num) {
		String reverseNum = ""; 	
		String n = num + ""; 
		
		for (int i = n.length() - 1; i >= 0; i--) {
			reverseNum += n.charAt(i);
                        
		}
                
                System.out.println(num + " reversed is: " + Integer.parseInt(reverseNum));
		return Integer.parseInt(reverseNum); 
	}
}
