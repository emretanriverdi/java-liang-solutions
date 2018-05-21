package Example16_20__BigInteger;

import java.math.BigInteger;
import java.util.Arrays;

/**
 *  Created by User on 22/05/2017.
 */
public class Example16 {
    public static void main(String[] args) {
        BigInteger bigInteger = new BigInteger("10000000000000000000000000000000000000000000000000");

        BigInteger[] arr = new BigInteger[10];



        int i = 0;
        while (i < 10) {
            if (((bigInteger.remainder(new BigInteger("2"))).longValue()) == 0 ||((bigInteger.remainder(new BigInteger("3"))).longValue()) == 0) {
                arr[i] = bigInteger;
                i++;
            }

            bigInteger = bigInteger.add(BigInteger.ONE);
        }

        System.out.println(Arrays.toString(arr));
    }
}
