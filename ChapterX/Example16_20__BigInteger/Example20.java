package Example16_20__BigInteger;

import java.math.BigDecimal;

/**
 *  Created by User on 22/05/2017.
 */
public class Example20 {
    public static void main(String[] args) {
        BigDecimal e = new BigDecimal("1");

        for (int i = 1; i <= 1000; i++) {
            e = e.add(new BigDecimal("1").divide(factorial(new BigDecimal(i + "")), 25, BigDecimal.ROUND_UP));
        }

        System.out.println(e);

    }

    public static BigDecimal factorial(BigDecimal d) {
        BigDecimal e = new BigDecimal("1");
        long lo = d.longValue();
        for (long i = 1; i <= lo; i++) {
            e = e.multiply(new BigDecimal(i));
        }
        return e;
    }
}
