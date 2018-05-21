/**
 *  Created by User on 3.12.2016.
 */
public class Example13 {
    public static void main(String[] args) {
        int n = 999;
        while (n * n * n >= 12000) {
            n--;
        }
        System.out.println(n);
    }
}
