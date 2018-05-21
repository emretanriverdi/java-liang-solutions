package Example17;

import java.text.DecimalFormat;

/**
 * Created by User on 26/05/2017.
 */
public class Complex {

    double real = 0;
    double imaginary = 0;


    public Complex() {

    }

    public Complex(double a) {
        real = a;
    }

    public Complex (double a, double b) {
        real = a;
        imaginary = b;
    }

    public double getRealPart() {
        return real;
    }

    public double getImaginaryPart() {
        return imaginary;
    }

    @Override
    public String toString() {
        if (imaginary == 0)
            return real + "";

        return real + " + " + imaginary + "i";

    }

    public double abs() {
        DecimalFormat df = new DecimalFormat("#.##");
        return Double.parseDouble(df.format(Math.sqrt(real * real + imaginary * imaginary)));
    }

    public Complex add(Complex c) {
        return new Complex(this.getRealPart() + c.getRealPart(), this.getImaginaryPart() + c.getImaginaryPart());
    }

    public Complex substract(Complex c) {
        return new Complex(this.getRealPart() - c.getRealPart(), this.getImaginaryPart() - c.getImaginaryPart());
    }

    public Complex multiply(Complex c) {
        return new Complex((this.getRealPart() * c.getRealPart() - this.getImaginaryPart() * c.getImaginaryPart()), (this.getImaginaryPart() * c.getRealPart() + (this.getRealPart() * c.getImaginaryPart())));
    }

    public Complex divide(Complex c) {
        double firstPart = (this.getRealPart() * c.getRealPart()) + (this.getImaginaryPart() * c.getImaginaryPart());
        double secondPartDivide = c.getRealPart() * c.getRealPart() + c.getImaginaryPart() * c.getImaginaryPart();
        double thirdPart = this.getImaginaryPart() * c.getRealPart() - this.getRealPart() * c.getImaginaryPart();

        DecimalFormat df = new DecimalFormat("#.##");
        return new Complex(Double.parseDouble(df.format(firstPart / secondPartDivide)), Double.parseDouble(df.format(thirdPart / secondPartDivide)));
    }

}
