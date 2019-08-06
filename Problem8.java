import java.util.ArrayList;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author saupadhyayula
 *
 */
class userMainCode8{
	int getKaprekarNumber(int a){
		int square= a*a;
		int length = (int)(Math.log10(a)+1);
		int fSquare=(int) (square/Math.pow(10, length));
		int sSquare=(int) (square%Math.pow(10, length));
		if (fSquare+sSquare==a){
			return 1;
		}
		else
			return -1;
	}
}
public class Problem8 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        userMainCode8 obj = new userMainCode8();
		int result;
		result = obj.getKaprekarNumber(n);
//		System.out.println(result);
		if (result==1)
			System.out.println("Kaprekar Number");
		else 
			System.out.println("Not Kaprekar Number");
	}

}
