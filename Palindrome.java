package purchasings;
import java.util.*;

public class Palindrome {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number : ");
		int n = sc.nextInt();
		
		int r,flag =0;
		int digit=0;
			
		while(n != 0) {
			r= n % 10;
			digit = digit*10+r;
			n = n/10;
		}
		
		if(flag == 1) {
		System.out.println("The no. is palindrome");
	   }
		
		else {
			System.out.println("The no. is not a palindrome ");
		}
		
	}
	
}
