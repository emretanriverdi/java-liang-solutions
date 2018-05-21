import java.util.Scanner;

/**
 *  Created by User on 20/02/2017.
 */
public class Example36 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number n: ");
        int x = scan.nextInt();
        System.out.println("Enter " + x + " rows of letters seperated by spaces: ");
        char[][] matrix = new char[x][x];
        char a = 'A';
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = scan.next().charAt(0);
                if (!(matrix[i][j] >= a && matrix[i][j] <= ((char) (a + x)))) {
                    System.out.println("Wrong input: the letters must be from A to " + ((char) (a + x - 1)));
                    System.exit(1);
                }
            }
        }
        System.out.println("The input array is a Latin square.");
    }
}
