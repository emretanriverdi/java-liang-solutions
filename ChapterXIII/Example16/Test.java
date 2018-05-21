package Example16;

import java.util.Scanner;

/**
 * Created by User on 26/05/2017.
 */
public class Test {
    public static void main(String[] args) {
        System.out.print("Enter: ");
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();

        String x = "";
        for (int i = 0; i < s.length(); i++)
            if (!(s.charAt(i) == ' '))
                x += s.charAt(i);

        String[] arr = x.split("(?=\\b[-+*/])");

        String numerator1 = arr[0];
        String denominator1 = "";
        for (int i = 1; i < arr[1].length(); i++)
            denominator1 += arr[1].charAt(i);
        char operator = arr[2].charAt(0);
        String numerator2 = "";
        for (int i = 1; i < arr[2].length(); i++)
            numerator2 += arr[2].charAt(i);
        String denominator2 = "";
        for (int i = 1; i < arr[3].length(); i++)
            denominator2 += arr[3].charAt(i);

        Rational rational1 = new Rational(Integer.parseInt(numerator1), Integer.parseInt(denominator1));
        Rational rational2 = new Rational(Integer.parseInt(numerator2), Integer.parseInt(denominator2));
        Rational rational = new Rational();

        if (operator == '+')
            rational = rational1.add(rational2);

        else if (operator == '-')
            rational = rational1.subtract(rational2);

        else if (operator == '*')
            rational = rational1.multiply(rational2);

        else if (operator == '/')
            rational = rational1.divide(rational2);

        System.out.print(rational1 + " " + String.valueOf(operator) + " " + rational2 + " = " + rational.toString());

    }
}
