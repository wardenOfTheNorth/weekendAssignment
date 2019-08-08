import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class UserMainCode20 {

    static String getMaxKeyValue(Map<Integer, String> map) {
        int max = 0;
        String ans = "";
        for (int x : map.keySet()) {
            if (x > max) {
                max = x;
                ans = map.get(x);
            }
        }
        return ans;
    }
}

public class Twentieth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<Integer, String> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            String s = sc.next();
            map.put(x, s);
        }
        System.out.println(UserMainCode20.getMaxKeyValue(map));
    }
}
