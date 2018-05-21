import java.util.Scanner;

/**
 *  Created by User on 04/01/2017.
 */
public class Example21 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of balls to drop: ");
        int x = scan.nextInt();
        System.out.println("Enter the number of slots in the bean machine: ");
        int slots = scan.nextInt();
        char[] array = new char[slots];
        int[] numbers = new int[slots];
        while (x != 0) {
            int temp = 0;
            for (int i = 0; i < slots; i++) {
                array[i] = makeWay();
                System.out.print(array[i]);
                if (array[i] == 'R')
                    temp++;
            }

            numbers[temp - 1]++;

            System.out.println();
            x--;
        }

            int max = max(numbers);
            while (max > 0) {
                System.out.println();
                for (int i = 0; i < numbers.length; i++) {
                    if (numbers[i] >= max) {
                        System.out.print("O");
                    }
                    else
                        System.out.print(" ");
                }
                max--;
            }
            System.out.println();
    }

    public static char makeWay() {
        int a = (int) (Math.random() + 0.5);
        char myChar = 'X';
        switch (a) {
            case 0: myChar = 'L'; break;
            case 1: myChar = 'R'; break;
        }
        return myChar;
    }

    public static int max(int[] list) {
        int max = list[0];

        for (int i = 1; i < list.length; i++) {
            if (list[i] > max)
                max = list[i];
        }
        return max;
    }
}
