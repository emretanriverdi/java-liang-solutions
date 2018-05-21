package Example3;

/**
 *  Created by User on 22/05/2017.
 */
public class MyInteger {

    int value;

    public MyInteger(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public boolean isEven() {
        return (value % 2 == 0);
    }

    public boolean isOdd() {
        return (value % 2 != 0);
    }

    public boolean isPrime() {
        if (value % 2 == 0) return false;
        for (int i = 3; i * i < value; i += 2)
            if (value % i == 0) return false;
        return true;
    }

    public static boolean isEven(MyInteger myInteger) {

        return (myInteger.value % 2 == 0);
    }

    public static boolean isOdd(MyInteger myInteger) {

        return (myInteger.value % 2 != 0);
    }

    public static boolean isPrime(MyInteger myInteger) {

        int value = myInteger.value;

        if (value % 2 == 0) return false;
        for (int i = 3; i * i < value; i += 2)
            if (value % i == 0) return false;
        return true;
    }

    public boolean equals(int x) {

        return (value == x);
    }

    public boolean equals(MyInteger x) {

        return (this.value == x.value);
    }

    public static int parseInt(char[] x) {
        String a = "";
        for (int i = 0; i < x.length; i++)
            a += x[i];

        return Integer.parseInt(a);
    }

    public static int parseInt(String m) {

        return Integer.parseInt(m);
    }

}
