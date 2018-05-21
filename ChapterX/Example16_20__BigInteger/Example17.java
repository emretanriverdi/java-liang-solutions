package Example16_20__BigInteger;

import java.math.BigInteger;

/**
 *  Created by User on 22/05/2017.
 */
public class Example17 {
    public static void main(String[] args) {
        long med = (long) Math.sqrt(Long.MAX_VALUE) + 1;

        BigInteger one = new BigInteger(med + "");
        BigInteger integer = one.multiply(one);

        int i = 0;
        while (i < 10) {
            System.out.print(integer + " ");
            med++;
            one = new BigInteger(med + "");
            integer = one.multiply(one);
            i++;
        }
    }
}
