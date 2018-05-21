package Example8;

/**
 *  Created by User on 07/04/2017.
 */
public class Fan {
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;
    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";

    public Fan() {

    }

    @Override
    public String toString() {
        return isOn() ? "The speed is " + getSpeed() + "\nThe color is " + getColor() + "\nThe radius is " + getRadius() : "The color is " + color + "\nThe radius is " + radius + "\nThe fan is off.";
    }

    public String getSpeed() {
        if (speed == 1)
            return "SLOW";
        if (speed == 2)
            return "MEDIUM";

        else return "FAST";
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
