import java.util.Scanner;

/**
 *  Created by User on 01/02/2017.
 */
public class Example1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double[][] matrix = new double[3][4];

        System.out.println("Enter a 3-by-4 matrix row by row: ");

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = scan.nextDouble();
            }
        }

        System.out.println("Sum of the elements at column 0 is " + sumColumn(matrix, 0));
        System.out.println("Sum of the elements at column 0 is " + sumColumn(matrix, 1));
        System.out.println("Sum of the elements at column 0 is " + sumColumn(matrix, 2));
        System.out.println("Sum of the elements at column 0 is " + sumColumn(matrix, 3));

    }

    public static double sumColumn(double[][] m, int columnIndex) {

        double x = 0;
        for (int i = 0; i < m.length; i++) {
            x += m[i][columnIndex];
        }
        return x;
    }
}
