/**
 *  Created by User on 15.12.2016.
 */
public class Example14 {
    public static void main(String[] args) {
        System.out.println( (((int) (m(901) * 10000)) / 10000.00));
    }

    public static double m(int i) {
        double sum = 0;
        for (int j = 1; j <= i; j++) {
            sum += (((Math.pow(-1, j + 1.0)) / (2.0 * j - 1.0)));
        }
        return 4 * sum;
    }
}
