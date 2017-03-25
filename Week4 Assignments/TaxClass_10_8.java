/*CST-105
 *Robert C Wagner
 *Week2 Assignments
 *
 *(Financial: theTaxclass)Programming Exercise 8.12 writes a program for 
computing taxes using arrays. Design a class named Tax to contain the follow-ing instance 
data fields: 
■ int filingStatus: One of the four tax-filing statuses: 0—single filer, 1—married filing 
jointly or qualifying widow(er), 2—married filing separately, and3—head of household. 
Use the public static constants SINGLE_FILER(0),MARRIED_JOINTLY_OR_QUALIFYING_WIDOW(ER) (
1),MARRIED_SEPARATELY (2),HEAD_OF_HOUSEHOLD (3) to represent the statuses. 
■ int[][] brackets: Stores the tax brackets for each filing status. 
■ double[] rates: Stores the tax rates for each bracket. 
■ double taxableIncome: Stores the taxable income.Provide the getter and setter methods 
for each data field and the getTax()method that returns the tax. Also provide a no-arg 
constructor and the construc-torTax(filingStatus, brackets, rates, taxableIncome).Draw 
the UML diagram for the class and then implement the class. Write a test program that 
uses the Tax class to print the 2001 and 2009 tax tables for taxable income from $50,000 
to $60,000 with intervals of $1,000 for all four statuses. The tax rates for the year 2009 
were given in Table 3.2. The tax rates for 2001 are shown in Table 10.1.  
 *

 *
 **/
package WeekFourAssignments;


public final class TaxClass_10_8 {
    

	
	private int filingStatus;
	public static final int SINGLE_FILER = 0;
	public static final int MARRIED_JOINTLY_OR_QUALIFYING_WIDOWER = 1;
	public static final int MARRIED_SEPARATELY = 2;
	public static final int HEAD_OF_HOUSEHOLD = 3;
	private int[][] brackets;
	private double[] rates;
	private double taxableIncome;


	TaxClass_10_8() {
		
		filingStatus = SINGLE_FILER;

		double[] currentYearRates = {10, 15, 25, 28, 33, 35};
		setRates(currentYearRates);

		int[][] currentYearBrackets = {
			{8350, 33950, 82250, 171550, 372950},  
			{16700, 67900, 137050, 20885, 372950}, 
																// -or qualifying widow(er)
			{8350, 33950, 68525, 104425, 186475}, 
			{11950, 45500, 117450, 190200, 372950} 
		};
		setBrackets(currentYearBrackets);

		
		taxableIncome = 0;
	}
	 
	TaxClass_10_8(int filingStatus, int[][] brackets, double[] rates, double taxableIncome) {
		setFilingStatus(filingStatus);
		setBrackets(brackets);
		setRates(rates);
		setTaxableIncome(taxableIncome);
	}

	
	public void setFilingStatus(int filingStatus) {
		this.filingStatus = filingStatus;
	}

	
	public int getFilingStatus() {
		return filingStatus;
	}

     
	public void setBrackets(int[][] brackets) {
		this.brackets = new int[brackets.length][brackets[0].length];
		for (int i = 0; i < brackets.length; i++) {
                    System.arraycopy(brackets[i], 0, this.brackets[i], 0, brackets[i].length);
		}
	}

	
	public int[][] getBrackets() {
		return brackets;
	}

	
	public void setRates(double[] rates) {
		this.rates = new double[rates.length];
		for (int i = 0; i < rates.length; i++) {
                    this.rates[i] = rates[i] / 100;
                }
	}

	
	public double[] getRates() {
		return rates;
	}

	
	public void setTaxableIncome(double taxableIncome) {
		this.taxableIncome = taxableIncome;
	}

	
	public double getTax() {
		double tax = 0, incomeTaxed = 0;
		double income = taxableIncome; 
		if (rates.length >= 2) {
			for (int i = rates.length - 2; i >= 0; i--) {
				if (income > brackets[filingStatus][i]) {
 					tax += (incomeTaxed = income - brackets[filingStatus][i]) 
 								* rates[i + 1];
					income -= incomeTaxed;
 				}
			} 
		}
		return tax += brackets[filingStatus][0] * rates[0];
        }}


