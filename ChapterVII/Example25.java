import java.util.Scanner;

/**
 *  Created by User on 04/01/2017.
 */
public class Example25 {
    public static void main(String[] args) {
        double[] eqn = new double[3];
        double[] roots = new double[3];
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the a, b and c: ");
        for (int i = 0; i < eqn.length; i++)
            eqn[i] = scan.nextDouble();

        int numberOfRoots = solveQuadratic(eqn, roots);

        if (numberOfRoots == 0)
            System.out.println("No real roots. ");
        else {
            for (int i = 0; i < numberOfRoots; i++) {
                System.out.println("Root " + (i + 1) + " = " + roots[i]);
            }
        }
    }

    public static int solveQuadratic(double[] eqn, double[] roots) {

        double discriminant = (eqn[1] * eqn[1]) - (4 * eqn[0] * eqn[2]);

        if (discriminant > 0) {
            roots[0] = (-eqn[1] + Math.sqrt(discriminant) / (2 * eqn[0]));
            roots[1] = (-eqn[1] - Math.sqrt(discriminant) / (2 * eqn[0]));
            return 2;
        }
        if (discriminant == 0) {
            roots[0] = (-eqn[1] / (2 * eqn[0]));
            return 1;
        }
        return 0;
    }

}
