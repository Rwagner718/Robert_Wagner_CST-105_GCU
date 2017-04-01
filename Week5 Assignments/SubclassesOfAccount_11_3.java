/*CST-105
 *Robert C Wagner
 *Week5 Assignments
 *
 *(Subclasses ofAccount)In Programming Exercise 9.7, the Account class was defined 
to model a bank account. An account has the properties account number, balance, 
annual interest rate, and date created, and methods to deposit and with-draw funds. 
Create two subclasses for checking and saving accounts. A checking account has an 
overdraft limit, but a savings account cannot be overdrawn.  
 *
 **/
package WeekFiveAssignments;

/**
 *
 * @author usmcw
 */
public class SubclassesOfAccount_11_3 {
       public static void main(String[] args) {

        Account account = new Account(111, 200);
        CheckingAccount checkingAccount = new CheckingAccount(112, 250);
        SavingsAccount savingsAccount = new SavingsAccount(113, 300);

        System.out.println(account);
        System.out.println(checkingAccount);
        System.out.println(savingsAccount);
    }

}

