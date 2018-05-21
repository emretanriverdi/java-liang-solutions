package Example2;

/**
 * Created by User on 23/05/2017.
 */
public class Employee extends Person {
    String office;
    double salary;
    String dayHired;

    public Employee(String name, String adress, String phoneNumber, String eMail, String office, double salary) {
        super(name, adress, phoneNumber, eMail);
        MyDate myDate = new MyDate();
        this.office = office;
        this.salary = salary;
        this.dayHired = myDate.getDay() + "-" + myDate.getMonth() + "-" + myDate.getYear();

    }

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDayHired() {
        return dayHired;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + "Office location: " + office + "\n" + "Salary: " + salary + "$\n" + "Day hired: " + dayHired;
    }

}
