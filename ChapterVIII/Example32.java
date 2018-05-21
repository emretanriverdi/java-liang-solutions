import java.util.Scanner;

/**
 *  Created by User on 20/02/2017.
 */
public class Example32 {
    public static void main(String[] args) {

        System.out.print("Enter x1, y1, x2, y2, x3, y3: ");
        double[][] matrix = getMatrix();
        double a = getTriangleArea(matrix);

        if (a == 0)
            System.out.println("The three points are on the same line.");
        else System.out.println("The area of the triangle is " + a);


    }

    public static double[][] getMatrix() {
        Scanner scan = new Scanner(System.in);
        double[][] matrix = new double[3][2];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = scan.nextDouble();
            }
        }
        return matrix;
    }

    public static double getTriangleArea(double[][] points) {

        if ((((points[2][1] - points[1][1])) / ((points[2][0] - points[1][0]))) == (((points[1][1] - points[0][1])) / ((points[1][0] - points[0][0]))) && (((points[1][1] - points[0][1])) / ((points[1][0] - points[0][0]))) == (((points[2][1] - points[0][1])) / ((points[2][0] - points[0][0]))))
            return 0;

        return (1.0 / 2) * Math.abs(points[0][0] * points[1][1] + points[1][0] * points[2][1] + points[2][0] * points[0][1] - points[1][0] * points[0][1] - points[2][0] * points[1][1]  - points[0][0] * points[2][1]);

    }

}
