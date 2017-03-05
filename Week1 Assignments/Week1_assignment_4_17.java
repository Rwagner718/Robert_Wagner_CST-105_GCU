package week1_assignments;
import java.util.Scanner;
public class Week1_assignment_4_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
	       
	       System.out.print("Please enter a year: ");
	            int year = input.nextInt();
	                input.nextLine();
	        boolean leapYear = ((year %4 == 0 && year % 100 !=0) || (year%400 == 0));                
	        System.out.print("Please enter the first three letters of the month in upper case: ");
	            String month = input.nextLine();
	            
	                switch (month){ 
	                    case "JAN":
	                    case "MAR":
	                    case "MAY":
	                    case "JUL":
	                    case "AUG":
	                    case "OCT":
	                    case "DEC":               
	                    System.out.println(month + " " + year + " has 31 days." ); break;
	                    
	                    case "APR":
	                    case "JUN":
	                    case "SEP": 
	                    case "NOV":
	                    System.out.println(month + " " + year + " has 30 days." ); break;
	                    
	                    case "FEB":
	                        if(leapYear) {
	                            System.out.println(month + " " + year + " has 29 days." );
	       } else {
	                            System.out.println(month + " " + year + " has 28 days." );
	       } break;

	                }
	                }
	}


