import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author saupadhyayula
 *
 */
class userMainCode22{
	ArrayList<String> getName(HashMap<Integer, String> map){
		ArrayList<String> result = new ArrayList<String>();
		String S;
		char a;
				
		for (int name: map.keySet()){
			S = map.get(name);
			a = S.charAt(S.length()-1);
			if (Character.isUpperCase(a))
				result.add(S);
		}
		return result;
	}
}
public class Problem22 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int n;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in HashMap:");
        n = s.nextInt();
        HashMap<Integer, String> map = new HashMap<>(); 
		//print(map);
        int j;
        for (int i=0;i<n;i++){
        	j = s.nextInt();
        	s.nextLine();
        	map.put(j, s.nextLine());
        }
//		System.out.println("Size of map is:- " + map.size()); 
		userMainCode22 obj = new userMainCode22();
		ArrayList<String> result;
		result = obj.getName(map);
		System.out.println(result);
	}
}

