// Perfect Number in a given range :
package Test;

import java.util.Scanner ;

public class P12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int div_count = 0;
		int sum = 0 ;
		
		Scanner scan = new Scanner(System.in) ;
		
		System.out.println("Enter starting range : ");
		int start = scan.nextInt();
		
		System.out.println("Enter end range : ");
		int end = scan.nextInt();
		
		System.out.println("Perfect number from " + start + " to " + end + " : ");
		
		// Iterate from start to end
		for(int num = start ; num <= end ; num++) {
			//sum = 0;
			// Check if current number , num , is perfect or not
			for(int i = 1 ; i < num ; i++) {
				
				if(num % i == 0)
					sum = sum + i ;
					//div_count++ ;
				//	break ;
			}
			
			// current number , num , is perfect :
			if(sum == num)
				System.out.println(num);
			sum = 0;
			
		}
	}

}
