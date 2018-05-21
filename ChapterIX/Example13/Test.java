package Example13;

import java.util.Scanner;

/**
 *  Created by User on 07/04/2017.
 */
public class Test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the rows and columns in the array: ");
        int rows = scan.nextInt();
        int columns = scan.nextInt();

        double[][] arr = new double[rows][columns];
        System.out.println("Enter the array:");
        for (int i = 0; i < arr.length; i++)
            for (int j = 0; j < arr[i].length; j++)
                arr[i][j] = scan.nextDouble();

        Location location = locateLargest(arr);
        System.out.println(location.toString());

    }

    public static Location locateLargest(double[][] arr) {
        double max = arr[0][0];
        int row = 0;
        int column = 0;

        for (int i = 0; i < arr.length; i++)
            for (int j = 0; j < arr[i].length; j++)
                if (arr[i][j] > max) {
                    max = arr[i][j];
                    row = i;
                    column = j;
                }

        return new Location(row, column, max);
    }

}
