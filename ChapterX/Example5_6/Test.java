package Example5_6;

import java.util.Scanner;

/**
 *  Created by User on 22/05/2017.
 */
public class Test {
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();

        int[] smallestFactors = new int[50];
        smallestFactors = fill(smallestFactors);

        int count = 0;
        for (int i = 2; i < 1000; i++)
            if (isPrime(i) && x % i == 0) {
                smallestFactors[count] = i;
                x = x / i;
                count++;
                i--;

                if (x == 1)
                    break;

            }

        System.out.print("It's smallest factors are: [ ");
        for (int i = smallestFactors.length - 1; i >= 0; i--) {
            if (!(smallestFactors[i] == 100003))
                System.out.print(smallestFactors[i] + " ");
        }
        System.out.print("]");

    }

    public static boolean isPrime(int value) {
        if (value == 2) return true;
        if (value % 2 == 0) return false;
        for (int i = 3; i * i < value; i += 2)
            if (value % i == 0) return false;
        return true;
    }
    public static int[] fill(int[] arr) {

        for (int i = 0; i < arr.length; i++)
            arr[i] = 100003;

        return arr;
    }

}
