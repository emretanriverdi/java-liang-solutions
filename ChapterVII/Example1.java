import java.util.Scanner;

/**
 *  Created by User on 25.12.2016.
 */
public class Example1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int students = scan.nextInt();
        System.out.print("Enter " + students + " scores: ");
        int[] array = new int[students];
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            array[i] = scan.nextInt();
            if (array[i] > max)
                max = array[i];
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] >= max - 10)
                System.out.println("Student " + i + " score is " + array[i] + " and grade is " + " A ");
            else if (array[i] >= max - 20)
                System.out.println("Student " + i + " score is " + array[i] + " and grade is " + " B ");
            else if (array[i] >= max - 30)
                System.out.println("Student " + i + " score is " + array[i] + " and grade is " + " C ");
            else if (array[i] >= max - 40)
                System.out.println("Student " + i + " score is " + array[i] + " and grade is " + " D ");
            else System.out.println("Student " + i + " score is " + array[i] + " and grade is " + " F ");
        }
    }
}
