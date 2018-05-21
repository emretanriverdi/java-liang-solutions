import java.util.Arrays;
import java.util.Scanner;

/**
 *  Created by User on 06/02/2017.
 */

// 2 4 3 4 5 8 8 7 3 4 3 3 4 4 3 3 4 3 3 2 2 9 3 4 7 3 4 1 3 5 4 3 6 3 8 3 4 4 6 3 4 4 3 7 4 8 3 8 4 6 3 5 9 2 7 9

public class Example4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double[][] employeeArray = new double[8][7];

        for (int i = 0; i < employeeArray.length; i++) {
            System.out.println("Enter the values of Employee " + i + ":");
            for (int j = 0; j < employeeArray[i].length; j++) {
                employeeArray[i][j] = scan.nextDouble();
            }
        }

        sortDisplay(totalHours(employeeArray));

    }

    public static double[] totalHours(double arr[][]) {

        double[] totalArr = new double[arr.length];


        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                totalArr[i] += arr[i][j];
            }
        }
        return totalArr;
    }

    public static void sortDisplay(double totalArr[]) {

        double[] newArray = totalArr.clone();

        Arrays.sort(totalArr);
        double[] totalReverse = new double[totalArr.length];

        for (int j = totalArr.length - 1, i = 0; j >= 0; i++, j--) {
            totalReverse[i] = totalArr[j];
        }

        int[] lastArray = {1, 2, 3, 4, 5, 6, 7, 8};

        System.out.println("Employee         Weekly Hours");
        System.out.println("------------------------------");
        for (int i = 0; i < totalReverse.length; i++) {
            for (int j = 0; j < newArray.length; j++) {
                if (totalReverse[i] == newArray[j]) {
                    lastArray[i] = j;
                    System.out.println("Employee " + lastArray[i] + "           " + totalReverse[i]);
                }


                if (i > 0) {
                    if (totalReverse[i] == totalReverse[i - 1])
                        totalReverse[i] = -1;
                }
            }
        }

    }

}
