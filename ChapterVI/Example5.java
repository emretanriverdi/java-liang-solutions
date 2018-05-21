import java.util.Scanner;

/**
 *  Created by User on 15.12.2016.
 */
public class Example5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        double x = scan.nextDouble();
        double y = scan.nextDouble();
        double z = scan.nextDouble();
        displaySortedNumbers(x, y, z);
    }

    public static void displaySortedNumbers(double num1, double num2, double num3) {
        if (num1 >= num2 && num1 >= num3) {
            if (num2 >= num3)
                System.out.println("The numbers in an increasing order is " + num3 + ", " + num2 + ", " + num1);
            else System.out.println("The numbers in an increasing order is " + num2 + ", " + num3 + ", " + num1);
        }
        else if (num2 >= num1 && num2 >= num3) {
            if (num1 >= num3)
                System.out.println("The numbers in an increasing order is " + num3 + ", " + num1 + ", " + num2);
            else System.out.println("The numbers in an increasing order is " + num1 + ", " + num3 + ", " + num2);
        }
        else if (num3 >= num1 && num3 >= num2) {
            if (num1 >= num2)
                System.out.println("The numbers in an increasing order is " + num2 + ", " + num1 + ", " + num3);
            else System.out.println("The numbers in an increasing order is " + num1 + ", " + num2 + ", " + num3);
        }
        if (num1 == num2 && num1 == num3)
            System.out.println("The numbers are equal. ");
    }
}
