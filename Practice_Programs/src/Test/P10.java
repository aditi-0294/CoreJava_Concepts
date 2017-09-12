// Palindrome number :

package Test;

import java.util.Scanner ;

public class P10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int reverse = 0 ;
		int remainder = 0 ;
		
		Scanner scan = new Scanner(System.in) ;
		
		System.out.println("Enter number : ");
		int num = scan.nextInt();
		
		int a = num ;
		
		do {
			remainder = num % 10;
			reverse = reverse * 10 + remainder ;
			num = num / 10;
		} while(num > 0) ;
		
		if(a == reverse)
			System.out.println(a + " is a Palindrome ... ");
		else
			System.out.println(a + " is not a Palindrome .... ");

	}

}
