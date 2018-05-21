package Example12;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by User on 23/05/2017.
 */
public class Test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter five numbers: ");
        ArrayList<Double> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            double x = scan.nextDouble();
            list.add(x);
        }
        System.out.println("Sum is " + sum(list));
    }

    public static double sum(ArrayList<Double> list) {
        double x = 0;
        for (int i = 0; i < list.size(); i++) {
            x += list.get(i);
        }
        return x;
    }

}
