package Example1;

/**
 *  Created by User on 22/05/2017.
 */
public class Test {
    public static void main(String[] args) {

        Time time = new Time();
        Time time2 = new Time(555550000);
        Time time3 = new Time(System.currentTimeMillis());

        System.out.println(time.toString());
        System.out.println(time2.toString());
        System.out.println(time3.toString());

    }
}
