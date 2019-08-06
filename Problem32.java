import java.util.*;

public class Problem32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first integer");
        int n1 = sc.nextInt();
        System.out.println("Enter the second integer");
        int n2 = sc.nextInt();
        System.out.println("Absolute value of " + n1 + "is" + Math.abs(n1));
        System.out.println("Absolute value of " + n2 + "is" + Math.abs(n2));
        String a = Math.abs(n1) == Math.abs(n2) ? Integer.toString(n1) + "=" + Integer.toString(n2)
                : Integer.toString(n1) + "!=" + Integer.toString(n2);
        System.out.println(a);
    }
}