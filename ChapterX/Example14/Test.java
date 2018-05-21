package Example14;

import java.math.BigInteger;

/**
 *  Created by User on 22/05/2017.
 */
public class Test {
    public static void main(String[] args) {
        MyDate myDate = new MyDate();
        System.out.println(myDate.toString());

        BigInteger integer = new BigInteger("561555550000");

        myDate.setDate(integer.longValue());


        System.out.println(myDate.toString());


    }
}
