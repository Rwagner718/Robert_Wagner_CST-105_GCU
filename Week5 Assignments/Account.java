/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WeekFiveAssignments;

/**
 *
 * @author usmcw
 */
class Account {

    Account(int par, int par1) {
    }
    public static void main(String[] args) {

        Account account = new Account(1122, 20000);
        account.setAnnualInterestRate(4.5);

        System.out.println("Account ID: " + account.getId());
        System.out.println("Account Balance: " + account.getBalance());

        System.out.println("Withdrawing $2,500...");
        account.withdraw(2500);

        System.out.println("Depositing $3,000...");
        account.deposit(3000);

        System.out.println("Displaying updated info.");
        System.out.println("Account ID: " + account.getId());
        System.out.println("Account Balance: " + account.getBalance());
        System.out.println("Monthly interest rate: " + account.getMonthlyInterestRate());
        System.out.println("Date account was created: " + account.getDateCreated());


    }

    Account(String george, int i, int i0) {
       
    }

    void setAnnualInterestRate(double d) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private String getId() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    String getBalance() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void withdraw(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void deposit(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private String getMonthlyInterestRate() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private String getDateCreated() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    String getName() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    String getAnnualInterestRate() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    Object getTransactions() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

