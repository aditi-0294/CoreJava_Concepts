//ArmStrong Number :

package Test;

import java.util.Scanner ;

public class P11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int rem = 0  , c = 0 , ans = 0;
		Scanner scan = new Scanner(System.in) ;
		
		System.out.println("Enter number : ");
		int num = scan.nextInt();
		
		int a = num ;
		
		while(num > 0) {
			rem = num % 10;
			ans = ans + (rem * rem * rem);
			num = num / 10;
		}
		
		if(a == ans)
			System.out.println(a + " is an ArmStrong Number ....");
		else
			System.out.println(a + " is NOT an ArmStrong Number ....");
	}

}
