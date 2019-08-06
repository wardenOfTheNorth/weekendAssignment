import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

class UserMainCode21 {

    static String getDay(String s) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-dd-yyyy");
        return LocalDate.parse(s, formatter).getDayOfWeek().toString();
    }
}

public class Problem21 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.next();
        System.out.println(UserMainCode21.getDay(str));
    }
}
