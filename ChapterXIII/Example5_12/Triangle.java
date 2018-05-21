package Example5_12;

import java.text.DecimalFormat;
import java.util.Date;

/**
 * Created by User on 26/05/2017.
 */
public class Triangle extends GeometricObject implements Colorable {
    double side1, side2, side3;
    Date dateCreated = getDateCreated();

    public Triangle(double side1, double side2, double side3, String color, boolean filled) {
        super(color, filled);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public double getArea() {
        double u = (side1 + side2 + side3) / 2;
        DecimalFormat df = new DecimalFormat("#.##");
        return Double.parseDouble(df.format(Math.sqrt(u * (u - side1) * (u - side2) * (u - side3))));

    }

    @Override
    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    @Override
    public String toString() {
        return super.toString() + "\narea: " + getArea() + "\nperimeter: " + getPerimeter();
    }

    @Override
    public String howToColor() {
        return "Color all three sides";
    }


}