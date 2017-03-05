package week1_assignments;

public class Week1_assignment_1_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long population = 312032486;
        double populationGrowth , yearOne , yearTwo , yearThree , yearFour , yearFive;
                
        
        populationGrowth = (60.0/7 * 60 * 24 * 365)- (60.0/13 * 60 * 24 * 365)+ (60.0/45 * 60 * 24 * 365);     
        yearOne = (population + populationGrowth) * .01;
        yearTwo = (population + (populationGrowth * 2)) * .01;
        yearThree = (population + (populationGrowth * 3)) * .01;
        yearFour = (population + (populationGrowth * 4)) * .01;
        yearFive = (population + (populationGrowth * 5)) * .01;
        
                
        System.out.println("The US population will increase each year by " + populationGrowth);
        System.out.println("Year one, the US population will be ... " + yearOne);        
        System.out.println("Year two, the US population will be ... " + yearTwo);        
        System.out.println("Year three, the US population will be ... " + yearThree);        
        System.out.println("Year four, the US population will be ... " + yearFour);        
        System.out.println("Year five, the US population will be ... " + yearFive);
                

	}

}
