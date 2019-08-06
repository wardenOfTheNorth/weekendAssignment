import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

class UserMainCode25 {

    static String getAge(String db) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate present = LocalDate.parse("01/01/2015", formatter);
        LocalDate dateOfBirth = LocalDate.parse(db, formatter);
        return Period.between(dateOfBirth, present).getYears() >= 18 ? "eligible" : "not-eligible";
    }
}

public class Problem25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String dateOfBirth = sc.nextLine();
        System.out.println(UserMainCode25.getAge(dateOfBirth));
    }
}