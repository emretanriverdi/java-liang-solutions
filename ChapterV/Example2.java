import java.util.Scanner;

/**
 *  Created by User on 3.12.2016.
 */
public class Example2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int positive = 0;
        int negative = 0;
        int total = 0;
        double average;
        double count = 0;

        System.out.println("Enter an integer, the input ends if it is 0: ");
        int input = scan.nextInt();

        if (input == 0) {
            System.out.println("No numbers entered except 0.");
            System.exit(1);
        }


        while (input != 0) {

            if (input > 0)
                positive++;
            else negative++;

            total += input;
            count++;

            input = scan.nextInt();
        }

        average = total / count;

        System.out.println("The number of positives is " + positive);
        System.out.println("The number of negatives is " + negative);
        System.out.println("The total is " + total);
        System.out.println("The average is " + average);

    }
}
