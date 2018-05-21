package Example9;

/**
 *  Created by User on 22/05/2017.
 */
public class Course {
    private String courseName;
    private String[] students = new String[0];
    private int numberOfStudents;

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public void addStudent(String student) {
        String[] temp = students;
        students = new String[students.length + 1];
        students[numberOfStudents] = student;
        numberOfStudents++;

        for (int i = 0; i < temp.length; i++)
            students[i] = temp[i];

    }

    public String[] getStudents() {
        return students;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public String getCourseName() {
        return courseName;
    }

    public void dropStudent(String student) {
        numberOfStudents--;

        String[] temp = students;
        int count = 0;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(student)) {
                students[i] = " ";
                count = i;
                break;
            }
        }

       students = new String[numberOfStudents];

        for (int i = 0; i < students.length; i++) {
            students[i] = temp[i];
        }

        for (int i = count; i < students.length; i++) {
            students[i] = temp[i + 1];
        }

    }

    public void clear() {
        students = new String[1];
    }
}
