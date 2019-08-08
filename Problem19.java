
import java.util.Scanner;

class UserMainCode19 {

    static String getLastLetter(String s) {
        String[] arr = s.split(" ");
        String ret = "";
        for (String str : arr) {
            ret += str.charAt(str.length() - 1) + "$";
        }
        return ret.substring(0, ret.length() - 1).toUpperCase();
    }
}

public class Problem19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(UserMainCode19.getLastLetter(s));
    }
}
