import java.util.Scanner;

/**
 *  Created by User on 20/02/2017.
 */
public class Example30 {
    public static void main(String[] args) {
        System.out.print("Enter a00, a01, a10, a11: ");
        double[][] a = getMatrix();
        System.out.print("Enter b0, b1: ");
        double[] b = getArray();
        ifNull(a);

        double[] c = linearEquation(a, b);
        System.out.println("x is " + c[0] + ", " + "y is " + c[1]);

    }

    public static double[][] getMatrix() {
        Scanner scan = new Scanner(System.in);
        double[][] matrix = new double[2][2];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = scan.nextDouble();
            }
        }
        return matrix;
    }
    public static double[] getArray() {
        Scanner scan = new Scanner(System.in);
        double[] array = new double[2];
        for (int i = 0; i < array.length; i++) {
            array[i] = scan.nextDouble();
        }
        return array;
    }
    public static void ifNull(double[][] a) {
        if((a[0][0] * a[1][1] - a[0][1] * a[1][0]) == 0) {
            System.out.println("This equation has no solution. ");
            System.exit(1);
        }
    }
    public static double[] linearEquation(double[][] a, double[] b) {
        double [] c = new double[2];

        c[0] = (((b[0] * a[1][1]) - (b[1] * a[0][1])) / ((a[0][0] * a[1][1]) - (a[0][1] * a[1][0])));
        c[1] = (((b[1] * a[0][0]) - (b[0] * a[1][0])) / ((a[0][0] * a[1][1]) - (a[0][1] * a[1][0])));

        return c;

    }

}
