import java.util.Scanner;

/**
 *  Created by User on 30.11.2016.
 */
public class Exercise31 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the exchange rate from dollars to RMB: ");
        double exchangeRate = scan.nextDouble();
        System.out.print("\nEnter 0 to convert dollars to RMB and 1 vice versa: ");
        int convertion = scan.nextInt();
        System.out.print("Enter the dollar amount: ");
        double amount = scan.nextDouble();

        switch (convertion) {
            case 0: System.out.println("$" + amount + " is " + (amount * exchangeRate) + " yuan" ); break;
            case 1: System.out.println(amount + " yuan is " + ((int) ((amount / exchangeRate) * 100) / 100.00 + 0.01) + " dollars" ); break;
        }

    }
}
