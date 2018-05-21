/**
 *  Created by User on 18.12.2016.
 */
public class Example25 {
    public static void main(String[] args) {
        System.out.println(convertMillis(900000000));
    }


    public static String convertMillis(long millis) {

        long totalSeconds = millis / 1000;
        long totalMinutes = totalSeconds / 60;
        long totalHours = totalMinutes / 60;


        StringBuilder s = new StringBuilder();

        s.append(totalHours + ":");
        s.append(totalMinutes % 60 + ":");
        s.append(totalSeconds % 60);


        return s.toString();

    }
}
