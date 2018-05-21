/**
 *  Created by User on 01/01/2017.
 */
public class Example4 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 9, 5, 3, 6, 11, -5};
        System.out.println(count(array));
    }

    public static int count(int[] array) {
        double count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                count += array[i];
            }
        }

        double avg = count / (array.length - 1);

        int j = 0;
        int avgCount = 0;
        while(array[j] > 0) {
            if (array[j] >= avg)
                avgCount++;
            j++;
        }
        return avgCount;
    }
}
