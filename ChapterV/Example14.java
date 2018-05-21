import java.util.Scanner;

/**
 *  Created by User on 3.12.2016.
 */
public class Example14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the n1: ");
        int n1 = scan.nextInt();
        System.out.println("Enter the n2:");
        int n2 = scan.nextInt();

        int gcd = (n1 > n2) ? n2: n1;

        while (gcd > 0) {
            if (n1 % gcd == 0 && n2 % gcd == 0) {
                System.out.println(gcd);
                break;
            }
            gcd--;
        }

    }
}
