import java.util.Scanner;

/**
 *  Created by User on 3.12.2016.
 */
public class Example16 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number.");
        double number = scan.nextDouble();
        for (int i = 2; i <= number ; i++) {
            if (number % i == 0) {
                number = number / i;
                System.out.print(i + " ");
                i--;
            }
        }
    }
}