import java.util.Scanner;

/**
 *  Created by User on 10/02/2017.
 */
public class Example15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter five points: ");
        double[][] arr = new double[5][2];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = scan.nextDouble();
            }
        }

        System.out.println("The five points are " + (sameLine(arr) ? "" : "not ") + "on the same line.");

    }

    public static boolean sameLine(double[][] points) {

        for (int i = points.length - 1; i >= 0; i--) {
            for (int j = points[i].length - 1; j >= 0; j-=2) {

                if (points[i][j] != points[i][j - 1])
                    return false;

            }
        }

        return true;

    }

}
