/**
 *  Created by User on 15.12.2016.
 */
public class Example12 {
    public static void main(String[] args) {
        printChars('1', 'Z', 10);
    }

    public static void printChars(char ch1, char ch2, int numberPerLine) {
        int count = 1;
        for (char i = ch1; i <= ch2; i++) {
            if (count % numberPerLine == 0)
            System.out.println(i);
            else System.out.print(i + " ");
            count++;
        }
    }
}
