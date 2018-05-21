package Example1;

/**
 * Created by User on 26/05/2017.
 */
public class Test {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(7, 4, 5, "yellow", true);

        System.out.println(triangle.getArea());
        System.out.println();
        System.out.println(triangle.getPerimeter());
        System.out.println();
        System.out.println(triangle.dateCreated);
        System.out.println("\n");
        System.out.println(triangle.toString());

    }
}
