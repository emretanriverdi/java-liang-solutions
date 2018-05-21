/**
 *  Created by User on 3.12.2016.
 */
public class Example25_PI {
    public static void main(String[] args) {
        double sum = 1;
        for (double i = 1; i <= 100000 ; i+=4) {
            sum += 1 / (i + 4);
        }
        for (double i = -1; i < 100000; i+=4) {
            sum -= 1 / (i + 4);
        }
        System.out.println(4 * sum);
    }
}
