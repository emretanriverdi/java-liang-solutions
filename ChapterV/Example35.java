/**
 *  Created by User on 3.12.2016.
 */
public class Example35 {
    public static void main(String[] args) {
        double sum = 0;
        for (int i = 1; i <= 624 ; i++) {
            sum += (1 / (Math.sqrt(i) + Math.sqrt(i + 1)));
        }
        System.out.println(sum);
    }
}
