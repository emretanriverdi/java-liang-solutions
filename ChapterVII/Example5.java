import java.util.Arrays;
import java.util.Scanner;

/**
 *  Created by User on 01/01/2017.
 */
public class Example5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] array = new int[10];
        System.out.print("Enter ten numbers: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = scan.nextInt();
        }

        Arrays.sort(array);
        int count = 1;
        for (int i = 1; i < array.length; i++) {
            if (!(array[i] == array[i - 1])) {
                count++;
            }
        }
        System.out.println("The number of distinct number is " + count);

        int[] arrayNew = new int[count];

        int x = 1;
        arrayNew[0] = array[0];
        for (int i = 1; i < array.length; i++) {
            if (!(array[i] == array[i - 1])) {
                arrayNew[x] = array[i];
                x++;
            }
        }
        System.out.print("The distinct numbers are ");
        for (int n : arrayNew)
            System.out.print(n + " ");
    }
}
