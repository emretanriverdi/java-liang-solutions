package Example9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Created by User on 23/05/2017.
 */
public class Test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the array size n: ");
        int x = scan.nextInt();
        int[][] arr = fill(x);
        String[] result = find(arr);
        String row = fix(result[0]);
        String column = fix(result[1]);

        System.out.println("The largest row index: " + row);
        System.out.println("The largest column index: " + column);




    }

    public static int[][] fill(int x) {
        int[][] arr = new int[x][x];

        int rand = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                rand = ((int) (Math.random() + 0.5));
                arr[i][j] = rand;
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        return arr;

    }

    public static String[] find(int[][] arr) {
        ArrayList<Integer> row = new ArrayList<>();
        ArrayList<Integer> column = new ArrayList<>();

        int rowSum = 0;
        int columnSum = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                rowSum += arr[i][j];
                columnSum += arr[j][i];
            }
            row.add(rowSum);
            column.add(columnSum);
            rowSum = 0;
            columnSum = 0;
        }

        int maxRow = Collections.max(row);
        int maxColumn = Collections.max(column);

        String[] array = new String[2];
        array[0] = "";
        array[1] = "";
        for (int i = 0; i < row.size(); i++) {
            if (maxRow == row.get(i)) {
                array[0] += i + ", ";
            }
        }

        for (int i = 0; i < column.size(); i++) {
            if (maxColumn == column.get(i)) {
                array[1] += i + ", ";
            }
        }

        return array;

    }

    public static String fix(String x) {
        String a = "";
        if (x.charAt(x.length() - 2) == ',') {
            for (int i = 0; i < x.length() - 2; i++) {
                a += x.charAt(i);
            }
        }

        else if (x.charAt(x.length() - 1) == ',') {
            for (int i = 0; i < x.length() - 1; i++) {
                a += x.charAt(i);
            }
        }

        return a;
    }

}
