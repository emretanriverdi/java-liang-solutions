/**
 *  Created by User on 18.12.2016.
 */
public class Example23 {
    public static void main(String[] args) {
        System.out.println(count("Welcome", 'e'));
    }

    public static int count(String str, char a) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == a)
                count++;
        }
        return count;
    }
}
