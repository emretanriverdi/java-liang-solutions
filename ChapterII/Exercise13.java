import java.util.Scanner;

/**
 *  Created by User on 29.11.2016.
 */
public class Exercise13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        final double annualInterest = 1.00417;
        // Learning the value from the user
        System.out.print("Enter the monthly saving amount: ");
        double savingMoney = scan.nextDouble();
        double firstMonth = savingMoney * annualInterest;
        double secondMonth = (savingMoney + firstMonth) * annualInterest;
        double thirdMonth = (savingMoney + secondMonth) * annualInterest;
        double fourthMonth = (savingMoney + thirdMonth) * annualInterest;
        double fifthMonth = (float) (savingMoney + fourthMonth) * annualInterest;
        double sixthMonth = (float) (savingMoney + fifthMonth) * annualInterest;
        System.out.println("After the sixth month, the account value is $" + (float) sixthMonth);
    }
}
