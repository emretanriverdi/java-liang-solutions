import java.net.URL;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Currency {
    public static void main(String[] args) throws Exception {

        System.out.println("|  Time   |   USDTRY   |   EURTRY   |");

        while (true) {
            System.out.println("-------------------------------------");
            Thread.sleep(1000);
            URL url = new URL("http://dolar.tlkur.com");
            Scanner scan = new Scanner(url.openStream());

            String elements = "";
            while (scan.hasNext()) {
                String a = scan.nextLine();
                elements = elements.concat(a + "\n");
            }
            System.out.println("|  " + getTime() + "  |   " + getDollar(elements) + "   |" + "   " + getEuro(elements) + "   |");
        }

    }

    public static String getDollar(String s) {
        String m = "";
        String find = "id=\"USDTRY\">";

        int index = s.indexOf(find) + find.length();
        for (int i = 0; i < 6; i++)
            m = m.concat(String.valueOf(s.charAt(index + i)));

        return m;

    }
    public static String getTime() {
        GregorianCalendar calendar = new GregorianCalendar();

        String m = "";
        String x = String.valueOf(calendar.getTime());
        for (int i = 0; i < x.length(); i++)
            if (x.charAt(i) == ':') {
                for (int j = -2; j < 3; j++)
                    m = m.concat(String.valueOf(x.charAt(i + j)));

                break;
            }

        return m;
    }
    public static String getEuro(String s) {
        String m = "";
        String find = "id=\"EURTRY\">";

        int index = s.indexOf(find) + find.length();
        for (int i = 0; i < 6; i++)
            m = m.concat(String.valueOf(s.charAt(index + i)));

        return m;

    }

}
