/**
 *  Created by User on 15.12.2016.
 */
public class Example17 {
    public static void main(String[] args) {
        printMatrix(9);
    }

    public static void printMatrix(int n) {
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < n; i++) {
                System.out.print(((int) (Math.random() + 0.5)) + " ");
            }
            System.out.println();
        }
    }
}
