import java.util.Scanner;

/**
 *  Created by User on 29.11.2016.
 */
public class Exercise5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the subtotal and gratuity rate.");
        double subtotal = scan.nextDouble();
        double gratuityRate = scan.nextDouble();
        double taxValue = (subtotal * gratuityRate / 100);
        double total = (subtotal + taxValue);
        System.out.println("The gratuity is $" + taxValue + " and total is $" + total);
    }
}
