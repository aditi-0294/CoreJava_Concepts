// display sum of digits of a given number :

package Test;

import java.util.* ;

public class P9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sum = 0;
	
		Scanner scan = new Scanner(System.in) ;
		
		System.out.println("Enter number : ");
		int num = scan.nextInt();
		
		int a ;
		/*
		 * do {
				
			a = num % 10 ;
			sum = sum + a ;
			num = num / 10 ;
			
		}
		while(num > 0) ;
		*/
		
		for(sum = 0 ; num > 0 ; num = num / 10 ) {
			a = num % 10;
			sum = sum + a ;
		}
		System.out.println("Sum of digits = " + sum);
 }

}