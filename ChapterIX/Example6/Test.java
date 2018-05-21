package Example6;

import java.util.Random;

/**
 *  Created by User on 07/04/2017.
 */
public class Test {
    public static void main(String[] args) {
        Random rand = new Random();
        Stopwatch stopwatch = new Stopwatch();

        int[] arr = new int[100000];

        stopwatch.start();
        System.out.println(stopwatch.getStartTime());

        for (int i = 0; i < 100000; i++)
            arr[i] = rand.nextInt();

        selectionSort(arr);

        stopwatch.stop();
        System.out.println(stopwatch.getEndTime() + "\n");

        System.out.println(stopwatch.getElapsedTime() / 1000.0 + " seconds" );

    }

    public static void selectionSort(int[] arr){
        for (int i = 0; i < arr.length - 1; i++)
        {
            int index = i;
            for (int j = i + 1; j < arr.length; j++){
                if (arr[j] < arr[index]){
                    index = j;
                }
            }
            int smallerNumber = arr[index];
            arr[index] = arr[i];
            arr[i] = smallerNumber;
        }
    }
}
