import java.util.Scanner;


public class XOXGame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[][] arr = {{" ", " ", " "}, {" ", " ", " "}, {" ", " ", " "}};
        printArray(arr);

        while(true) {
            System.out.print("\nEnter a row (0, 1 or 2) for player X: ");
            int x1 = scan.nextInt();
            System.out.print("Enter a column (0, 1 or 2) for player X: ");
            int x2 = scan.nextInt();

            while(arr[x1][x2].equals("O") || arr[x1][x2].equals("X")) {
                System.out.println("\n\nThat slot is full. Try another slot.");
                System.out.print("\nEnter a row (0, 1 or 2) for player X: ");
                x1 = scan.nextInt();
                System.out.print("Enter a column (0, 1 or 2) for player X: ");
                x2 = scan.nextInt();
            }

            arr[x1][x2] = "X";

            printArray(arr);

            if (isEnded(arr)) {
                System.out.println("\nPlayer X won.");
                break;
            }

            if (!notDraw(arr)) {
                System.out.println("\nIt's a draw.");
                break;
            }

            System.out.print("\nEnter a row (0, 1 or 2) for player O: ");
            int o1 = scan.nextInt();
            System.out.print("Enter a column (0, 1 or 2) for player O: ");
            int o2 = scan.nextInt();

            while(arr[o1][o2].equals("X") || arr[o1][o2].equals("O")) {
                System.out.println("\n\nThat slot is full. Try another slot.");
                System.out.print("\nEnter a row (0, 1 or 2) for player O: ");
                o1 = scan.nextInt();
                System.out.print("Enter a column (0, 1 or 2) for player O: ");
                o2 = scan.nextInt();
            }

            arr[o1][o2] = "O";

            printArray(arr);

            if (isEnded(arr)) {
                System.out.println("\nPlayer O won.");
                break;
            }

            if (!notDraw(arr)) {
                System.out.println("\nIt's a draw.");
                break;
            }

        }

    }

    public static void printArray(String[][] array) {
        System.out.println("-----------------");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print("| " + array[i][j] + " | ");
            }
            System.out.println();
        }
        System.out.print("-----------------");
    }

    public static boolean isEnded(String[][] arr) {
        if((arr[0][0].equals(arr[1][1]) && arr[1][1].equals(arr[2][2]) && !(arr[1][1].equals(" "))) || (arr[0][0].equals(arr[0][1]) && arr[0][1].equals(arr[0][2]) && !(arr[0][1].equals(" "))) || (arr[0][0].equals(arr[1][0]) && arr[1][0].equals(arr[2][0]) && !(arr[1][0].equals(" "))) || (arr[1][0].equals(arr[1][1]) && arr[1][1].equals(arr[1][2]) && !(arr[1][1].equals(" "))) || (arr[2][0].equals(arr[2][1]) && arr[2][1].equals(arr[2][2]) && !(arr[2][1].equals(" "))) || (arr[0][1].equals(arr[1][1]) && arr[1][1].equals(arr[2][1]) && !(arr[1][1].equals(" "))) || (arr[0][2].equals(arr[1][2]) && arr[1][2].equals(arr[2][2]) && !(arr[1][2].equals(" "))) || (arr[0][2].equals(arr[1][1]) && arr[1][1].equals(arr[2][0])) && !(arr[1][1].equals(" ")))
            return true;
        return false;
    }

    public static boolean notDraw(String[][] arr) {

        return (arr[0][0].equals(" ") || arr[0][1].equals(" ") || arr[0][2].equals(" ") || arr[1][0].equals(" ") || arr[1][1].equals(" ") || arr[1][2].equals(" ") || arr[2][0].equals(" ") || arr[2][1].equals(" ") || arr[2][2].equals(" "));
    }

}
