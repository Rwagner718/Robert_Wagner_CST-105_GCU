package week1_assignments;
import java.util.Scanner;
public class Week1_assignment_4_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
        
        double radius = 6371.01;
               
        System.out.print("Enter point 1 (latitude and longitude separated by a space) in degrees: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        
        System.out.print("Enter point 2 (latitude and longitude separated by a space) in degrees: ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        
        //Remember to convert degrees to radians
        double x1r = Math.toRadians(x1);
        double x2r = Math.toRadians(x2);
        double y1r = Math.toRadians(y1);
        double y2r = Math.toRadians(y2);
        
        double distance = radius * Math.acos(Math.sin(x1r) * (Math.sin(x2r) * (Math.cos(x1r) * (Math.cos(x2r) * (Math.cos(y1r - y2r))))));
        
        System.out.println("The distance between the two points is: " + distance + " km");
        //Why is output different from book??

	}

}
