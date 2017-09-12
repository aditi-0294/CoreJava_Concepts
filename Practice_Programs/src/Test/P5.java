// Check for prime number 

package Test;

import java.util.Scanner ;

public class P5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int div_count = 0 ;
		
		Scanner scan = new Scanner(System.in) ;
		
		System.out.println("Enter a number to check : ");
		int num = scan.nextInt();
		
		for(int i = 1 ; i <= num ; i++) {
			
			// Condition to check if number is not prime
			if(num % i == 0) {
				
				div_count++ ;
				
			}
		}
			
			if(div_count == 2) {  // i.e. , number is divisible by 1 and itself .... 
				System.out.println(num + " is prime ... ");
			}
			else {
				System.out.println(num + " is not prime .... ");
			}
		}

}
