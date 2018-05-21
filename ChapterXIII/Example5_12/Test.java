package Example5_12;

/**
 *  Created by User on 26/05/2017.
 */
public class Test {
    public static void main(String[] args) {
        Triangle triangle1 = new Triangle(5,6,7,"yellow", true);
        Triangle triangle2 = new Triangle(10,11,12,"red", false);
        Triangle triangleSame = new Triangle(5,6,7,"blue", true);

        System.out.println(triangle1.compareTo(triangle2));
        System.out.println(triangle1.compareTo(triangleSame));
        System.out.println(triangle1.equals(triangleSame) + "\n");
        System.out.println(Triangle.max(triangle1, triangle2) + "\n");
        System.out.println(triangle2.howToColor()+ "\n\n\n\n");


        Circle circle1 = new Circle(5);
        Circle circle2 = new Circle(8);
        Circle circle3 = new Circle(5);

        System.out.println(circle1.compareTo(circle2));
        System.out.println(circle1.compareTo(circle3));
        System.out.println(circle1.equals(circle3) + "\n\n\n");


        GeometricObject[] arr = {new Circle(9), new Circle(7), new Triangle(4,3,2,"yellow", false), new Triangle(6, 11, 7, "red", false)};

        System.out.println(GeometricObject.sumArea(arr));

    }
}
