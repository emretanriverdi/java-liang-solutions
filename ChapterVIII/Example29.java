import java.util.Arrays;
import java.util.Scanner;

/**
 *  Created by User on 19/02/2017.
 */
public class Example29 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] list1 = new int[3][3];
        int[][] list2 = new int[3][3];
        System.out.print("Enter list 1: ");

        for (int i = 0; i < list1.length; i++) {
            for (int j = 0; j < list1[i].length; j++) {
                list1[i][j] = scan.nextInt();
            }
        }

        System.out.print("Enter list 2: ");
        for (int i = 0; i < list2.length; i++) {
            for (int j = 0; j < list2[i].length; j++) {
                list2[i][j] = scan.nextInt();
            }
        }

        System.out.println("The two arrays are " + (equals(list1,list2) ? "" : "not ") + "identical.");


    }

    public static boolean equals(int[][] m1, int[][] m2) {

        int[] mo = new int[m1.length * m1[0].length];
        int[] mt = new int[m2.length * m2[0].length];

        int x = 0;
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1[i].length; j++) {
                mo[x] = m1[i][j];
                x++;
            }
        }

        x = 0;
        for (int i = 0; i < m2.length; i++) {
            for (int j = 0; j < m2[i].length; j++) {
                mt[x] = m2[i][j];
                x++;
            }
        }

        Arrays.sort(mo);
        Arrays.sort(mt);


        for (int i = 0; i < mo.length; i++)
            if (mo[i] != mt[i])
                return false;

        return true;
    }
}
