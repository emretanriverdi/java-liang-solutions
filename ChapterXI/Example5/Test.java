package Example5;

import java.util.ArrayList;

/**
 *  Created by User on 22/05/2017.
 */
public class Test {
    public static void main(String[] args) {
        Course course = new Course("Calculus");

        course.addStudent("Emre");
        course.addStudent("Esin");
        course.addStudent("Sena");
        course.addStudent("Batu");

        course.dropStudent("Sena");

        ArrayList<String> list = course.getStudents();
        System.out.println(list.toString());

    }
}