import java.util.Scanner;

/**
 *  Created by User on 06/02/2017.
 */
public class Example5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double[][] matrix1 = new double[3][3];
        double[][] matrix2 = new double[3][3];
        System.out.print("Enter matrix1: ");
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                matrix1[i][j] = scan.nextDouble();
            }
        }
        System.out.print("Enter matrix2: ");
        for (int i = 0; i < matrix2.length; i++) {
            for (int j = 0; j < matrix2[i].length; j++) {
                matrix2[i][j] = scan.nextDouble();
            }
        }

        double[][] matrix3 = addMatrix(matrix1, matrix2);

        System.out.println("The matrices are added as follows: ");

        System.out.println(matrix1[0][0] + " " + matrix1[0][1] + " " + matrix1[0][2] + "      " + matrix2[0][0] + " " +  matrix2[0][1] + " " + matrix2[0][2] + "       " + matrix3[0][0] +  " " + matrix3[0][1] + " " + matrix3[0][2]);

        System.out.println(matrix1[1][0] + " " + matrix1[1][1] + " " + matrix1[1][2] + "   +  " + matrix2[1][0] + " " + matrix2[1][1] + " " + matrix2[1][2] + "   =   " + matrix3[1][0] + " " + matrix3[1][1] + " " + matrix3[1][2]);

        System.out.println(matrix1[2][0] + " " + matrix1[2][1] + " " + matrix1[2][2] + "      " + matrix2[2][0] + " " + matrix2[2][1] + " " + matrix2[2][2] + "       " + matrix3[2][0] + " " + matrix3[2][1] + " " + matrix3[2][2]);

    }

    public static double[][] addMatrix(double[][] a, double[][] b) {

        double[][] c = new double[a.length][a[0].length];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                c[i][j] = (a[i][j] + b[i][j]);
            }
        }

        return c;

    }

}
