package WeekTwoAssignments;

/*CST-105
 *Robert C Wagner
 *Week2 Assignments
 *
 *(Geometry: two circles) Write a program that prompts the user to enter 
 *the center coordinates and radii of two circles and determines whether 
 *the second circle is inside the first or overlaps with the first, as 
 *shown in Figure 3.10. (Hint: circle2 is inside circle1 if the distance 
 *between the two centers 6=|r1 - r2| and circle2 overlaps circle1 if the 
 *distance between the two centers <= r1 + r2. Test your program to cover 
 *all cases.) 
 *
 * 
 */
import java.util.*;
import javafx.geometry.Point2D;
public class GeometryTwoCircles {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		
		System.out.print("Enter Circle1's center x-, y-coordinates, "
				+ "and radius: \n");
		double cir1x = input.nextDouble();
		double cir1y = input.nextDouble();
		double cir1r = input.nextDouble();
		System.out.print("Enter Circle2's center x-, y-coordinates, "
				+ "and radius: \n");
		double cir2x = input.nextDouble();
		double cir2y = input.nextDouble();
		double cir2r = input.nextDouble();
		
		Point2D p1 = new Point2D(cir1x, cir1y);
		Point2D p2 = new Point2D(cir2x, cir2y);
		
		double dis = p1.distance(p2);
		double totalR1 = cir1r - cir2r;
		double totalR2 = cir1r + cir2r;
		if(dis <= totalR1) System.out.println("Circle2 is inside Circle1");
		if(dis <= totalR2) System.out.println("Circle2 overlaps Circle1");
		else
			System.out.println("Circle2 does not overlap and is not inside of Circle1.");

	}

}
