/**
 * 
 */

/**
 * @author saupadhyayula
 *
 */
import java.util.Scanner;
import java.util.Arrays;

class userMainCode2

    {

        int addUniqueEven() 

        {

            int n, sum = 0;

            Scanner s = new Scanner(System.in);

            System.out.print("Enter no. of elements you want in array:");

            n = s.nextInt();

            int a[] = new int[n];

            System.out.println("Enter all the elements:");

            for(int i = 0; i < n; i++)
            {
                a[i] = s.nextInt();
            }
            Arrays.sort(a);
            for (int i = 0; i < a.length; i++) {
            	   if (i==0){
            		   if(a[i]%2 ==0){sum+=a[i];}
            		   continue;
            	   }
            	   if (i>0){
            		   if (a[i]!=a[i-1] & a[i]%2==0){sum+=a[i];}
            	   }
            	   }
            
            return sum;

        }

    }




public class Problemtwo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		userMainCode2 obj = new userMainCode2();
		int result=0;
		result = obj.addUniqueEven();
		if (result==0){
			System.out.println("no even numbers");
		}
		else{
		System.out.println("Sum:"+ result);
	
		}
	}
}
