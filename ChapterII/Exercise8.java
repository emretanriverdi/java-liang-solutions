import java.util.Scanner;

/**
 *  Created by User on 29.11.2016.
 */
public class Exercise8 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the timezone offset to GMT:");
        int timeZone = scan.nextInt();

        // Obtain the total milliseconds since the midnight, Jan 1, 1970
        long totalMilliseconds = System.currentTimeMillis();

        // Obtain the total seconds since the midnight, Jan 1, 1970
        long totalSeconds = totalMilliseconds / 1000;

        // Compute the current second in the minute in the hour
        int currentSecond = (int)(totalSeconds % 60);

        // Obtain the total minutes
        long totalMinutes = totalSeconds / 60;

        // Compute the current minute in the hour
        int currentMinute = (int)(totalMinutes % 60);

        // Obtain the total hours
        long totalHours = totalMinutes / 60;

        // Compute the current hour
        int currentHour = (int)(totalHours % 24);

        // Display results
        System.out.println("Current time is " + (currentHour + timeZone) + ":"
                + currentMinute + ":" + currentSecond + " GMT");
    }
}
