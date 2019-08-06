import java.util.Scanner;
import java.util.*;

/**
 * 
 */

/**
 * @author saupadhyayula
 *
 */
class userMainCode6{
	int getAnagram(String a, String b){
		int numChars = 256;
		char str1[] = a.toCharArray(); 
        char str2[] = b.toCharArray();
        int count1[] = new int[numChars]; 
        Arrays.fill(count1, 0); 
        int count2[] = new int[numChars]; 
        Arrays.fill(count2, 0);
        if (a.length() != b.length()){ 
            return -1; 
        }
        for (int i = 0; (i < a.length() )&& (i < b.length()); i++) { 
               count1[str1[i]]++; 
               count2[str2[i]]++; 
           } 
        for (int i = 0; i < numChars; i++) 
            if (count1[i] != count2[i]) 
                return -1;
        return 1; 
        
	}
}
public class Problem6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a;
		String b;
		Scanner sc = new Scanner(System.in);
		a = sc.nextLine();
		b = sc.nextLine();
		userMainCode6 obj = new userMainCode6();
		int result;
		result = obj.getAnagram(a, b);
		if (result==1)
			System.out.println("Anagrams");
		else 
			System.out.println("Not Anagrams");
	}

}
