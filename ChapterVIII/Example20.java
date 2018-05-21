import java.util.Scanner;

/**
 *  Created by User on 13/02/2017.
 */
public class Example20 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[][] array = new String[6][7];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = "O";
            }
        }


        int x;

        while(true) {

            printArray(array);

            x = array.length - 1;
            System.out.println("Drop a red disk on a column. (0-6) ");
            int y = scan.nextInt();
            while (!(array[x][y].equals("O"))) {
                if (x == 0) {
                    System.out.println("There is no space left. You lost your chance. ");
                    x++;
                    break;
                }
                x--;
            }
            array[x][y] = "R";
            x = array.length - 1;

            System.out.println();
            printArray(array);

            if (isConsecutiveFour(array)) {
                printArray(array);
                System.out.println("The red player won.");
                break;
            }

            System.out.println("Drop a yellow disk on a column. (0-6) ");
            int a = scan.nextInt();
            while (!(array[x][a].equals("O"))) {
                if (x == 0) {
                    System.out.println("\nThere is no space left. You lost your chance. ");
                    x++;
                    break;
                }
                x--;
            }
            array[x][a] = "Y";

            if (isConsecutiveFour(array)) {
                printArray(array);
                System.out.println("The yellow player won. ");
                break;
            }

            if (!containsNull(array)) {
                printArray(array);
                System.out.println("The game ended with a draw.");
                break;
            }


        }

    }

    public static boolean isConsecutiveFour(String[][] values) {

        int count = 0;
        for (int i = 0; i < values.length; i++) {
            for (int j = 0; j < values[i].length - 1; j++) {
                if (values[i][j].equals(values[i][j + 1]) && !(values[i][j].equals("O"))) {
                    count++;
                    if (count == 3)
                        return true;
                } else count = 0;
            }
        }

        count = 0;

        for (int i = 0; i < values[i].length - 2; i++) {
            for (int j = 0; j < values.length - 1; j++) {
                if (values[j][i].equals(values[j + 1][i]) && !(values[j][i].equals("O"))) {
                    count++;
                    if(count == 3)
                        return true;
                } else count = 0;
            }
        }

        for (int i = 0; i < values.length - 3; i++) {
            for (int j = 3; j < values[i].length; j++) {
                if (values[i][j].equals(values[i + 1][j - 1]) && values[i + 1][j - 1].equals(values[i + 2][j - 2]) && values[i + 2][j - 2].equals(values[i + 3][j - 3]) && !(values[i + 1][j - 1].equals("O"))) {
                    return true;
                }
            }
        }

        for (int i = 0; i < values.length - 3; i++) {
            for (int j = 0; j < values[i].length - 3; j++) {
                if (values[i][j].equals(values[i + 1][j + 1])&& values[i + 1][j + 1].equals(values[i + 2][j + 2]) && values[i + 2][j + 2].equals(values[i + 3][j + 3]) && !(values[i + 1][j + 1].equals("O")))
                    return true;
            }
        }
        return false;
    }

    public static void printArray(String[][] values) {

        for (int i = 0; i < values.length; i++) {
            for (int j = 0; j < values[i].length; j++) {
                System.out.print("|" + ((values[i][j].equals("O")) ? " " : values[i][j]));
            }
            System.out.println();
        }
        System.out.println("--------------");
    }

    public static boolean containsNull(String[][] values) {
        boolean cat = false;

        for (int i = 0; i < values.length; i++) {
            for (int j = 0; j < values[i].length; j++) {
                if (values[i][j].equals("O"))
                    cat = true;
            }
        }
        return cat;
    }

}
