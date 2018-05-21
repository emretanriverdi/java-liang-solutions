import java.util.Scanner;

/**
 *  Created by User on 30.11.2016.
 */
public class Example34 {
    public static void main(String[] args) {
        int you = 0;
        int com = 0;
        Scanner scan = new Scanner(System.in);
        while (com < 3 && you < 3) {
            int computer = (int) (Math.random() * 3);
            System.out.print("scissor (0), rock (1), paper (2): ");
            int user = scan.nextInt();

            System.out.print("\nThe computer is ");

            switch (computer) {
                case 0:
                    System.out.print("scissor. ");
                    break;
                case 1:
                    System.out.print("rock. ");
                    break;
                case 2:
                    System.out.print("paper. ");
            }

            System.out.print("You are ");

            switch (user) {
                case 1:
                    System.out.print("rock. ");
                    break;
                case 2:
                    System.out.print("paper. ");
                    break;
                case 0:
                    System.out.print("scissor. ");
            }

            if (computer == user)
                System.out.print(" It is a draw.\n");
            else {

                boolean win = (user == 0 && computer == 2) ||
                        (user == 1 && computer == 0) ||
                        (user == 2 && computer == 1);

                if (win) {
                    System.out.print(" You won.\n");
                    you++;
                } else {
                    System.out.print(" You lose.\n");
                    com++;
                }

            }
        }
        if (com > 2)
            System.out.print("\nComputer won. Sorry.");
        else System.out.print("\nYou won. Congrats.");
    }
}
