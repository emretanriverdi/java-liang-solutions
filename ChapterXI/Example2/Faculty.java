package Example2;

/**
 * Created by User on 23/05/2017.
 */
public class Faculty extends Employee {
    String rank;

    public Faculty(String name, String adress, String phoneNumber, String eMail, String office, double salary, String rank) {
        super(name, adress, phoneNumber, eMail, office, salary);
        this.rank = rank;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + "Rank: " + rank;
    }

}
