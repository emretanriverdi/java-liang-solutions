import java.util.Scanner;

/**
 *  Created by User on 29.11.2016.
 */
public class Exercise7 {
    public static void main(String[] args) {
        System.out.print("Enter the number of minutes:");
        Scanner scan = new Scanner(System.in);
        int minutes = scan.nextInt();
        int days = minutes / (24*60);
        int year = days / 365;
        int remainingDays = days % 365;
        System.out.println(minutes + " minutes is approximately " + year + " years and " + remainingDays + " days ");
    }
}





