/**
 *  Created by User on 04/01/2017.
 */
public class Example23 {
    public static void main(String[] args) {
        boolean[] locker = new boolean[100];

        for (int i = 0; i < locker.length; i++) {
            locker[i] = false;
        }

        for (int i = 0; i < locker.length ; i++) {
            for (int j = 0; j < locker.length; j++) {
                if ((j + 1) % (i + 1) == 0) {
                    if (!locker[j])
                        locker[j] = true;
                    else locker[j] = false;
                }
            }
        }
        for(boolean n : locker)
            System.out.print(n + " ");
    }
}
