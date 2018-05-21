/**
 *  Created by User on 01/01/2017.
 */
public class Example7 {
    public static void main(String[] args) {
        int[] counts = new int[10];
        for (int i = 0; i <= 100; i++) {
            counts[(int) (Math.random() * 10)]++;
        }

        for (int i = 0; i < counts.length; i++) {
            System.out.println(i + "'s are: " + counts[i]);
        }

    }
}
