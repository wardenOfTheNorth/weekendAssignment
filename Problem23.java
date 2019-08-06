import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

class UserMainCode23 {

    static String convertDateFormat(String inp) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate date = LocalDate.parse(inp, formatter);
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        return date.format(formatter2).toString();
    }
}

public class Problem23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inp = sc.nextLine();
        System.out.println(UserMainCode23.convertDateFormat(inp));
    }
}