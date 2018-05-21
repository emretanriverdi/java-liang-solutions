package Example2;

/**
 * Created by User on 23/05/2017.
 */
public class Test {
    public static void main(String[] args) {
        Person person = new Person("Jason", "New Oak 2142C-62", "+125329521", "jasonoak@windowslive.com");
        Student student = new Student("Mark", "Cleveland 1142A-32", "+14792952", "studentmark@windowslive.com", "Sophomere");
        Employee employee = new Employee("Wallace", "New Jersey 214-K", "+1634215", "deezNuts521@windowslive.com", "3rd Floor, 7th room", 2000);
        Faculty faculty = new Faculty("Emr", "Bag Cd.", "+1251241514", "tanriverdi.emre2@gmail.com", "2nd floor, 11th room", 425, "Assistant");

        System.out.println(person.toString() + "\n");
        System.out.println(student.toString() + "\n");
        System.out.println(employee.toString() + "\n");
        System.out.println(faculty.toString() + "\n");

    }
}
