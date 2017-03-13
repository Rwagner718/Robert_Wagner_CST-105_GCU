package WeekTwoAssignments;

/*CST-105
 *Robert C Wagner
 *Week2 Assignments
 *
 *(Game: scissor, rock, paper) Write a program that plays the popular 
 *scissor-rock-paper game. (A scissor can cut a paper, a rock can 
 *knock a scissor, and a paper can wrap a rock.) The program randomly 
 *generates a number 0,1, or 2 representing scissor, rock, and paper. 
 *The program prompts the user to enter a number 0,1, or 2 and displays 
 *a message indicating whether the user or the computer wins, loses, or 
 *draws.   
 *
 *
 **/
import java.util.*;
public class ScissorRockPaper {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		final int SCISSOR = 0;
		final int ROCK = 1;
		final int PAPER = 2;
						
		System.out.print("Enter (0) for scissor, enter (1) for rock, "
				+ "enter (2) for paper: ") ;
		int user = input.nextInt();
		int comp = (int)(Math.random() * 3);
		
		if(user == comp) {
                    System.out.println("Tie!!"); 
                } else if(user == SCISSOR && comp == PAPER) {
                    System.out.println("The computer is paper. You are scissor. you won!");
                } else if(user == ROCK && comp == SCISSOR) {
                    System.out.println("The computer is scissor. You are rock. you won!");
                } else if(user == PAPER && comp == ROCK) {
                    System.out.println("The computer is rock. You are paper. you won!");
                } else {
                    System.out.println(comp + " beats " + user + " you lose.");
                }		

	}

}
