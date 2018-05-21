import java.util.Scanner;

/**
 *  Created by User on 24.12.2016.
 */
public class Example36 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of sides: ");
        int n = scan.nextInt();
        System.out.print("Enter the side: ");
        double side = scan.nextDouble();
        System.out.println(area(n, side));
    }

    public static double area(int n, double side) {
        return (n * side * side)  / (4 * (Math.tan(Math.PI / n)));
    }
}
