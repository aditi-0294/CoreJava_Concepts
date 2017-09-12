// To check if a year is Leap year or not 

package Test;

import java.util.Scanner ;

public class P2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in) ;
		
		System.out.println("Enter a year : ");
		int year = scan.nextInt();
		
		//if(year % 4 == 0 && year % 100 == 0 || year % 400 == 0) // check for 1000 == false
		if(year % 4 == 0 && year % 400 == 0 && year % 100 == 0) // actual condition
			System.out.println("The given year " + year + " is a Leap year .... ");
		else
			System.out.println("The given year " + year + " is Not a Leap year ... ");
/*	
	if((year % 4 == 0) && (year % 100 != 0))
		System.out.println("Leap year");
	else if(year % 100 == 0)
		System.out.println("Not a leap year");
	else if(year % 400 == 0)
		System.out.println("Leap year");
	else
		System.out.println("Not a leap year");
	*/
	
	}

}
