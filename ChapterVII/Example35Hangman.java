import java.util.Scanner;

/**
 *  Created by User on 05/01/2017.
 */
public class Example35Hangman {
    public static void main(String[] args) {

        String[] words = {"program", "cats", "tractor", "school", "house", "write", "right", "left", "intelligent"};

        int a = (int) (Math.random() * 9);

       String[] myArray = toArray(words[a]);

       String[] hideArray = new String[myArray.length];
        for (int i = 0; i < hideArray.length ; i++) {
            hideArray[i] = "*";
        }
        int count = 0;

        while(true) {
            Scanner scan = new Scanner(System.in);
            System.out.print("(Guess) Enter a letter in word " + printArray(hideArray) + " > ");
            String guess = scan.next();

            if (contains(hideArray, guess) != -1)
                System.out.println(guess + " is already in the word.");

            else if (contains(myArray, guess) == -1) {
                System.out.println(guess + " is not in the word.");
                count++;
            }

            for (int i = 0; i < myArray.length; i++)
                if (guess.equals(myArray[i]))
                    hideArray[i] = myArray[i];

            if (equals(myArray, hideArray)) {
                System.out.println("The word is " + words[a] + " .You missed " + count + " times.");
                System.out.print("Do you want to guess another word? Enter Y or N: ");
                String another = scan.next();
                if (another.equals("Y")) {

                    a = (int) (Math.random() * 9);

                    myArray = toArray(words[a]);

                    hideArray = new String[myArray.length];
                    for (int i = 0; i < hideArray.length ; i++) {
                        hideArray[i] = "*";
                    }
                    count = 0;
                }

                else {
                    System.out.println("Okay, goodbye! ");
                    break;
                }

            }
        }

    }

    public static String[] toArray(String s) {

        String[] array = new String[s.length()];
        for (int i = 0; i < s.length(); i++) {
            array[i] = String.valueOf(s.charAt(i));
        }
        return array;
    }

    public static boolean equals(String[] list1, String[] list2) {
        for (int i = 0; i < list1.length; i++) {
            if (!(list1[i].equals(list2[i])))
                return false;
        }
        return true;
    }

    public static String printArray(String[] arr) {
        String x = "";
        for(String n : arr)
            x += n;
        return x;
    }

    public static int contains(String[] arr, String x) {
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i].equals(x))
                return i;
        }
        return -1;
    }

}
