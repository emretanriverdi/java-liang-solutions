package Example2;

/**
 *  Created by User on 06/04/2017.
 */
public class Stock {
    public String symbol;
    public String name;
    public double previousClosingPrice;
    public double currentPrice;

    public Stock(String x, String y, double previousClosingPrice, double currentPrice) {
        symbol = x;
        name = y;
        this.previousClosingPrice = previousClosingPrice;
        this.currentPrice = currentPrice;
    }

    public double getChangePercent() {
        return ((int) (((Math.abs((currentPrice - previousClosingPrice)) * 100) / previousClosingPrice) * 100)) / 100.0;
    }

    public static void main(String[] args) {
        Stock stock = new Stock("ORCL", "Oracle Corporation", 34.5, 47);

        System.out.println("The change percent is %" + stock.getChangePercent());

    }
}
