/**
 *  Created by User on 04/01/2017.
 */
public class Example22 {
    public static void main(String[] args) {

        // Sadly spaghetti code :(

        String[] array = new String[8];

        int x1 = ((int) (Math.random() * 8));
        array[x1] = "Q";

        for (String n : array) {
            if (n == null)
                System.out.print("| ");
            else if (n.equals("Q"))
                System.out.print("|Q" );
            else System.out.print("| ");
        }
        System.out.print("|");
        System.out.println();

        int x2 = ((int) (Math.random() * 8));
        while (x2 == x1) {
            x2 = ((int) (Math.random() * 8));
        }
        array[x2] = "M";

        for (String n : array) {
            if (n == null)
                System.out.print("| ");
            else if (n.equals("M"))
                System.out.print("|Q" );
            else System.out.print("| ");
        }
        System.out.print("|");
        System.out.println();

        int x3 = ((int) (Math.random() * 8));
        while (x3 == x1 || x3 == x2) {
            x3 = ((int) (Math.random() * 8));
        }
        array[x3] = "L";

        for (String n : array) {
            if (n == null)
                System.out.print("| ");
            else if (n.equals("L"))
                System.out.print("|Q" );
            else System.out.print("| ");
        }
        System.out.print("|");
        System.out.println();

        int x4 = ((int) (Math.random() * 8));
        while (x4 == x3 || x4 == x2 || x4 == x1) {
            x4 = ((int) (Math.random() * 8));
        }
        array[x4] = "N";

        for (String n : array) {
            if (n == null)
                System.out.print("| ");
            else if (n.equals("N"))
                System.out.print("|Q" );
            else System.out.print("| ");
        }
        System.out.print("|");
        System.out.println();

        int x5 = ((int) (Math.random() * 8));
        while (x5 == x4 || x5 == x3 || x5 == x2 || x5 == x1) {
            x5 = ((int) (Math.random() * 8));
        }
        array[x5] = "O";

        for (String n : array) {
            if (n == null)
                System.out.print("| ");
            else if (n.equals("O"))
                System.out.print("|Q" );
            else System.out.print("| ");
        }
        System.out.print("|");
        System.out.println();


        int x6 = ((int) (Math.random() * 8));
        while (x6 == x5 || x6 == x4 || x6 == x3 || x6 == x2 || x6 == x1) {
            x6 = ((int) (Math.random() * 8));
        }
        array[x6] = "C";

        for (String n : array) {
            if (n == null)
                System.out.print("| ");
            else if (n.equals("C"))
                System.out.print("|Q" );
            else System.out.print("| ");
        }
        System.out.print("|");
        System.out.println();


        int x7 = ((int) (Math.random() * 8));
        while (x7 == x6 || x7 == x5 || x7 == x4 || x7 == x3 || x7 == x2 || x7 == x1) {
            x7 = ((int) (Math.random() * 8));
        }
        array[x7] = "T";

        for (String n : array) {
            if (n == null)
                System.out.print("| ");
            else if (n.equals("T"))
                System.out.print("|Q" );
            else System.out.print("| ");
        }
        System.out.print("|");
        System.out.println();

        int x8 = ((int) (Math.random() * 8));
        while (x8 == x7 || x8 == x6 || x8 == x5 || x8 == x4 || x8 == x3 || x8 == x2 || x8 == x1) {
            x8 = ((int) (Math.random() * 8));
        }
        array[x8] = "J";

        for (String n : array) {
            if (n == null)
                System.out.print("| ");
            else if (n.equals("J"))
                System.out.print("|Q" );
            else System.out.print("| ");
        }
        System.out.print("|");
        System.out.println();


    }
}
