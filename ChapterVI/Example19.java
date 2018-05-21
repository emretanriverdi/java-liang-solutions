/**
 *  Created by User on 15.12.2016.
 */
public class Example19 {
    public static void main(String[] args) {
        System.out.println(countLetters("KEDI25araba"));
    }

    public static int countLetters(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++)
            if (Character.isLetter(s.charAt(i)))
                count++;
        return count;
    }
}
