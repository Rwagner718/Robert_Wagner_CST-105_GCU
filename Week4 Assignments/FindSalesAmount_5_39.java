/*CST-105
 *Robert C Wagner
 *Week2 Assignments
 *
 *(Financial application: find the sales amount) You have just started a sales 
job in a department store. Your pay consists of a base salary and a commission. 
The base salary is $5,000.
 
Note that this is a graduated rate. The rate for the first $5,000 is at 8%, the next $5000 
is at 10%, and the rest is at 12%. If the sales amount is 25,000, the commission is 
5,000*8%+5,000*10%+15,000*12%=2,700. 

 Your goal is to earn $30,000 a year. Write a program that finds the minimum sales you have to 
generate in order to make $30,000. 
 *

 *
 **/
package WeekFourAssignments;

public class FindSalesAmount_5_39 {
    public static void main(String[] args) {
		
		final double TARGET_COMMISSION = 30000; 
		double salesAmount, comm, balance;	
		salesAmount = 0;					
                                
		do {	
			balance = 0;
                        comm = 0;	
			salesAmount += 0.01;			
			
			if (salesAmount > 10000) {
                            comm += (balance = salesAmount - 10000) * 0.12;
                        }
			
			if (salesAmount > 5000) {
                            comm += (balance -= balance - 5000) * 0.10;
                        }
			
			if (salesAmount > 0) {
                            comm += balance * 0.08;
                                                   
                        }
		} while (comm < TARGET_COMMISSION);
		
		System.out.printf("Minimum sales to earn $30,000: $%.0f\n", salesAmount);
	}
}


