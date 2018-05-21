
/**
 *  Created by User on 04/01/2017.
 */
public class Example16 {
    public static void main(String[] args) {
        int[] array = new int[10000000];

        for (int i = 0; i < array.length; i++) {
            array[i] = (((int) (Math.random() * 10000)) + 1);
        }

        long startTime = System.currentTimeMillis();

        System.out.println(linearSearch(56, array));

        long endTime = System.currentTimeMillis();

        System.out.println("The first execution time is: " + (endTime - startTime));

    }

    public static int linearSearch(int key, int... numbers) {
        for (int i = 0; i < numbers.length; i++) {
            if (key == numbers[i])
                return i;
        }
        return -1;
    }
}
