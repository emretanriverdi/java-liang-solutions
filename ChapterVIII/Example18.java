/**
 *  Created by User on 13/02/2017.
 */
public class Example18 {
    public static void main(String[] args) {
        int[][] array = {{1, 2}, {3, 4}, {5, 6}, {7, 8}, {9, 10}};

        printArray(array);
        shuffle(array);

    }

    public static void shuffle (int m[][]) {


        int[][] clone = new int[m.length][m[0].length];

        for (int i = 0; i < m.length; i++) {
            int x = (int) (Math.random() * (m.length));

            if (clone[x][0] != 0 && clone[x][1] != 0)
                i--;
            else {
                clone[x][0] = m[i][0];
                clone[x][1] = m[i][1];
            }

        }
        System.out.println();
        printArray(clone);


    }

    public static void printArray(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print("{");
            for (int j = 0; j < arr[i].length; j+=2) {
                System.out.print(arr[i][j] + "," + arr[i][j + 1]);
            }
            System.out.print("} ");
        }
    }
}
