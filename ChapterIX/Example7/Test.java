package Example7;

/**
 *  Created by User on 07/04/2017.
 */
public class Test {
    public static void main(String[] args) {
        Account account = new Account(1122, 20000);
        account.setAnnualInterestRate(4.5);
        account.withdraw(2500);
        account.deposit(3000);

        System.out.println("The balance is " + account.getBalance());
        System.out.println("The monthly interest is is " + account.getMonthlyInterest());
        System.out.println("The date is " + account.getDateCreated());

    }
}
