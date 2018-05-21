import java.util.Scanner;

/**
 *  Created by User on 01/02/2017.
 */
public class Example2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double[][] matrix = new double[4][4];

        System.out.println("Enter a 4-by-4 matrix row by row: ");

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = scan.nextDouble();
            }
        }

        System.out.println("Sum of the elements in the major diagonal is " + sumMajorDiagonal(matrix));

    }

    public static double sumMajorDiagonal(double[][] m) {

        double first = 0;

        for (int i = 0; i < m.length; i++) {
            first += m[i][i];
        }

        double second = 0;
        for (int j = m.length - 1, i = 0; j >= 0; i++, j--) {
            second += m[i][j];
        }
        return first > second ? first : second;
    }

}
