import java.util.Scanner;

/**
 * 
 */

/**
 * @author saupadhyayula
 *
 */
class userMainCode18 {
	Boolean validatePan(String a){
		char [] test = a.toCharArray();
		int letter = 0;
		int symbol = 0;
		int digit = 0;
		if (a.length()!=8){
			return false;
		}
		for (int i=0;i<a.length();i++){
			if ((i>2)&&(i<7))
				if (!(Character.isDigit(test[i])))
						{
						return false;}
			
			if (((i<2)||(i==7)))
				if (!(Character.isUpperCase(test[i])))
				{
				return false;}
		}
		return true;
	}
}
public class Problem18 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
				String n;
		        Scanner s = new Scanner(System.in);
		        n = s.nextLine();
		        userMainCode18 obj = new userMainCode18();
				boolean result;
				result = obj.validatePan(n);
				if (result)
					System.out.println("valid");
				else
					System.out.println("Not Valid");
			}

		}

