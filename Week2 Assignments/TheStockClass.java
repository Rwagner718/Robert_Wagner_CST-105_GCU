package WeekTwoAssignments;

/*CST-105
 *Robert C Wagner
 *Week2 Assignments
 *
 *(TheStockclass) Following the example of the Circle class in Section 9.2, 
 *design a class named Stock that contains:    
 * ■ A string data field named symbol for the stock’s symbol. 
 * ■ A string data field named name for the stock’s name. 
 * ■ A double data field named previousClosingPrice that stores the 
 * stock price for the previous day. 
 * ■ A double data field named currentPrice that stores the stock 
 * price for the current time. 
 * ■ A constructor that creates a stock with the specified symbol and name. 
 * ■ A method named getChangePercent() that returns the percentage 
 * changed from previousClosingPrice to currentPrice. 
 * 
 * Draw the UML diagram for the class and then implement the class. 
 * Write a test program that creates a Stock object with the stock 
 * symbol ORCL, the name Oracle Corporation, and the previous closing 
 * price of 34.5. Set a new current price to 34.35 and display the 
 * price-change percentage. 
 *
 *
 **/

public class TheStockClass {

	public static void main(String[] args) {
					
			Stock stock = new Stock("ORCL", "Oracle Corporation");
			stock.setPreviousClosingPrice(34.5);
			stock.setCurrentPrice(34.35);
			
			System.out.println("Stock name: " + stock.getName());
			System.out.println("Stock symbol: " + stock.getSymbol());
			System.out.printf("Price-change percentage: %.2f%%\n",
				stock.getChangePercent());
		}
	}
class Stock {
		
	private String symbol;                 
	private String name;                  
	private double previousClosingPrice;	 
	private double currentPrice;				

	Stock(String newSymbol, String newName) {
		symbol = newSymbol;
		name = newName;
	}

	double getChangePercent() {
		return ((getCurrentPrice() - getPreviousClosingPrice()) / 
					getPreviousClosingPrice()) * 100;
	}

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the previousClosingPrice
     */
    public double getPreviousClosingPrice() {
        return previousClosingPrice;
    }

    /**
     * @param previousClosingPrice the previousClosingPrice to set
     */
    public void setPreviousClosingPrice(double previousClosingPrice) {
        this.previousClosingPrice = previousClosingPrice;
    }

    /**
     * @return the currentPrice
     */
    public double getCurrentPrice() {
        return currentPrice;
    }

    /**
     * @param currentPrice the currentPrice to set
     */
    public void setCurrentPrice(double currentPrice) {
        this.currentPrice = currentPrice;
    }

    /**
     * @return the symbol
     */
    public String getSymbol() {
        return symbol;
    }

    /**
     * @param symbol the symbol to set
     */
    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }
}