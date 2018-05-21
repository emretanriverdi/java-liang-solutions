package Example9;

/**
 *  Created by User on 07/04/2017.
 */
public class Test {
    public static void main(String[] args) {
        RegularPolygon polygon = new RegularPolygon();
        RegularPolygon polygon2 = new RegularPolygon(6,4);
        RegularPolygon polygon3 = new RegularPolygon(10, 4, 5.6, 7.8);

        System.out.println("The area is " + polygon.getArea());
        System.out.println("The perimeter is " + polygon.getPerimeter() + "\n");

        System.out.println("The area is " + polygon2.getArea());
        System.out.println("The perimeter is " + polygon2.getPerimeter() + "\n");

        System.out.println("The area is " + polygon3.getArea());
        System.out.println("The perimeter is " + polygon3.getPerimeter() + "\n");


    }
}
