package Example10;

/**
 *  Created by User on 07/04/2017.
 */
// (Algebra: Quadratic Equations)

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getDiscriminant() {
        return ((b * b) - (4 * a * c));
    }

    public double getRoot1() {
        return (-b + Math.sqrt(getDiscriminant())) / (2 * a);
    }

    public double getRoot2() {
        return (-b - Math.sqrt(getDiscriminant())) / (2 * a);
    }

    @Override
    public String toString() {
        if (getDiscriminant() == 0)
            return "The only root is " + getRoot1();
        if (getDiscriminant() < 0)
            return "The equation has no real roots.";

        return "Root 1 is " + getRoot1() + "\nRoot 2 is " + getRoot2();

    }

}
