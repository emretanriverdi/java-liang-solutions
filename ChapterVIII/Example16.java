/**
 *  Created by User on 10/02/2017.
 */
public class Example16 {
    public static void main(String[] args) {
        int[][] array = {{4, 2}, {1, 7}, {4, 5}, {1, 2}, {1, 1}, {4, 1}};
        printArray(array);
        sort(array);
        printArray(array);
    }

    public static void sort(int m[][]) {

        int temp;
        while(!(sorted(m))) {
            for (int i = 0; i < m.length - 1; i++) {
                if (m[i][0] > m[i + 1][0]) {
                    temp = m[i][0];
                    m[i][0] = m[i + 1][0];
                    m[i + 1][0] = temp;
                    temp = m[i][1];
                    m[i][1] = m[i + 1][1];
                    m[i + 1][1] = temp;
                }
                if (m[i][0] == m[i + 1][0]) {
                    if(m[i][1] > m[i + 1][1]) {
                        temp = m[i][1];
                        m[i][1] = m[i + 1][1];
                        m[i + 1][1] = temp;
                    }
                }
            }
        }
        System.out.println();
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

    public static boolean sorted(int arr[][]) {

        boolean xd = true;

        for (int i = 0; i < arr.length - 1; i++) {
            if (!(arr[i][0] < arr[i + 1][0] || arr[i][0] == arr[i + 1][0]))
                return false;

            if ((arr[i][0] == arr[i + 1][0]))
                if (!(arr[i][1] <= arr[i + 1][1]))
                    return false;
        }
            return true;
        }
    }
