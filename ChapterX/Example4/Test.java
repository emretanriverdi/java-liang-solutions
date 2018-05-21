package Example4;

/**
 *  Created by User on 22/05/2017.
 */
public class Test {
    public static void main(String[] args) {
        MyPoint myPoint = new MyPoint();
        MyPoint myPoint1 = new MyPoint(10, 30.5);

        System.out.println(myPoint.distance(myPoint1));

    }
}
