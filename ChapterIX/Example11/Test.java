package Example11;

/**
 *  Created by User on 07/04/2017.
 */
public class Test {
    public static void main(String[] args) {
        LinearEquation equation = new LinearEquation(9, 4, 3, -5, -6, -21);
        LinearEquation equation2 = new LinearEquation(1,2,2,4,4,5);

        System.out.println(equation.toString());
        System.out.println(equation2.toString());
    }
}
