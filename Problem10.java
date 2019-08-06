import java.util.Scanner;
import java.util.*;
/**
 * 
 */

/**
 * @author saupadhyayula
 *
 */
class userMainCode10{
	ArrayList<Integer> performSetOperations(ArrayList<Integer> a,ArrayList<Integer> b,char v){
//		ArrayList<Integer> result;
		if(v=='+'){
			a.addAll(b);
		}
		if(v=='-'){
			a.removeAll(b);
		}
		if(v=='*'){
			a.retainAll(b);
		}
//		System.out.println("hello");
		return a;
		
	}
}
public class Problem10 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
        Scanner s = new Scanner(System.in);
//        System.out.print("Enter no. of elements you want in first array:");
        n = s.nextInt();
        ArrayList<Integer> a=new ArrayList<Integer>();
        ArrayList<Integer> b=new ArrayList<Integer>();
//        System.out.println("Enter all the elements in first array:");
        for(int i = 0; i < n; i++)
        {
            a.add(s.nextInt());
        }
       
//        System.out.println("Enter all the elements in second array:");
        for(int i = 0; i < n; i++)
        {
        	b.add(s.nextInt());
        }
        s.nextLine();
        char v;
        String temp=new String();
        temp = s.nextLine();
        v = temp.charAt(0);
		userMainCode10 obj = new userMainCode10();
		ArrayList<Integer> result;
		result = obj.performSetOperations(a,b,v);
		System.out.println(result);
			}

}
