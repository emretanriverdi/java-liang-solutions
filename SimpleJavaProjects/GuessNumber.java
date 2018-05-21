import java.util.Scanner;


public class GuessNumber {
    public static void main(String[] args) {

        System.out.println("Hold a number in your head. ");
        playTheGame();

    }

    public static int maxsorting(int[] arr) {
        int max = arr[0];

        for (int i = 0; i < arr.length; i++)
            if (arr[i] > max)
                max = arr[i];
        return max;
    }

    public static int minsorting(int[] arr) {
        int min = 999;

        for (int i = 0; i < arr.length; i++)
            if (arr[i] < min && arr[i] != 0)
                min = arr[i];
        return min;

    }

    public static void playTheGame() {
        Scanner scan = new Scanner(System.in);
        int myGuess;
        int count = 0;

        int[] higher = new int[50];
        int[] lower = new int[50];

        myGuess = ((int) (Math.random() * 100)) + 1;
        while (true) {

            sleep();
            System.out.println("Is it " + myGuess + " ?");
            count++;

            int theGuess = myGuess;

            System.out.println("Is it true? Should I go up or down? ");
            String a = scan.nextLine();

            if (a.equalsIgnoreCase("true")) {
                System.out.println("I found it, yay! ");
                System.out.println("I found it in " + count + " guesses.");
                break;
            } else if (a.equalsIgnoreCase("up")) {
                higher[count] = myGuess;
                myGuess = (((int) (Math.random() * (100 - theGuess))) + theGuess);

                while (!(minsorting(lower) > myGuess) || !((maxsorting(higher) < myGuess)))
                    myGuess = (((int) (Math.random() * (100 - theGuess))) + theGuess);


            } else if (a.equalsIgnoreCase("down")) {
                lower[count] = myGuess;
                myGuess = ((int) (Math.random() * (theGuess))) + 1;

                while (!(minsorting(lower) > myGuess) || !((maxsorting(higher) < myGuess)))
                    myGuess = ((int) (Math.random() * (theGuess))) + 1;

            }

        }

    }

    public static void sleep() {
        try {
            Thread.sleep(600);
        } catch (Exception e) {}

    }
}
