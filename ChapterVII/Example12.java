/**
 *  Created by User on 01/01/2017.
 */
public class Example12 {
    public static void main(String[] args) {
        double[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        reverse(array);
        for(double n : array)
            System.out.print(n + " ");

    }

    public static double[] reverse(double[] array) {
        double[] newArray = new double[array.length];
        for (int i = 0, j = array.length - 1; i < array.length; i++, j--) {
            newArray[j] = array[i];
        }
        return newArray;
    }

}
