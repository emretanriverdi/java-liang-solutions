import java.util.Scanner;

/**
 *  Created by User on 16/02/2017.
 */
public class Example25 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double [][] matrix = new double[3][3];
        System.out.println("Enter a 3-by-3 matrix row by row: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = scan.nextDouble();
            }
        }

        System.out.println("It is " + ((isMarkovMatrix(matrix))? "" : "not ") + "a Markov matrix.");

    }

    public static boolean isMarkovMatrix(double[][] m) {
        double count = 0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                if (m[j][i] < 0)
                    return false;

                count += m[j][i];

            }

            if (count != 1)
                return false;

            count = 0;

        }


        return true;

    }

}
