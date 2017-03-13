package WeekTwoAssignments;

/*CST-105
 *Robert C Wagner
 *Week2 Assignments
 *
 *(Palindrome number) Write a program that prompts the user to enter a 
 *three-digit integer and determines whether it is a palindrome number. 
 *A number is palindrome if it reads the same from right to left and 
 *from left to right. Here is a sample run of this program: 
 *
 *
 * 
 */
import java.util.Scanner;
public class PalindromeNumber {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		 
		  System.out.print("Enter a three-digit integer:");
		  int number = input.nextInt();
		 
		  
		  int first = number / 100;
		  int last = number % 10;
		  if (last == first) {
		   System.out.print(number + " is a palindrome");
		  } else {
		   System.out.print(number + " is not a palindrome");
		  }
		 
		 }
		 
		}