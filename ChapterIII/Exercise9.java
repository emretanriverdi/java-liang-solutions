import java.util.Scanner;

/**
 *  Created by User on 30.11.2016.
 */
public class Exercise9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the first 9 digits of an ISBN as an integer:");
        int d1 = scan.nextInt();
        int d2 = scan.nextInt();
        int d3 = scan.nextInt();
        int d4 = scan.nextInt();
        int d5 = scan.nextInt();
        int d6 = scan.nextInt();
        int d7 = scan.nextInt();
        int d8 = scan.nextInt();
        int d9 = scan.nextInt();
        int check =  (((d1) + (d2 * 2) + (d3 * 3) + (d4 * 4) + (d5 * 5) + (d6 * 6) + (d7 * 7) + (d8 * 8) + (d9 * 9)) % 11);
        if (check == 10)
            System.out.println("" +(d1) + (d2) + (d3) + (d4) + (d5) + (d6) + (d7) + (d8) + (d9) + "X");
        else
            System.out.println("" + (d1) + (d2) + (d3) + (d4) + (d5) + (d6) + (d7) + (d8) + (d9) + check);
    }
}
