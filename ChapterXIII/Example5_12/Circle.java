package Example5_12;

/**
 * Created by User on 26/05/2017.
 */
public class Circle extends GeometricObject {
    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    /** Return radius */
    public double getRadius() {
        return radius;
    }

    /** Set a new radius */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override /* Return area */
    public double getArea() {
        return radius * radius * Math.PI;
    }

    /** Return diameter */
    public double getDiameter() {
        return 2 * radius;
    }

    @Override /* Return perimeter */
    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    @Override
    public boolean equals(Object c) {

        if (c instanceof Circle)
            return ((Circle) c).getRadius() == this.getRadius();

        return false;
    }

    @Override
    public String toString() {
        return "The circle is created " + getDateCreated() +
                " and the radius is " + radius;
    }

}