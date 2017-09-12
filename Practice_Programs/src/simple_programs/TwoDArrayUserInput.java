// Display 2D Matrix :
package simple_programs;

import java.util.Scanner;

public class TwoDArrayUserInput {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		int a[][];

		System.out.print("Enter number of rows : ");
		int rows = sc.nextInt();

		System.out.println();

		System.out.print("Enter number of columns : ");
		int columns = sc.nextInt();

// Getting size of array from user
		a = new int[rows][columns];
		
		System.out.println();

// Adding elements into the array
		System.out.println("Enter values into the array :");

		for(int i = 0; i < a.length; i++){
			for(int j = 0; j < a.length; j++){
				int n = sc.nextInt();
				a[i][j] = n;
		  }
		   }
		
		System.out.println();
		
		
// Print array 
				
		System.out.println(" Required matrix : ");
		System.out.println();

		for(int i = 0; i < a.length; i++){
			for(int j = 0; j < a.length; j++){
				System.out.print(a[i][j] + "  ");
		 }
	
			System.out.println();

		  }
}

}
