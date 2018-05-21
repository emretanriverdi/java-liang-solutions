import java.util.Scanner;

/**
 *  Created by User on 30.11.2016.
 */
public class Exercise17 {
    public static void main(String[] args) {
        int computer = (int) (Math.random() * 3);
        Scanner scan = new Scanner(System.in);
        System.out.print("scissor (0), rock (1), paper (2): ");
        int user = scan.nextInt();

        System.out.print("\nThe computer is ");

        switch (computer) {
            case 0: System.out.print("scissor. "); break;
            case 1: System.out.print("rock. "); break;
            case 2: System.out.print("paper. ");
        }

        System.out.print("You are ");

        switch (user) {
            case 1: System.out.print("rock. "); break;
            case 2: System.out.print("paper. "); break;
            case 0: System.out.print("scissor. ");
        }

        if (computer == user)
            System.out.print(" It is a draw.");
        else {

            boolean win = (user == 0 && computer == 2) ||
                    (user == 1 && computer == 0) ||
                    (user == 2 && computer == 1);

            if (win)
                System.out.print(" You won.");
            else System.out.print(" You lose.");

        }

    }
}
