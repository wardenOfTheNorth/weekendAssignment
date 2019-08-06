import java.util.Scanner;

class userMainCode14 {
	Boolean validatePassword(String a){
		char [] test = a.toCharArray();
		int letter = 0;
		int symbol = 0;
		int digit = 0;
		for (int i=0;i<a.length();i++){
			if (Character.isDigit(test[i]))
					digit=1;
			if(Character.isLetter(test[i]))
					letter = 1;
			if(( (test[i]>32)&&(test[i]<47))||(test[i]==64))
					symbol=1;
		}
		if ((letter==1)&&(symbol==1)&&(digit==1)&&(a.length()>7))
			return true;
		return false;
		
	}
}
public class Problem14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String n;
        Scanner s = new Scanner(System.in);
        n = s.nextLine();
        userMainCode14 obj = new userMainCode14();
		boolean result;
		result = obj.validatePassword(n);
		if (result)
			System.out.println("valid");
		else
			System.out.println("Not Valid");
	}

}
