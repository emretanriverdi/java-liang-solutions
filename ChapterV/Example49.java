import java.util.Scanner;

/**
 *  Created by User on 3.12.2016.
 */
public class Example49 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string.");
        String s = scan.nextLine();
        int vowel = 0;
        int consonant = 0;
        s = s.toUpperCase();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'A' || s.charAt(i) == 'E' || s.charAt(i) == 'I' || s.charAt(i) == 'O' || s.charAt(i) == 'U')
                vowel++;
            else if (!(s.charAt(i) == ' '))
                consonant++;
        }
        System.out.println("The number of vowels is " + vowel);
        System.out.println("The number of consonants is " + consonant);
    }
}
