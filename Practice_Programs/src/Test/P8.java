// Display prime numbers in a given range .....

package Test;

import java.util.Scanner ;

public class P8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int div_count = 0;	
		int flag = 0;
		
		Scanner scan = new Scanner(System.in) ;
		
		System.out.println("Enter start range : ");
		int start = scan.nextInt();
		
		System.out.println("Enter end range : ");
		int end = scan.nextInt();
		
		/*
		if(end < 2) {
			System.out.println("There are no primes ... ");
		}
		*/
		
		System.out.println("Prime numbers in the range " + start + " to " + end + " : ");
			
		int temp_start = start ;
		/*
		if(start % 2 == 0) {
			start++ ;
		}
		*/
		
		for(int i = start; i <= end; i = i + 1) {
			int j ;
			for(j = 2; j < i ; j++) {
				
				if(i % j == 0) {
					
					//flag = 0;
					break;
				}
				
				//else 
					//flag = 1; 
			}
			
			if(i == j) {
			    System.out.println(i);
			
			//	div_count++ ;
			}
		}
			
		//System.out.println("Number of prime numbers : " + div_count);
	}
 }

