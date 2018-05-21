/**
 *  Created by User on 15.12.2016.
 */

public class Example26 {
    public static void main(String[] args) {

        String s;
        double numberPerLine = 0;

        for (int i = 3; i <= 94400; i += 2) {

            boolean isPrime = true;

            for (int j = 3; j <= Math.sqrt(i); j++) {

                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            s = String.valueOf(i);
            String x = "";

            if (isPrime) {

                for (int j = s.length() - 1; j >= 0; j--) {

                    x += s.charAt(j);

                }

                if (s.equals(x)) {
                    numberPerLine++;

                    if (!(numberPerLine % 10 == 0))
                    System.out.print(i + " ");
                    else System.out.println(i);
                }
            }
        }
    }
}