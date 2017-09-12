// Perfect Number 

package Test;

import java.util.Scanner ;

public class P6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i ; 
		
		int sum = 0 ;
		Scanner scan = new Scanner(System.in) ;
		
		System.out.println("Enter a number to check for perfect number condition : ");
		int num = scan.nextInt();
		
		for(i = 1 ; i < num ; i++) {
			
			if(num % i == 0 ) {
				sum = sum + i ;
			}
		}
		
		if(sum == num)
			System.out.println(num + " is a Perfect Number .... ");
		else
			System.out.println(num + " is not a perfect number ... ");
	}

}
