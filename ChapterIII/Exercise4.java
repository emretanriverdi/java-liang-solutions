/**
 *  Created by User on 30.11.2016.
 */
public class Exercise4 {
    public static void main(String[] args) {
        int month = (int) (Math.random() * 12) + 1;
        System.out.println("Your lucky number is " + month);
        String monthName = "";
        switch (month) {
            case 1: monthName = "January"; System.out.println("Your lucky month is " + monthName); break;
            case 2: monthName = "February"; System.out.println("Your lucky month is " + monthName); break;
            case 3: monthName = "March"; System.out.println("Your lucky month is " + monthName); break;
            case 4: monthName = "April"; System.out.println("Your lucky month is " + monthName); break;
            case 5: monthName = "May"; System.out.println("Your lucky month is " + monthName); break;
            case 6: monthName = "June"; System.out.println("Your lucky month is " + monthName); break;
            case 7: monthName = "July"; System.out.println("Your lucky month is " + monthName); break;
            case 8: monthName = "August"; System.out.println("Your lucky month is " + monthName); break;
            case 9: monthName = "September"; System.out.println("Your lucky month is " + monthName); break;
            case 10: monthName = "October"; System.out.println("Your lucky month is " + monthName); break;
            case 11: monthName = "November"; System.out.println("Your lucky month is " + monthName); break;
            case 12: monthName = "December"; System.out.println("Your lucky month is " + monthName); break;

        }
    }
}
