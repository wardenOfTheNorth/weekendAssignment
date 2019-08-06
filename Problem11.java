import java.util.Scanner;

/**
 * 
 */

/**
 * @author saupadhyayula
 *
 */

class userMainCode11 {
	String highestScorer(String[] a,int n){
		String temp = null;
//		String[] str = new String[4];
		int highest = 0;
		int sum = 0;
		int number=0;
		for (int j =0; j<n;j++){
			sum = 0;
			String[] str = a[j].split("-");
//			System.out.println(str);
//			System.out.println(a[j]);
			for (int k=1; k<4;k++){
				System.out.println(str[k]);
				number=Integer.parseInt(str[k]);
				sum+=number;
			}
			if (sum>highest){
				highest=sum;
				temp = str[0];
			}
		}
		return temp;
	}
}
public class Problem11 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        s.nextLine();
        String[] asdf = new String [n];
        for (int i=0;i<n;i++){
        	asdf[i]= s.nextLine();
        }
        userMainCode11 obj = new userMainCode11();
		String result;
		result = obj.highestScorer(asdf,n);
		System.out.println(result);
	}

}