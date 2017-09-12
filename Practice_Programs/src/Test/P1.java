package Test;
/* Even or Odd Number check using do-while loop */

import java.util.Scanner ;
public class P1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in) ;
		
		//try {
		String choice = null ;
		int ch = 0 ;
		// int a_ch ;
		do {
			
		/* Not to write this code here as it will not directly exit but execute 
		 * Sysout(Enter num ) statement and then exit the loop .
		 * 
		 * 
		System.out.println("Enter yes or Y or y , to continue !!!");
		choice = scan.next();
		
		
		 */
			
				
			
		System.out.println("Enter a number : ");
		int num = scan.nextInt();
		
		
		
		
		if(num % 2 == 0)
			System.out.println("The given number , "+num+" , is Even .." );
		else
			System.out.println("The given number , "+num+" , is Odd .." );
		
		
		//System.out.println("Enter yes or Y or y , to continue !!!");
		//choice = scan.next();
			
		System.out.println("Enter z or 90 to continue :");
		ch = scan.nextInt();
		
		} // while(choice == "y");
		//while(ch == (char)90);
		while(choice.equals("y")) ;
	
		
		System.out.println("Finished");
		
	}
		

	}


