import java.util.Scanner;

/**
 *  Created by User on 3.12.2016.
 */
public class Example8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int highestScore = 0;
        String highestBoy = null;
        System.out.println("How many students are there? ");
        int x = scan.nextInt();
        for (int i = 0; i < x ; i++) {
            System.out.print("Enter the name of the #" + (i + 1) + " student: " );
            String newName = scan.next();
            System.out.print("Enter the score of the #" + (i + 1) + " student: " );
            int newScore = scan.nextInt();

            if (newScore > highestScore) {
                highestScore = newScore;
                highestBoy = newName;
            }
        }
        System.out.println("Top student's name is " + highestBoy + " and his score is " + highestScore);
    }
}
