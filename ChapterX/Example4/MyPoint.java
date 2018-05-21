package Example4;

/**
 *  Created by User on 22/05/2017.
 */
public class MyPoint {
    double x, y;

    public MyPoint() {

    }

    public MyPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distance(MyPoint myPoint) {
        double x1 = this.x - myPoint.x;
        double y1 = this.y - myPoint.y;

        return ((int) ((Math.sqrt(((x1 * x1) + (y1 * y1)))) * 100000)) / 100000.0000;

    }

    public double distance(double x, double y) {
        double x1 = this.x - x;
        double y1 = this.y - y;

        return ((int) ((Math.sqrt(((x1 * x1) + (y1 * y1)))) * 100000)) / 100000.0000;

    }

}
