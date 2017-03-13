package WeekTwoAssignments;

/*CST-105
 *Robert C Wagner
 *Week2 Assignments
 *
 *(Financial: compare costs) Suppose you shop for rice in two different 
 *packages. You would like to write a program to compare the cost. 
 *The program prompts the user to enter the weight and price of the 
 *each package and displays the one with the better price.      
 *
 * *
 **/
import java.util.*;
public class FinancialCompareCosts {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		 
		
		System.out.print("Enter weight and price for package 1: \n");
		double pack1Wt = input.nextDouble();
		double pack1Price = input.nextDouble();
		
		System.out.print("Enter weight and price for package 2: \n");
		double pack2Wt = input.nextDouble();
		double pack2Price = input.nextDouble();
		
		if(pack1Wt * 1.0 / pack1Price > pack2Wt * 1.0 / pack2Price)
			System.out.println("Package 1 has a better price.");
		if(pack1Wt * 1.0 / pack1Price == pack2Wt * 1.0 / pack2Price)
			System.out.println("The two packages have the same price.");
		else
			System.out.println("Package 2 has a better price.");
		
	}

}
