package week1_assignments;

public class Week1_assignment_1_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x;
        double y;
        double top;
        double bottom;
        
        
        x = (44.5 * .55 - 50.2 * 5.9) / (3.4 * .55 - 50.2 * 2.1);
        y = (3.4 * 5.9 - 44.5 * 2.1) / (3.4 * .55 - 50.2 * 2.1);
        top = (3.4 * 2.623901496861419)+ (50.2 * 0.7087397392563978);
        bottom = (2.1 * 2.623901496861419)+ (.55 * 0.7087397392563978);
       
        
        //Robert C Wagner Programming Exercise 1.13
        System.out.println("Solve the following equation and display the value for x and y:");
        System.out.println("3.4x + 50.2y = 44.5");
        System.out.println("2.1x + .55y = 5.9");
         
        System.out.println("X = " + x);               
        System.out.println("Y = " + y);        
         
        System.out.println("Now show equation with x and y:");
        System.out.println("3.4(2.623901496861419) + 50.2(0.7087397392563978) = " + top);
        System.out.println("2.1(2.623901496861419) + .55(0.7087397392563978) = " + bottom);

	}

}
