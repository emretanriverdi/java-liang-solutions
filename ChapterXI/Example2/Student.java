package Example2;

/**
 * Created by User on 23/05/2017.
 */
public class Student extends Person {
    final String CLASS_STATUS;

    public Student(String name, String adress, String phoneNumber, String eMail, String CLASS_STATUS) {
        super(name, adress, phoneNumber, eMail);
        this.CLASS_STATUS = CLASS_STATUS;
    }

    public String getCLASS_STATUS() {
        return CLASS_STATUS;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + "Class status: " + CLASS_STATUS;
    }

}
