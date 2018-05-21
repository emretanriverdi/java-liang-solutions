import java.util.Scanner;

/**
 *  Created by User on 21.12.2016.
 */
public class CreditCardValidation {
    public static void main(String[] args) {
        System.out.print("Enter a credit card number as a long integer: ");
        Scanner scan = new Scanner(System.in);
        long x = scan.nextLong();
        System.out.println(x + " is " + isValid(x) + ".");
        if (isValid(x).equals("valid")) {
            if (getPrefix(x, 1) == 4)
                System.out.println("Also, your card is Visa.");
            else if (getPrefix(x, 1) == 5)
                System.out.println("Also, your card is Master Card.");
        }
    }

    public static String isValid(long number) {
        if (getSize(number) == 16) {
            if (getPrefix(number, 1) == 4 || getPrefix(number, 1) == 5 || getPrefix(number, 1) == 6 || getPrefix(number, 2) == 37)  {
                if ((sumOfDoubleEvenPlace(number) + sumOfOddPlace(number)) % 10 == 0) {
                    return "valid";
                }
            }
        }
        return "invalid";
    }

    public static int sumOfDoubleEvenPlace(long number) {
        String s = number + "";
        int count = 0;
        int x;
        for (int i = s.length() - 2; i >= 0; i -= 2) {
            x = Character.getNumericValue(s.charAt(i)) * 2;
            String a = x + "";
            if (a.length() == 2) {
                for (int j = 0; j < a.length(); j++) {
                    count += Character.getNumericValue(a.charAt(j));
                }
            } else count += x;
        }
        return count;
    }

    public static int sumOfOddPlace(long number) {
        String s = number + "";
        int x = 0;
        for (int i = s.length() - 1; i > 0; i -= 2) {
            x += Character.getNumericValue(s.charAt(i));
        }
        return x;
    }

    /*
    public static boolean prefixMatched(long number, int d) {
        String s = number + "";
        String x = d + "";
        for (int i = 0; i < x.length(); i++) {
            if (s.charAt(i) == x.charAt(i)) {
                return true;
            }
        }
        return false;
    }
*/

    public static int getSize(long d) {
        String s = d + "";
        return s.length();
    }

    public static long getPrefix(long number, int k) {
        String s = number + "";
        String x = "";
        if (s.length() > k) {
            for (int i = 0; i < k; i++) {
                x += s.charAt(i);
            }
            return Long.parseLong(x);
        } else return number;
    }
}

