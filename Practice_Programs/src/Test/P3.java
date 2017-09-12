// Largest of three integers

package Test;

import java.util.Scanner ;

public class P3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in) ;
		
		System.out.println("Enter first number , a : ");
		int a = scan.nextInt() ;
		
		System.out.println("Enter second number , b : ");
		int b = scan.nextInt();
		
		System.out.println("Enter third number , c : ");
		int c = scan.nextInt();
		
		int max = ((a > b) && (a > c)) ? a : ( (b > c) ? b : c ) ;
		
		System.out.println("Largest of " + a + " , " + b + " , " + c + " = " + max );
		
		
	}

}
