import java.util.Scanner;

/**
 *  Created by User on 10/02/2017.
 */
public class Example37 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int name = 0;
        int answer = 1;

        String[][] states = new String[50][2];
        states = getStates(states);

        int count = 0;
        while(name < 50) {

            System.out.print("What is the capital of " + states[name][0] + "?  ");
            String a = scan.nextLine();
            if (a.equalsIgnoreCase(states[name][answer])) {
                System.out.println("Your answer is correct.");
                count++;
            }
            else System.out.println("The correct answer should be " + states[name][answer] + ".");

            name++;
            System.out.println();
        }

        System.out.println("The correct count is " + count);

    }




    public static String[][] getStates(String[][] x) {
        x = new String[][]{{"Alabama", "Montgomery"}, {"Alaska", "Juneau"}, {"Arizona", "Phoenix"}, {"Arkansas", "Little Rock"}, {"California", "Sacramento"}, {"Colorado", "Denver"}, {"Connecticut", "Hartford"}, {"Delaware", "Dover"}, {"Florida", "Tallahassee"}, {"Georgia", "Atlanta"}, {"Hawaii", "Honolulu"}, {"Idaho", "Boise"}, {"Illinois", "Springfield"}, {"Indiana", "Indianapolis"}, {"Iowa", "Des Moines"}, {"Kansas", "Topeka"}, {"Kentucky", "Frankfort"}, {"Louisiana", "Baton Rouge"}, {"Maine", "Augusta"}, {"Maryland", "Annapolis"}, {"Massachusetts", "Boston"}, {"Michigan", "Lansing"}, {"Minnesota", "Saint Paul"}, {"Mississippi", "Jackson"}, {"Missouri", "Jefferson City"}, {"Montana", "Helena"}, {"Nebraska", "Lincoln"}, {"Nevada", "Carson City"}, {"New Hampshire", "Concord"}, {"New Jersey", "Trenton"}, {"New Mexico", "Santa Fe"}, {"New York", "Albany"}, {"North Carolina", "Raleigh"}, {"North Dakota", "Bismarck"}, {"Ohio", "Columbus"}, {"Oklahoma", "Oklahoma City"}, {"Oregon", "Salem"}, {"Pennsylvania", "Harrisburg"}, {"Rhode Island", "Providence"}, {"South Carolina", "Columbia"}, {"South Dakota", "Pierre"}, {"Tennessee", "Nashville"}, {"Texas", "Austin"}, {"Utah", "Salt Lake City"}, {"Vermont", "Montpelier"}, {"Virginia", "Richmond"}, {"Washington", "Olympia"}, {"West Virginia", "Charleston"}, {"Wisconsin", "Madison"}, {"Wyoming", "Cheyenne"}};

        return x;
    }

}
