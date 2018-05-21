package Example3;

/**
 *  Created by User on 22/05/2017.
 */
public class Test {
    public static void main(String[] args) {
        MyInteger integer = new MyInteger(10);

        System.out.println(integer.getValue());
        System.out.println(integer.isEven());
        System.out.println(integer.isOdd());
        System.out.println(integer.isPrime());

        System.out.println(MyInteger.isEven(integer));
        System.out.println(MyInteger.isOdd(integer));
        System.out.println(MyInteger.isPrime(integer));

        System.out.println(integer.equals(10));
        MyInteger integer1 = new MyInteger(10);
        System.out.println(integer.equals(integer1));
        System.out.println(integer.equals(5));

        char[] x = {'3', '1', '2'};
        int d = MyInteger.parseInt(x);
        System.out.println(d);

        int n = MyInteger.parseInt("124512");
        System.out.println(n);

    }
}
