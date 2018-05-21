/**
 *  Created by User on 03/01/2017.
 */
public class Example13 {
    public static void main(String[] args) {
        System.out.println(getRandom(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20));
    }

    public static int getRandom(int...numbers) {
       int randomNumber = ((int) (Math.random() * 53)) + 1;
       while (contains(randomNumber, numbers)) {
           randomNumber = ((int) (Math.random() * 53)) + 1;
       }
        return randomNumber;
    }

    public static boolean contains(int x, int...numbers) {
        for(int n : numbers) {
            if (x == n)
                return true;
        }
        return false;
    }

}
