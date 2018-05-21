import java.util.Scanner;

/**
 *  Created by User on 03/01/2017.
 */
public class Example14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 5 numbers: ");
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = scan.nextInt();
        }

        System.out.println("The greatest common divisor is " + gcd(array));
    }

    public static int gcd(int...numbers) {

        boolean isDivisor;
        int gcd = 1;
        int min = numbers[0];
        for (int i = 0; i < numbers.length ; i++) {
            if (numbers[i] < min)
                min = numbers[i];
        }

        for (int i = 2; i <= min ; i++) {
            isDivisor = true;
            for(int n : numbers) {
                if (!(n % i == 0))
                    isDivisor = false;
            }
            if (isDivisor)
                gcd = i;
        }

        return gcd;
    }

}
