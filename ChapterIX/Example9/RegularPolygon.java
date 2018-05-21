package Example9;

/**
 *  Created by User on 07/04/2017.
 */
// (Geometry : n-sided regular polygon)

public class RegularPolygon {

    private int n = 3;
    private double side = 1;
    private double x = 0;
    private double y = 0;

    public RegularPolygon() {

    }

    public RegularPolygon(int n, double side) {
        this.n = n;
        this.side = side;
    }

    public RegularPolygon(int n, double side, double x, double y) {
        this.n = n;
        this.side = side;
        this.x = x;
        this.y = y;
    }

    public int getN() {
        return n;
    }

    public double getSide() {
        return side;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getPerimeter() {
        return n * side;
    }

    public double getArea() {
        return ((int) ((((n * side * side)) / (4 * Math.tan(Math.PI / n))) * 100)) / 100.0;
    }

}
