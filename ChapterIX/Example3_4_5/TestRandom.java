package Example3_4_5;

import java.util.Random;

/**
 *  Created by User on 06/04/2017.
 */
public class TestRandom {
    public static void main(String[] args) {
        Random rand = new Random(1000);

        for (int i = 0; i < 50; i++)
            System.out.println(rand.nextInt(100));

    }
}
