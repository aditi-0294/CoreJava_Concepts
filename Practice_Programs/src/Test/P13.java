// ArmStrong numbers in a given range : 

package Test;

import java.util.* ;

public class P13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter initial value : ");
		int start = scan.nextInt();
		
		System.out.println("Enter final value : ");
		int end = scan.nextInt();
		
		System.out.println("ArmStrong Numbers from " + start + " to " + end + " : ");
		
		for(int num = start ; num <= end ; num++) {
			
			int sum = 0; 
			int rem ;
			int a = num ;
			
			while(a > 0) {
				rem = a % 10;
				sum = sum + (rem * rem * rem) ;
				a = a / 10 ;
			}
			
			if(sum == num)
				System.out.println(num);
			
		}
	}

}
