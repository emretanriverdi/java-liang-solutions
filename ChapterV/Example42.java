/**
 *  Created by User on 3.12.2016.
 */
public class Example42 {
    public static void main(String[] strings) {

        int counter = 0;
        for (int i = 1; i < 8; i++){
            for (int j = i + 1; j < 8; j++) {
                System.out.println(i + " " + j);
                counter++;
            }
        }

        System.out.println("Total combination: " + counter);
    }
}
