/**
 *  Created by User on 3.12.2016.
 */
public class Example28 {
    public static void main(String[] args) {
        int sum;
        for (int i = 1; i < 10000; i++) {
            sum = 0;
            for (int j = 1; j <= i / 2; j++) {
                if (i % j == 0)
                    sum += j;
            }
            if (sum == i)
                System.out.println(i);
        }
    }
}