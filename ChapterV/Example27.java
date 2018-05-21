/**
 *  Created by User on 3.12.2016.
 */
public class Example27 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 400; i <= 2100 ; i+=4) {
            if (i % 100 == 0 && !(i % 400 == 0))
                System.out.print("");

              else {
                System.out.print(i + " ");
                count++;
                if (count % 10 == 0)
                    System.out.println();
            }
        }
        System.out.println("\nThere are " + count + " leap years in this period.");
    }
}
