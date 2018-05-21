package Example13;

/**
 *  Created by User on 07/04/2017.
 */
public class Location {

    public int row, column;
    public double maxValue;

    public Location(int row, int column, double maxValue) {
        this.row = row;
        this.column = column;
        this.maxValue = maxValue;
    }

    @Override
    public String toString() {
        return "The location of the largest element " + maxValue + " is at (" + row + ", " + column + ")";
    }

}
