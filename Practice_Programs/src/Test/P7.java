// Display all even numbers in a given range ... 

package Test;

import java.util.Scanner ;

public class P7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in) ;
		
		System.out.println("Enter the start range : ");
		int start = scan.nextInt();
		
		System.out.println("Enter the end range : ");
		int end = scan.nextInt() ;
		
		System.out.println("Even numbers in range " + start + " to " + end + ": ");
		for(int num = start ; num <= end ; num++) {
			
			if(num % 2 == 0)
				System.out.println(num);
		}
		
		System.out.println("Odd numbers in range " + start + " to " + end + ": ");
		for(int num = start ; num <= end ; num++) {
			
			if(num % 2 != 0)
				System.out.println(num);
		}
	}

}
