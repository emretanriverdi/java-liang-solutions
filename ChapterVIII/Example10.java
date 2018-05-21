/**
 *  Created by User on 06/02/2017.
 */
public class Example10 {
    public static void main(String[] args) {

        int[][] randArray = new int[4][4];

        int row = 0;
        int column = 0;
        int currentColumn = 0;
        int currentRow = 0;

        for (int i = 0; i < randArray.length; i++) {
            for (int j = 0; j < randArray[i].length; j++) {
                int x = (int) (Math.random() + 0.5);
                randArray[i][j] = x;
                row += x;
                System.out.print(randArray[i][j] + " ");
            }

            if (row > currentRow)
                currentRow = row;
            row = 0;

            System.out.println();
        }

        int a = 0;
        for (int i = 0; i < randArray.length; i++) {
            while (a < randArray.length) {
                column += randArray[a][i];
                a++;
            }
            a = 0;

            if (column > currentColumn)
                currentColumn = column;

            column = 0;
        }

        System.out.println("The largest row index is " + currentRow);
        System.out.println("The largest column index is " + currentColumn);

    }
}
