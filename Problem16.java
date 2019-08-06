import java.util.Scanner;

/**
 * 
 */

/**
 * @author saupadhyayula
 *
 */

class userMainCode16 {
	String findOldDate(String a,String b){
		String date = a;
		float dateValue;
		String[] arrOfStr = date.split("-");
		int y = Integer.parseInt(arrOfStr[2]);
		int m = Integer.parseInt(arrOfStr[1]);
		int d = Integer.parseInt(arrOfStr[0]);
		dateValue = (float) ((float)y +(float) m /12.0+(float)d/365.0);
		date = b;
		float dateValue2;
	    arrOfStr = date.split("-");
		y = Integer.parseInt(arrOfStr[2]);
		m = Integer.parseInt(arrOfStr[1]);
		d = Integer.parseInt(arrOfStr[0]);
		dateValue2 = (float) ((float)y +(float) m /12.0+(float)d/365.0);
		if (dateValue<dateValue2)
			return a;
		return b;
	}
}
public class Problem16 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String n,n1;
        Scanner s = new Scanner(System.in);
        n = s.nextLine();
        n1 = s.nextLine();
        userMainCode16 obj = new userMainCode16();
		String result;
		result = obj.findOldDate(n, n1);
		System.out.println(result);
	}

}
				
