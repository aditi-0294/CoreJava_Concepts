// Palindrome Program :

package simple_programs;

import java.util.Scanner;

public class Palindrome {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number :");
		int num = sc.nextInt();

		System.out.println();

		int n = num;
		int remainder, reverse = 0;

		while(num > 0){
			remainder = num % 10;
			reverse = reverse * 10 + remainder;
			num = num / 10;
		  }

		if(reverse == n)
			System.out.println(n + " is a palindrome . ");
		
		else
			System.out.println(n + " is NOT a palindrome . ");

}
}
