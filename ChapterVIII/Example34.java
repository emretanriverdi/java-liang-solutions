import java.util.Scanner;

/**
 *  Created by User on 20/02/2017.
 */
public class Example34 {
    public static void main(String[] args) {

        System.out.print("Enter 6 points: ");
        double[][] matrix = getMatrix();

        double[] result = getRightMostLowestPoint(matrix);

        System.out.println("The rightmost lowest point is (" + result[0] + ", " + result[1] + ")");

    }

    public static double[][] getMatrix() {
        Scanner scan = new Scanner(System.in);
        double[][] matrix = new double[6][2];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = scan.nextDouble();
            }
        }
        return matrix;
    }

    public static double[] getRightMostLowestPoint(double[][] points) {

        double min = points[0][1];
        for (int i = 0; i < points.length; i++)
            if (points[i][1] < min)
                min = points[i][1];

        double max = 0;
        for (int i = 0; i < points.length; i++)
            for (int j = 0; j < points.length; j++)
                if (points[i][1] == points[j][1] && points[i][1] == min)
                    if (points[i][0] < points[j][0])
                        max = points[j][0];

        return new double[]{max, min};
    }
}
