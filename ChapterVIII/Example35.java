import java.util.Scanner;

/**
 *  Created by User on 20/02/2017.
 */
public class Example35 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of rows in the matrix: ");
        int x = scan.nextInt();
        System.out.println("Enter the matrix row by row: ");
        int[][] matrix = getMatrix(x);
        int[] result = findLargestBlock(matrix);

        System.out.println("The maximum square submatrix is at (" + result[0] + ", " + result[1] + ") with size " + result[2]);
        
        
    }

    public static int[][] getMatrix(int x) {
        Scanner scan = new Scanner(System.in);
        int[][] matrix = new int[x][x];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = scan.nextInt();
            }
        }
        return matrix;
    }
    
    public static int[] findLargestBlock(int[][] m) {
        int x = 0;
        int y = 0;
        int a = 0;
        for (int i = 0; i < m.length - 3; i++) {
            for (int j = 0; j < m[i].length - 3; j++) {
                if ((((m[i][j] == m[i][j + 1] && m[i][j + 1] == 1) && (m[i][j] == m[i + 1][j] && m[i + 1][j] == 1))) && m[i + 1][j + 1] == 1) {
                    x = i;
                    y = j;
                    a = 2;
                }
            }
        }
        for (int i = 0; i < m.length - 2; i++) {
            for (int j = 0; j < m[i].length - 2; j++) {
                if (((((m[i][j] == m[i][j + 1] && m[i][j + 1] == m[i][j + 2] && m[i][j + 2] == 1) && (m[i][j] == m[i + 1][j] && m[i + 1][j] == m[i + 2][j] && m[i + 2][j] == 1)))) && m[i + 1][j + 1] == 1 && m[i + 1][j + 1] == m[i + 1][j + 2] && m[i + 1][j + 1] == m[i + 2][j + 2] && m[i + 2][j + 1] == m[i + 2][j + 2]) {
                    x = i;
                    y = j;
                    a = 3;
                }
            }
        }
        return new int[]{x, y, a};
    }
    
}
