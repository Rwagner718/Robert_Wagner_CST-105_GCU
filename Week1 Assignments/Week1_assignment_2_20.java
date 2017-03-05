package week1_assignments;
import java.util.Scanner;
public class Week1_assignment_2_20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
        
        System.out.print("Please enter the balance and A.P.R (e.g., 3 for 3%): ");
        float balance = input.nextFloat();
        float interestRate = input.nextFloat();          
        
        //Need to Format Consule Output using %4.5f followed by , after string and Escape Sequence \n for linefeed to place Build Success below output
        System.out.printf("The interest is %4.5f\n", + balance * (interestRate/1200));

	}

}
