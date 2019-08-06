/**
 * 
 */

/**
 * @author saupadhyayula
 *
 */
import java.util.Scanner;

class input {
	String a;
	String b;

	public input() {
		Scanner sc = new Scanner(System.in);
		this.a = sc.nextLine();
		this.b = sc.nextLine();
	}
}

class userMainCode {
	static Boolean check(String a, String b) {
		// Boolean success;
		String b1 = b.toUpperCase();
		if (b1.contains(a)) {
			return true;
		}
		String b2 = b.toLowerCase();
		if (b2.contains(a)) {
			return true;
		}
		return false;
	}

	String replacePlus(String a, String b) {
		String result = new String();
		result = "";
		for (int i = 0; i < a.length(); i++) {
			if (check(Character.toString(a.charAt(i)), b)) {
				result = result.concat(Character.toString(a.charAt(i)));
			} else {
				result = result.concat("+");
			}
		}
		return result;
	}
}

public class Problem1 {

	/**
	 * @param args
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		input obj = new input();
		String a = obj.a;
		String b = obj.b;
		String result = new String();
		userMainCode obj2 = new userMainCode();
		result = obj2.replacePlus(a, b);
		System.out.println(result);
	}

}
