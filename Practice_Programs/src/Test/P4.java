// character is constant / vowel 

package Test;

import java.util.Scanner;

public class P4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in) ;
		
		System.out.println("Enter character to check if it is vowel or constant : ");
		String str = scan.next() ;
		
		char ch = str.charAt(0) ;
		
		switch(ch) {
		
		case 'A' :
		case 'a' : 
			
		case 'E' :
		case 'e' :
			
		case 'I' :
		case 'i' :
			
		case 'O' :
		case 'o' :
			
		case 'U' :
		case 'u' :
			System.out.println(ch + " is a Vowel .... ");
			break ;
			
		default : 
			System.out.println(ch + " is a Consonant ... ");
			break ;
	   } 
		
	}

}
