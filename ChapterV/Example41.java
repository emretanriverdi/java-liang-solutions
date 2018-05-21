import java.util.Scanner;

/**
 *  Created by User on 3.12.2016.
 */
public class Example41 {
    public static void main(String[] strings) {

        Scanner input = new Scanner(System.in);
        int largest = 0;
        int count = 0;
        int number;

        System.out.print("Enter number: ");
        do {
            number = input.nextInt();
            if (number > largest) {
                count = 0;
                largest = number;
            }
            if (number == largest) {
                count++;
            }

        } while (number != 0);

        System.out.println("The largest number is " + largest);
        System.out.println("The occurrence count is " + count);
    }
}
