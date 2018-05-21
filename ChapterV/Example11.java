/**
 *  Created by User on 3.12.2016.
 */
public class Example11 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 100; i <= 200 ; i++) {
            if ((i % 5 == 0 || i % 6 == 0) && !(i % 30 == 0)) {
                count++;
                if (count % 10 == 0)
                    System.out.println(i);
                else System.out.print(i + " ");
            }
        }
    }
}
