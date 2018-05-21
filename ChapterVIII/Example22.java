/**
 *  Created by User on 13/02/2017.
 */
public class Example22 {
    public static void main(String[] args) {

        int[][] array = new int[6][6];

        int count = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                int x = (int) (Math.random() + 0.5);
                array[i][j] = x;
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++)
                count += array[i][j];

            if(count % 2 == 0)
                System.out.println("The row " + i + " has even number of 1's.");
            else System.out.println("The row " + i + " doesn't have even number of 1's.");

            count = 0;
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++)
                count += array[j][i];

            if(count % 2 == 0)
                System.out.println("The column " + i + " has even number of 1's.");
            else System.out.println("The column " + i + " doesn't have even number of 1's.");

            count = 0;

        }

    }
}
