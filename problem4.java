import java.util.Scanner;
import java.util.Arrays;
/**
 * 
 */

/**
 * @author saupadhyayula
 *
 */
class userMainCode4{
	int[] generateOddEvenList(int[] a, int[] b){
		int[] result = new int[a.length];
		for (int i=0;i<a.length;i++){
			if (i%2==0){result[i]=b[i];}
			else{result[i]=a[i];}
		}
		return result;
	}
}
public class problem4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in first array:");
        n = s.nextInt();
        int a[] = new int[n];
        System.out.println("Enter all the elements in first array:");
        for(int i = 0; i < n; i++)
        {
            a[i] = s.nextInt();
        }
        int b[] = new int [n];
        System.out.println("Enter all the elements in second array:");
        for(int i = 0; i < n; i++)
        {
            b[i] = s.nextInt();
        }
        userMainCode4 obj = new userMainCode4();
		int[] result = new int[n];
		result = obj.generateOddEvenList(a, b);
		System.out.println(Arrays.toString(result));
	}

}
