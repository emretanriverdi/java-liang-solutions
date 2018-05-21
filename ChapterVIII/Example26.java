import java.util.Scanner;

/**
 *  Created by User on 16/02/2017.
 */
public class Example26 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double [][] matrix = new double[3][3];
        System.out.println("Enter a 3-by-3 matrix row by row: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = scan.nextDouble();
            }
        }
        printArray(sortRows(matrix));
    }

    public static void printArray(double[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static double[][] sortRows(double[][] m) {
        double temp;
        int x = 0;
        while (x < 2) {
            for (int i = 0; i < m.length; i++) {
                for (int j = 0; j < m[i].length - 1; j++) {
                    if (m[i][j] > m[i][j + 1]) {
                        temp = m[i][j];
                        m[i][j] = m[i][j + 1];
                        m[i][j + 1] = temp;
                    }
                }
            }
            x++;
        }
        return m;
    }

}
