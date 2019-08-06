/**
 * 
 */

/**
 * @author saupadhyayula
 *
 */
import java.util.*;
class userMainCode13 {
	String swapPairs(String a){
		char[] test = a.toCharArray();
		for (int i=0;i<a.length()&&i+1<a.length();i=i+2){
			char temp;
			temp = test[i];
			test[i]=test[i+1];
			test[i+1]=temp;
		}
		return String.valueOf(test);
	}
}
public class Problem13 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String n;
        Scanner s = new Scanner(System.in);
        n = s.nextLine();
        userMainCode13 obj = new userMainCode13();
		String result;
		result = obj.swapPairs(n);
		System.out.println(result);
	}

}
