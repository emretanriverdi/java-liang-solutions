package Example7;

import java.util.Scanner;

/**
 *  Created by User on 22/05/2017.
 */
public class Test {
    public static void main(String[] args) {
        Account[] accounts = setAccount();

        Scanner scan = new Scanner(System.in);

        int id = -1;
        while (true) {
            while (true) {
                System.out.print("Enter an id:");
                id = scan.nextInt();

                if ((id >= 0 && id <= 9))
                    break;

                System.out.println("\nEnter a correct id.");
            }

            while (true) {
                Account currentAccount = accounts[id];
                System.out.println("\nMain menu");
                System.out.println("1: check balance");
                System.out.println("2: withdraw");
                System.out.println("3: deposit");
                System.out.println("4: exit");

                System.out.print("Enter a choice: ");
                int choice = scan.nextInt();

                if (choice == 4)
                    break;

                if (choice == 1)
                    System.out.println("The balance is " + currentAccount.getBalance());

                if (choice == 2) {
                    System.out.print("Enter an amount to withdraw: ");
                    int withdraw = scan.nextInt();
                    currentAccount.withdraw(withdraw);
                }

                if (choice == 3) {
                    System.out.print("Enter an amount to deposit: ");
                    int deposit = scan.nextInt();
                    currentAccount.deposit(deposit);
                }
            }
        }
    }

    public static Account[] setAccount() {
        return new Account[]{new Account(0, 100), new Account(1, 100), new Account(2, 100), new Account(3, 100), new Account(4, 100), new Account(5, 100), new Account(6, 100), new Account(7, 100), new Account(8, 100), new Account(9, 100)};
    }

}
