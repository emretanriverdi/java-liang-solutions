import java.util.Scanner;

/**
 *  Created by User on 13/02/2017.
 */
public class Example21 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of cities: ");

        int x = scan.nextInt();

        double[][] array = new double[x][2];

        System.out.println("Enter the coordinates of the cities: ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = scan.nextDouble();
            }
        }

        centralCity(array);

    }


    public static void centralCity(double[][] arr) {

        double count = 0;
        double min = 999999;
        int holder = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {

                count += Math.sqrt((Math.pow(arr[i][0] - arr[j][0], 2) + Math.pow(arr[i][1] - arr[j][1], 2)));
            }

            if (count < min) {
                min = count;
                holder = i;
            }

            count = 0;
        }

        min = ( (int) (min * 100) / 100.00);

        System.out.println("(" + arr[holder][0] + ", " + arr[holder][1] + ")");
        System.out.println("The total distance to all other cities is " + min);

    }
}
