/**
 *  Created by User on 24.12.2016.
 */
public class Example37 {
    public static void main(String[] args) {
        System.out.println(format(34, 4));
        System.out.println(format(34, 5));
        System.out.println(format(34, 1));
    }

    public static String format(int number, int width) {
        String x = "";
        String s = number + "";
        if (width < s.length())
            return s;
        else {
            for (int i = 0; i < width - s.length(); i++)
                x += 0;
            for (int j = 0; j < s.length(); j++)
                x += s.charAt(j);
        }
        return x;
    }
}
