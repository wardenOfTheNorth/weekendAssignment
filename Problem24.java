import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

class UserMainCode24 {

    static int getLastDayOfMonth(String inp) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate date = LocalDate.parse(inp, formatter);
        return date.getMonth().length(date.isLeapYear());
    }
}

public class Problem24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(UserMainCode24.getLastDayOfMonth(str));
    }
}