package Example10;

/**
 *  Created by User on 07/04/2017.
 */
public class Test {
    public static void main(String[] args) {
        QuadraticEquation equation = new QuadraticEquation(1.0, 3, 1);
        QuadraticEquation equation2 = new QuadraticEquation(1.0, 2, 1);
        QuadraticEquation equation3 = new QuadraticEquation(1.0, 2, 3);

        System.out.println(equation.toString());
        System.out.println(equation2.toString());
        System.out.println(equation3.toString());

    }
}
