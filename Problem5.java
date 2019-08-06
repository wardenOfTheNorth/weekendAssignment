/**
 * 
 */

/**
 * @author saupadhyayula
 *
 */
import java.util.*;

class userMainCode5{
	int getAverageOfOdd(HashMap<Integer, Integer> map){
		int sum=0;
		int num=0;
		for (int name: map.keySet()){
			if (name%2==1){
				sum+=map.get(name);
				num++;
			}
		}
		return sum/num;
		
	}
}

public class Problem5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in HashMap:");
        n = s.nextInt();
        HashMap<Integer, Integer> map = new HashMap<>(); 
		//print(map);
        for (int i=0;i<n;i++){
        	map.put(s.nextInt(), s.nextInt());
        }
//		System.out.println("Size of map is:- " + map.size()); 
		userMainCode5 obj = new userMainCode5();
		int result;
		result = obj.getAverageOfOdd(map);
		System.out.println(result);
        
	}

}
