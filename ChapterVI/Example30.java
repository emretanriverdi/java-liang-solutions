/**
 *  Created by User on 18.12.2016.
 */
public class Example30 {
    public static void main(String[] args) {
        int count = 0;
        int x = 0;
        while (x < 100) {
            int dice1;
            int dice2;
            int sum;
            int point = 0;

            dice1 = ((int) (Math.random() * 6) + 1);
            dice2 = ((int) (Math.random() * 6) + 1);

            sum = dice1 + dice2;

            if (sum == 7 || sum == 11) {
                System.out.println("You rolled " + dice1 + " + " + dice2 + " = " + sum);
                System.out.println("You win.");
                x++;
                count++;
                continue;
            }

            if (sum == 2 || sum == 3 || sum == 12) {
                System.out.println("You rolled " + dice1 + " + " + dice2 + " = " + sum);
                System.out.println("You lose.");
                x++;
                continue;
            }

            if (sum == 4 || sum == 5 || sum == 6 || sum == 8 || sum == 9 || sum == 10) {


                System.out.println("You rolled " + dice1 + " + " + dice2 + " = " + sum);
                System.out.println("Point is " + sum);

                point = sum;

            }

            dice1 = ((int) (Math.random() * 6) + 1);
            dice2 = ((int) (Math.random() * 6) + 1);

            sum = dice1 + dice2;

            if ((sum == point)) {
                System.out.println("You rolled " + dice1 + " + " + dice2 + " = " + sum);
                System.out.println("You win.");
                count++;
            } else if (sum == 7)
                System.out.println("You rolled " + dice1 + " + " + dice2 + " = " + sum + "\nYou lose.");

            while (sum != 7 && sum != point) {
                dice1 = ((int) (Math.random() * 6) + 1);
                dice2 = ((int) (Math.random() * 6) + 1);

                sum = dice1 + dice2;

                if (sum == point) {
                    System.out.println("You rolled " + dice1 + " + " + dice2 + " = " + sum);
                    System.out.println("You win.");
                    count++;
                }
                if (sum == 7) {
                    System.out.println("You rolled " + dice1 + " + " + dice2 + " = " + sum);
                    System.out.println("You lose.");
                }
            }
            x++;
        }
        System.out.println("The number of the games you win is " + count);
    }

}
