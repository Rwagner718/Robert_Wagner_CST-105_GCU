package week1_assignments;
import java.util.Scanner;

public class Week1_assignment_2_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
        
        System.out.print("Please enter the subtotal of purchase: ");
        double purchaseAmount = input.nextDouble();
        
        System.out.print("Please enter the sales tax: ");
        double salesTax = input.nextDouble();
        
        double tax = purchaseAmount * (salesTax / 100);
        
        //Need to Format Consule Output using %4.2f followed by , after string and Escape Sequence \n for linefeed to place Build Success below output
        System.out.printf("The gratuity is $" + tax + " for a total of $%4.2f\n", + (purchaseAmount + tax));
    }

	}


