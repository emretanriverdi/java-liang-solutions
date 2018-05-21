/**
 *  Created by User on 15.12.2016.
 */

public class Example27 {
    public static void main(String[] args) {
        int count = 0;

        for (int i = 10; i <= 3050 ; i++) {

            if (isPrime(i) && !isPalindrome(i) && isPrime(reverse(i))) {
                count++;
                if (!(count % 10 == 0))
                System.out.print(i + " ");
                else System.out.println(i);
            }

        }
    }

    public static int reverse(int number) {
        String s = number + "";
        String x = "";
        for (int i = s.length() - 1; i >= 0 ; i--) {
            x += s.charAt(i);
        }
        return Integer.parseInt(x);
    }

    public static boolean isPalindrome(int number) {
        return (number == reverse(number));
    }


    public static boolean isPrime(long n) {

        if (n < 2) return false;

        for (int i = 2; i <= n / 2; i++) {

            if (n % i == 0) return false;
        }

        return true;
    }

}