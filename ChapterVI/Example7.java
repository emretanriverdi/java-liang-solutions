/**
 *  Created by User on 15.12.2016.
 */
public class Example7 {
    public static void main(String[] args) {
        System.out.println("Celcius\t Fahrenheit\t|\tFahrenheit\tCelcius");
        System.out.println("___________________________________________");
        System.out.print("40.0 \t" + celciusToFahrenheit(40) + "\t\t|" + "\t120.0 \t" + fahrenheitToCelcius(120.0));
        System.out.print("\n39.0 \t" + celciusToFahrenheit(39) + "\t\t|" + "\t120.0 \t" + fahrenheitToCelcius(110.0));
        System.out.print("\n38.0 \t" + celciusToFahrenheit(38) + "\t\t|" + "\t120.0 \t" + fahrenheitToCelcius(100.0));
        System.out.print("\n37.0 \t" + (int) ((celciusToFahrenheit(37) * 100)) / 100.0 + "\t\t|" + "\t120.0 \t" + fahrenheitToCelcius(90.0));
        System.out.print("\n36.0 \t" + celciusToFahrenheit(36) + "\t\t|" + "\t120.0 \t" + fahrenheitToCelcius(80.0));
        System.out.print("\n35.0 \t" + celciusToFahrenheit(35) + "\t\t|" + "\t120.0 \t" + fahrenheitToCelcius(70.0));
        System.out.print("\n34.0 \t" + celciusToFahrenheit(34) + "\t\t|" + "\t120.0 \t" + fahrenheitToCelcius(60.0));
        System.out.print("\n33.0 \t" + celciusToFahrenheit(33) + "\t\t|" + "\t120.0 \t" + fahrenheitToCelcius(50.0));
        System.out.print("\n32.0 \t" + celciusToFahrenheit(32) + "\t\t|" + "\t120.0 \t" + fahrenheitToCelcius(40.0));
    }


    public static double celciusToFahrenheit(double celcius) {
        return (9.0 / 5) * celcius + 32;
    }
    public static double fahrenheitToCelcius(double fahrenheit) {
        return ((5.0 / 9) * (fahrenheit - 32));
    }
}
