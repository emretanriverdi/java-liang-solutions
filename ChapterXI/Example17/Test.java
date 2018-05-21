package Example17;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by User on 24/05/2017.
 */
public class Test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter an integer m: ");
        int integer = scan.nextInt();

        ArrayList<Integer> listFactors = factors(integer);
        int find = find(listFactors);

        System.out.println("The smallest number n for m * n to be a perfect square is " + find);
        System.out.println("m * n is " + integer * find);


    }

    public static ArrayList<Integer> factors(int x) {
        ArrayList<Integer> list = new ArrayList<>();
        int a = x;
        for (int i = 2; i < a; i++)
            if (isPrime(i) && x % i == 0) {
                list.add(i);
                x /= i;
                i--;
            }
            return list;
    }

    public static boolean isPrime(int num) {
        if (num < 2) return false;
        if (num == 2) return true;
        if (num % 2 == 0) return false;
        for (int i = 3; i * i <= num; i += 2)
            if (num % i == 0) return false;
        return true;
    }

    public static int find(ArrayList<Integer> list) {

        int num = 0;
        int count = 0;
        int mult = 1;
        while (num < list.size()) {
            int it = list.get(num);

            for (int i = 0; i < list.size(); i++) {
                if (it == list.get(i))
                    count++;
            }

            if (count % 2 != 0)
                mult *= list.get(num);

            num += count;
            count = 0;
        }

        return mult;

    }

}
