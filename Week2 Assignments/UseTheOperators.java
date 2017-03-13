package WeekTwoAssignments;

/*CST-105
 *Robert C Wagner
 *Week2 Assignments
 *
 *(Use the &&, || and ^ operators) Write a program that prompts the user 
 *to enter an integer and determines whether it is divisible by 5 and 6, 
 *whether it is divisible by 5 or 6, and whether it is divisible by 5 or 6, 
 *but not both. Here is a sample run of this program:     
 *
 *
 **/
import java.util.*;
public class UseTheOperators {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter an integer: ");
		int num = input.nextInt();
		
		if((num % 5 == 0) && (num % 6 == 0)) {
                    System.out.println(num + " is divisible by 5 and 6? True");
                } else {
                    System.out.println(num + " is divisible by 5 and 6? False");
                }
		if((num % 5 == 0) || (num % 6 == 0)) {
                    System.out.println(num + " is divisible by 5 or 6? True");
                } else {
                    System.out.println(num + " is divisible by 5 or 6? False");
                }
		if((num % 5 == 0) ^ (num % 6 == 0)) {
                    System.out.println(num + " is divisible by 5 or 6, but not both? True");
                } else {
                    System.out.println(num + " is divisible by 5 or 6, but not both? False");
                }	

	}

}

