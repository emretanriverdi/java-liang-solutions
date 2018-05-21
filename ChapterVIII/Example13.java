import java.util.Scanner;

/**
 *  Created by User on 08/02/2017.
 */
public class Example13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns of the array: ");
        int x = scan.nextInt();
        int y = scan.nextInt();

        double[][] arr = new double[x][y];

        System.out.println("Enter the array: ");

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = scan.nextDouble();
            }
        }

        System.out.print("The target of the largest element is at (" + locateLargest(arr)[0] + "," + locateLargest(arr)[1] + ")");
    }


    public static int[] locateLargest(double[][] a) {

        double max = a[0][0];
        int[] lol = new int[2];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] > max) {
                    max = a[i][j];
                    lol[0] = i;
                    lol[1] = j;
                }
            }
        }

        return lol;

    }

}
