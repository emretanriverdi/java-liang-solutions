/**
 *  Created by User on 3.12.2016.
 */
public class Example10 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 120; i < 1000 ; i+=30) {
            count++;
            if (count % 10 == 0)
            System.out.println(i);
            else System.out.print(i + " ");
        }
    }
}
