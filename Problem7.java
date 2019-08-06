/**
 * 
 */

/**
 * @author saupadhyayula
 *
 */
import java.util.*;
class userMainCode7{
	ArrayList<String> retirementEmployeeList(HashMap<String, String> map){
		System.out.println("Enter Todyas Date in DD/MM/YYYY Format");
		Scanner p = new Scanner(System.in);
		String date = p.nextLine();
		float dateValue;
		String[] arrOfStr = date.split("/");
		int y = Integer.parseInt(arrOfStr[2]);
		int m = Integer.parseInt(arrOfStr[1]);
		int d = Integer.parseInt(arrOfStr[0]);
		dateValue = (float) ((float)y +(float) m /12.0+(float)d/365.0);
		ArrayList<String> strList = new ArrayList<String>();
//		System.out.println(dateValue);
		String date2;
		float dateValue2;
		String[] arrOfStr2= new String[3];
		for (String name: map.keySet()){
			date2 = map.get(name);
//			System.out.println(date2);
			arrOfStr2 = date2.split("/");
//			System.out.println(arrOfStr2);
			int y2 = Integer.parseInt(arrOfStr2[2]);
			int m2= Integer.parseInt(arrOfStr2[1]);
			int d2 = Integer.parseInt(arrOfStr2[0]);
			dateValue2 = (float) ((float)y2 +(float) m2 /12.0+(float)d2/365.0);
			if (dateValue-dateValue2 >60.0){
				strList.add(name);
			}
		}
		return strList;
		
	}
}
public class Problem7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter no. of employees you want in HashMap:");
        n = s.nextInt();
        s.nextLine();
        HashMap<String, String> map = new HashMap<>(); 
		//print(map);
        for (int i=0;i<n;i++){
        	map.put(s.nextLine(), s.nextLine());
        }
        userMainCode7 obj = new userMainCode7();
		ArrayList<String> result;
		result = obj.retirementEmployeeList(map);
		System.out.println(result);
	}

}
