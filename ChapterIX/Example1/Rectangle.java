package Example1;

/**
 *  Created by User on 06/04/2017.
 */
public class Rectangle {
    double width = 1;
    double height = 1;

    public Rectangle() {

    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return 2 * (width + height);
    }

    @Override
    public String toString() {
        return "The width is " + width + "\nThe height is " + height + "\nThe area is " + ((int) (getArea() * 1000)) / 1000.0 + "\nThe perimeter is " + getPerimeter() + "\n";
    }

}
