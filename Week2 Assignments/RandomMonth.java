package WeekTwoAssignments;

/*CST-105
 *Robert C Wagner
 *Week2 Assignments
 *
 *(Random month) Write a program that randomly generates an integer 
 *between 1 and 12 and displays the English month name January, 
 *February, …, December for the number 1, 2, …, 12, accordingly.   
 *
 *
 **/

public class RandomMonth {

	public static void main(String[] args) {
		int num1 = 1 +(int)(Math.random() * 12);
		
		if(num1 == 1) {
                    System.out.println(num1 + " is January");
                }
		if(num1 == 2) {
                    System.out.println(num1 + " is February");
                }
		if(num1 == 3) {
                    System.out.println(num1 + " is March");
                }
		if(num1 == 4) {
                    System.out.println(num1 + " is April");
                }
		if(num1 == 5) {
                    System.out.println(num1 + " is May");
                }
		if(num1 == 6) {
                    System.out.println(num1 + " is June");
                }
		if(num1 == 7) {
                    System.out.println(num1 + " is July");
                }
		if(num1 == 8) {
                    System.out.println(num1 + " is August");
                }
		if(num1 == 9) {
                    System.out.println(num1 + " is September");
                }
		if(num1 == 10) {
                    System.out.println(num1 + " is October");
                }
		if(num1 == 11) {
                    System.out.println(num1 + " is November");
                }
		if(num1 == 12) {
                    System.out.println(num1 + " is December");
                
            }
		
	}

}

