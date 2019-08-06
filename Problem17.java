import java.util.Scanner;

/**
 * 
 */

/**
 * @author saupadhyayula
 *
 */

class userMainCode17 {
	int findMaxDistance(int[] a,int n){
		int highestIndex = 0;
		int highest=0;
		int lowest=0;
		int lowestIndex=0;
		for (int i=0;i<n;i++){
			if (a[i]>highest){
				highest=a[i];
				highestIndex=i;
			}
			if(a[i]<lowest){
				lowest=a[i];
				lowestIndex=i;
			}
			
		}
		return highestIndex;
	}
}
public class Problem17 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        int[] a = new int[n];
        for (int i=0;i<n;i++){
        	a[i]=s.nextInt();
        }
        userMainCode17 obj = new userMainCode17();
		int result;
		result = obj.findMaxDistance(a, n);
		System.out.println(result);
	}

}
