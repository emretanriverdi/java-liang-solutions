package Example8;

/**
 *  Created by User on 07/04/2017.
 */
public class Test {
    public static void main(String[] args) {
        Fan fan = new Fan();
        Fan fan2 = new Fan();

        fan.setSpeed(3);
        fan.setRadius(10);
        fan.setColor("yellow");
        fan.setOn(true);

        fan2.setSpeed(2);
        fan2.setRadius(5);
        fan2.setColor("blue");
        fan2.setOn(false);

        System.out.println(fan.toString() + "\n");
        System.out.println(fan2.toString());

    }
}
