package Example17;

import java.util.Scanner;

/**
 * Created by User on 26/05/2017.
 */
public class Test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the first complex number: ");
        double real1 = scan.nextDouble();
        double imaginary1 = scan.nextDouble();
        Complex complex1 = new Complex(real1, imaginary1);
        System.out.print("Enter the second complex number: ");
        double real2 = scan.nextDouble();
        double imaginary2 = scan.nextDouble();
        Complex complex2 = new Complex(real2, imaginary2);

        System.out.println("\n(" + complex1 + ")" + " + " + "(" + complex2 + ")" + " = " + complex1.add(complex2));
        System.out.println("(" + complex1 + ")" + " - " + "(" + complex2 + ")" + " = " + complex1.substract(complex2));
        System.out.println("(" + complex1 + ")" + " * " + "(" + complex2 + ")" + " = " + complex1.multiply(complex2));
        System.out.println("(" + complex1 + ")" + " / " + "(" + complex2 + ")" + " = " + complex1.divide(complex2));
        System.out.println("|(" + complex1 + ")| = " + complex1.abs());
        System.out.println("|(" + complex2 + ")| = " + complex2.abs());

    }
}
