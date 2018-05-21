package Example11;

/**
 *  Created by User on 07/04/2017.
 */
// (Algebra: 2x2 linear equations)

public class LinearEquation {
    private double a, b, c, d, e, f;

    public LinearEquation(double a, double b, double c, double d, double e, double f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }

    public boolean isSolveable() {
        return ((a * d) - (b * c)) != 0;
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

    public double getD() {
        return d;
    }

    public double getE() {
        return e;
    }

    public double getF() {
        return f;
    }

    public double getX() {

        return (e * d - b * f) / (a * d - b * c);

    }

    public double getY() {
        return (a * f - e * c) / (a * d - b * c);
    }

    @Override
    public String toString() {
        if (isSolveable())
            return "The result is (" + getX() + ", " + getY() + ")";
        return "The equation has no solution.";
    }
}

