/**
 *  Created by User on 15.12.2016.
 */
public class Example18 {
    public static void main(String[] args) {
        System.out.println(checkPassword("25eskisehir222222"));
    }

    public static Boolean checkPassword(String s) {

        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '0' || s.charAt(i) == '1' || s.charAt(i) == '2' || s.charAt(i) == '3' || s.charAt(i) == '4' || s.charAt(i) == '5' || s.charAt(i) == '6' || s.charAt(i) == '7' || s.charAt(i) == '8' || s.charAt(i) == '9' )
                count++;
        }

        int valid = 0;
        for (int j = 0; j < s.length(); j++) {
            if ((s.charAt(j) >= 'A' && s.charAt(j) <= 'Z') || (s.charAt(j) >= 'a' && s.charAt(j) <= 'z') || (s.charAt(j) >= '0' && s.charAt(j) <= '9'))
                valid++;
        }

        return (s.length() >= 8 && count >= 2 && valid == s.length());
    }
}
