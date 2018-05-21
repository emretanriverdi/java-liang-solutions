import java.util.Scanner;

/**
 *  Created by User on 20/02/2017.
 */
public class Example31 {
    public static void main(String[] args) {
        System.out.print("Enter x1, y1, x2, y2, x3, y3, x4, y4: ");
        double[][] matrix = getMatrix();
        double[] c = getIntersectingPoint(matrix);

        c[0] = (((int) ((c[0] + 0.0001) * 10000)) / 10000.00);
        c[1] = (((int) (c[1] * 10000)) / 10000.00);

        System.out.println("The intersecting point is at (" + c[0] + ", " + c[1] + ")");

    }

    public static double[][] getMatrix() {
        Scanner scan = new Scanner(System.in);
        double[][] matrix = new double[4][2];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = scan.nextDouble();
            }
        }
        return matrix;
    }

    public static double[] getIntersectingPoint(double[][] points) {

        double[] c = new double[2];
        double t;

        if (((points[3][1] - points[2][1]) / (points[3][0] - points[2][0])) == (((points[1][1] - points[0][1]) / (points[1][0] - points[0][0])))) {
            System.out.println("The two lines are parallel. ");
            System.exit(1);
        }

        t = ((((points[3][1] - points[2][1]) * (points[2][0] - points[0][0]))) - (((points[2][1] - points[0][1]) * (points[3][0] - points[2][0])))) / ((((points[3][1] - points[2][1]) * (points[1][0] - points[0][0]))) - (((points[1][1] - points[0][1]) * (points[3][0] - points[2][0]))));

        c[0] = points[0][0] + (points[1][0] - points[0][0]) * t;
        c[1] = points[0][1] + (points[1][1] - points[0][1]) * t;

        return c;

    }

}
