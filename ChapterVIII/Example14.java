import java.util.Scanner;

/**
 *  Created by User on 08/02/2017.
 */
public class Example14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size for the matrix: ");
        int x = scan.nextInt();
        int[][] matrix = new int[x][x];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                int rand = (int) (Math.random() + 0.5);
                matrix[i][j] = rand;
                System.out.print(rand + " ");
            }
            System.out.println();
        }

        /*
        --- TEST ---

        matrix = new int[][]{{0, 1, 1, 1}, {0, 0, 0, 0}, {0, 1, 0, 0}, {1, 1, 1, 1}};

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        */

        int c = 0;
        int count = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                c += matrix[i][j];
            }
            if (c == 0)
                System.out.println("All 0's on row " + i);
            else if (c == 4)
                System.out.println("All 1's on row " + i);

            else count++;

            if (count == 4)
                System.out.println("No same numbers on a row");

            c = 0;
        }

        count = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                c += matrix [j][i];
            }
            if (c == 0)
                System.out.println("All 0's on column " + i);
            else if (c == 4)
                System.out.println("All 1's on column " + i);

            else count++;

            if (count == 4)
                System.out.println("No same numbers on a column");

            c = 0;
        }


        c = 0;
        for (int i = 0; i < matrix.length; i++)
            c += matrix[i][i];

            if (c == 0)
                System.out.println("All 0's are on the major diagonal");
            else if (c == 4)
                System.out.println("All 1's are on the major diagonal");
            else System.out.println("No same numbers on the major diagonal");

        c = 0;
        for (int i = 0, j = matrix.length - 1; i < matrix.length; i++, j--)
            c += matrix[i][j];

            if (c == 0)
                System.out.println("All 0's are on the sub-diagonal");
            else if (c == 4)
                System.out.println("All 1's are on the sub-diagonal");
            else System.out.println("No same numbers on the sub-diagonal");

    }
}
