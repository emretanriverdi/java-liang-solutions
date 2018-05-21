import java.util.Scanner;

/**
 *  Created by User on 13/02/2017.
 */
public class Example23 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a 6-by-6 matrix row by row: ");

        int[][] matrix = new int[6][6];

        int a = 0;
        int b = 0;

        for (int i = 0; i < matrix.length; i++)
            for (int j = 0; j < matrix[i].length; j++)
                matrix[i][j] = scan.nextInt();

        int count = 0;
        int county = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                count += matrix[i][j];
                county += matrix[j][i];
            }
            if (count % 2 != 0)
                a = i;

            if (county % 2 != 0)
                b = i;

            count = 0;
            county = 0;
        }

        System.out.println("The flipped cell is at (" + a + "," + b + ")");

    }
}
