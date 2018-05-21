import java.util.Scanner;

/**
 *  Created by User on 13/02/2017.
 */
public class Example19 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] array = new int[6][7];
        System.out.println("Enter the elements of the matrix. ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = scan.nextInt();
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("The matrix does " + (isConsecutiveFour(array) ? "" : "not ") + "contain consecutive four.");

    }

    public static boolean isConsecutiveFour(int[][] values) {

        int count = 0;
        for (int i = 0; i < values.length; i++) {
            for (int j = 0; j < values[i].length - 1; j++) {
                if (values[i][j] == values[i][j + 1]) {
                    count++;
                    if (count == 3)
                        return true;
                } else count = 0;
            }
        }

        count = 0;

        for (int i = 0; i < values[i].length - 2; i++) {
            for (int j = 0; j < values.length - 1; j++) {
                if (values[j][i] == values[j + 1][i]) {
                    count++;
                    if(count == 3)
                        return true;
                } else count = 0;
            }
        }

        for (int i = 0; i < values.length - 3; i++) {
            for (int j = 3; j < values[i].length; j++) {
                if (values[i][j] == values[i + 1][j - 1] && values[i + 1][j - 1] == values[i + 2][j - 2] && values[i + 2][j - 2] == values[i + 3][j - 3]) {
                    return true;
                }
            }
        }

        for (int i = 0; i < values.length - 3; i++) {
            for (int j = 0; j < values[i].length - 3; j++) {
                if (values[i][j] == values[i + 1][j + 1] && values[i + 1][j + 1] == values[i + 2][j + 2] && values[i + 2][j + 2] == values[i + 3][j + 3])
                    return true;
            }
        }
        return false;
    }
}
