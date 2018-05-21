import java.util.Scanner;

/**
 *  Created by User on 26.12.2016.
 */
public class Example3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the integers between 1 and 100: ");
        int[] array = new int[100];
        while (true) {
            int count = scan.nextInt();
            if (count > 1 && count < 100) {
                array[count - 1]++;
            } else break;
        }

        for (int i = 0; i < array.length ; i++) {
            if (!(array[i] == 0)) {
                System.out.println((i + 1) + " occurs " + array[i] + " time" + ((array[i] == 1) ? "" : "s"));
            }
        }
    }
}
