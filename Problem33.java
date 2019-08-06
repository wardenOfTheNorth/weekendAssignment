import java.util.*;

public class Problem33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the binary integer");
        String bn = sc.nextLine();
        String on = sc.nextLine();
        String hexan = sc.nextLine();
        System.out.println(Integer.parseInt(bn, 2));
        System.out.println(Integer.parseInt(on, 8));
        System.out.println(Integer.parseInt(hexan, 16));
        System.out.println("Enter the second integer");

    }
}