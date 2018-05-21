/**
 *  Created by User on 3.12.2016.
 */
public class Example40 {
    public static void main(String[] args) {
       int i = 0;

        while (i <= 10000) {
            int x = (int) (Math.random() * 100);
            if (x < 50)
                System.out.println("Tails.");
            else
                System.out.println("Heads.");
            i++;
        }
    }
}
