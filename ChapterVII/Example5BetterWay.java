import java.util.Scanner;

/**
 *  Created by User on 01/01/2017.
 */
public class Example5BetterWay {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter ten numbers: ");
        int[] numbers = new int[10];
        int index = 0;

        for (int i = 0; i < numbers.length; i++) {
            int num = scan.nextInt();
            if (isNew(numbers, num)) {
                numbers[index] = num;
                index++;
            }
        }

        System.out.println("The number of distinct number is " + index);
        System.out.print("The distinct numbers are: ");
        for (int i = 0; i < index; i++) {
            System.out.print(numbers[i] + " ");
        }

    }

    public static boolean isNew(int[] numbers, int n) {
        for (int i : numbers)
            if (i == n)
                return false;
        return true;
    }
}
