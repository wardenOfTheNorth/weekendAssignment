import java.util.Scanner;

/**
 * 
 */

/**
 * @author saupadhyayula
 *
 */
class userMainCode9{
	String storeMaxVowelWord(String a){
		String[] arrOfStr = a.split(" ");
		String result = "";
		int maxNoVowels = 0;
		int temp=0;
		String name;
		for (String nam : arrOfStr){
			temp=0;
			name=nam.toLowerCase();
			for (int i =0; i < name.length();i++){
				if ((name.charAt(i)=='a')||(name.charAt(i)=='e')||(name.charAt(i)=='i')||(name.charAt(i)=='o')||(name.charAt(i)=='u')){
					temp++;
				}
			}
		if (temp>maxNoVowels){
			maxNoVowels=temp;
			result=nam;
		}
		
	}
		return result;
}
}
	
public class Problem9 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String n;
        Scanner s = new Scanner(System.in);
        n = s.nextLine();
        userMainCode9 obj = new userMainCode9();
		String result;
		result = obj.storeMaxVowelWord(n);
		System.out.println(result);
	}
}
