import java.util.Scanner;
import java.util.*;
class userMainCode3{
	int countNoOfWords(String str, String b){
		String[] parts = b.split(" ");
		String part2 = parts[1];
		// split the string by spaces in a 
		String a[] = str.split(" "); 

		// search for pattern in a 
		int count = 0; 
		for (int i = 0; i < a.length; i++) 
		{ 
		// if match found increase count 
		if (part2.equals(a[i])) 
			count++; 
		} 

		return count; 
	}
}
public class Problem3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a;
		String b;
		Scanner sc = new Scanner(System.in);
		a = sc.nextLine();
		b = sc.nextLine();
		userMainCode3 obj = new userMainCode3();
		int count;
		count = obj.countNoOfWords(a, b);
		System.out.println(count);
	}
}
