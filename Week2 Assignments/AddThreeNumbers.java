package WeekTwoAssignments;

/*CST-105
 *Robert C Wagner
 *Week2 Assignments
 *
 *(Game: add three numbers) The program in Listing 3.1, AdditionQuiz.java, 
 *generates two integers and prompts the user to enter the sum of these 
 *two integers. Revise the program to generate three single-digit integers 
 *and prompt the user to enter the sum of these three integers.    
 *
 *
 **/
import java.util.Scanner;
public class AddThreeNumbers {

	public static void main(String[] args) {
		int number1 = (int)(Math.random() * 10);
		int number2 = (int)(Math.random() * 10);
		int number3 = (int)(Math.random() * 10);
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("What is ( " + number1 + " + " + number2 + " + " 
		+ number3 + " )? ");		
		int answer = input.nextInt();
		
		int result = number1 + number2 + number3;
		
		if(answer == result)
			System.out.println("Correct! ( " + number1 + " + " + number2 + " + " 
					+ number3 + " ) equals " + answer + "! Good Job!!");
		else 
			System.out.println("Sorry. That answer is incorrect.");
		
		
		

	}

}
