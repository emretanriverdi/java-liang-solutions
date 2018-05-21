/**
 *  Created by User on 18.12.2016.
 *
 *  It only takes "approximate" square roots.
 *
 *
 */
public class Example22 {
    public static void main(String[] args) {
        System.out.println(sqrt(625));
    }

    public static int sqrt(int n) {
        double nextGuess = -1;
        double lastGuess = 1;

        while ( (int) nextGuess !=  (int) lastGuess) {

            nextGuess = (lastGuess + n) / lastGuess;

            lastGuess += 0.1;

        }

        return (int) lastGuess;
    }
}
