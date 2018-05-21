package Example2;

/**
 * Created by User on 23/05/2017.
 */
public class Person {
    String name, adress, phoneNumber, eMail;

    public Person(String name, String adress, String phoneNumber, String eMail) {
        this.name = name;
        this.adress = adress;
        this.phoneNumber = phoneNumber;
        this.eMail = eMail;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Name: " + name + "\n" + "Adress: " + adress + "\n" + "Phone number: " + phoneNumber + "\n" + "e-mail: " + eMail;
    }

}
