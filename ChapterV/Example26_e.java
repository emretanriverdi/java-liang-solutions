/**
 *  Created by User on 3.12.2016.
 */
public class Example26_e {
    public static void main(String[] args) {
        double e = 1;
        for (double i = 1; i <= 100000; i++) {
            double denominator = i;
            for (double j = i - 1; j >= 1 ; j--) {
                denominator *= j;
            }
            e += 1 / denominator;
        }
        System.out.println(e);
    }
}
