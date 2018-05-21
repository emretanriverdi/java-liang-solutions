import java.util.Scanner;

/**
 *  Created by User on 17.12.2016.
 */
public class Example21 {
    public static void main(String[] args) {
        String x = "";
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scan.nextLine();
        for (int i = 0; i < input.length(); i++) {
            if (Character.isLetter(input.charAt(i)))
                x += getNumber(input.charAt(i));
            else x += input.charAt(i);
        }
        System.out.println(x);


    }

        public static int getNumber(char uppercaseLetter) {

        switch (Character.toLowerCase(uppercaseLetter)) {
            case 'a': return 2;
            case 'b': return 2;
            case 'c': return 2;
            case 'd': return 3;
            case 'e': return 3;
            case 'f': return 3;
            case 'g': return 4;
            case 'h': return 4;
            case 'i': return 4;
            case 'j': return 5;
            case 'k': return 5;
            case 'l': return 5;
            case 'm': return 6;
            case 'n': return 6;
            case 'o': return 6;
            case 'p': return 7;
            case 'q': return 7;
            case 'r': return 7;
            case 's': return 7;
            case 't': return 8;
            case 'u': return 8;
            case 'v': return 8;
            case 'w': return 9;
            case 'x': return 9;
            case 'y': return 9;
            case 'z': return 9;

        }
            return 0;
    }
}
