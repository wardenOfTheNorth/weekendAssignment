/**
 * 
 */

/**
 * @author saupadhyayula
 *
 */
import java.util.HashMap;
import java.util.Scanner;

class userMainCode20{
	String getMaxKeyValue(HashMap<Integer, String> map){
		int max=0;
		for (int name: map.keySet()){
			if (name>1){
				max=name;
				
			}
		}
		return map.get(max);
	}
}
public class Problem20 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
//				System.out.println("Size of map is:- " + map.size()); 
				userMainCode20 obj = new userMainCode20();
				String result;
				result = obj.getMaxKeyValue(map);
				System.out.println(result);
		        
			}

		}