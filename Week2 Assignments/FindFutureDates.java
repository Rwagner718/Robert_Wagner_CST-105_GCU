package WeekTwoAssignments;

/*CST-105
 *Robert C Wagner
 *Week2 Assignments
 *
 *(Find future dates) Write a program that prompts the user to enter an 
 *integer for today’s day of the week (Sunday is 0, Monday is 1, …, and 
 *Saturday is 6). Also prompt the user to enter the number of days after 
 *today for a future day and display the future day of the week .
 *
 * 
 */
import java.util.Scanner;
public class FindFutureDates {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter today's day (0-Monday, 1-Tuesday... 6-Sunday: ");
			int day = input.nextInt();
			
													
		System.out.print("Please enter the number of days elapsed since today: ");
			int days = input.nextInt();
			int sum = (day + days) % 7;
			
			String sumString2 = null;
			String sumString1 = null;
			
				if(day == 0)
					sumString1 = "Sunday";
				if(day == 1)
					sumString1 = "Monday";
				if(day == 2)
					sumString1 = "Tuesday";
				if(day == 3)
					sumString1 = "Wednesday";
				if(day == 4)
					sumString1 = "Thursday";
				if(day == 5)
					sumString1 = "Friday";
				if(day == 6)
					sumString1 = "Saturday";
															
				if(sum == 0)
					sumString2 = "Sunday";
				if(sum == 1)
					sumString2 = "Monday";
				if(sum == 2)
					sumString2 = "Tuesday";
				if(sum == 3)
					sumString2 = "Wednesday";
				if(sum == 4)
					sumString2 = "Thursday";
				if(sum == 5)
					sumString2 = "Friday";
				if(sum == 6)
					sumString2 = "Saturday";
				
			System.out.println("Today is " + sumString1 + " and the future day is " + sumString2);
				
			
							
				}	
}
