package week1_assignments;
import java.util.Scanner;
public class Week1_assignment_2_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Insert Scanner Object
        Scanner input = new Scanner(System.in);
        
        //Prompt the user to enter a number in pounds
        System.out.print("Please enter a number in pounds: ");
        double pounds = input.nextDouble();
        
        //Compute the kilograms from pounds 
        double kilograms = pounds * 0.454;
        
        System.out.println(pounds + " pounds is " + kilograms + " kilograms" );

	}

}
