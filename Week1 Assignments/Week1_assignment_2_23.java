package week1_assignments;
import java.util.Scanner;
public class Week1_assignment_2_23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
        
        System.out.print("Please enter the distance to your destination: ");
        float destination = input.nextFloat();
        
        System.out.print("Enter the miles per gallon of the vehicle you are driving: ");
        float mpg = input.nextFloat();   
        
        System.out.print("Now enter the price per gallon of gas in your area: ");
        float gasCost = input.nextFloat();
        
        //Need to Format Consule Output using %4.2f followed by , after string and Escape Sequence \n for linefeed to place Build Success below output
        System.out.printf("This trip will cost $%4.2f\n" , +  (destination / mpg) * gasCost);
        

	}

}
