// Armstrong Program :

package simple_programs;

import java.util.Scanner;

public class ArmstrongNum {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number :");
		int num = sc.nextInt();

		System.out.println();

		int n = num;
		int remainder, ans = 0 , c = 0;

		while(num > 0){
			remainder = num % 10;
			c = remainder * remainder * remainder;
			ans = ans + c;
			num = num / 10;
		  }

		if(ans == n)
			System.out.println(n + " is an Armstrong Number . ");
		
		else
			System.out.println(n + " is NOT an Armstrong Number . ");

}
}
