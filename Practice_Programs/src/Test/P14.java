//max and min from range

package Test;

import java.util.*;

public class P14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in) ;
		
		System.out.println("Enter array size : ");
		int n = scan.nextInt();
		
		int arr[] = new int[n] ;
		
		System.out.println("Enter values into the array : ");
		for(int i = 0; i < n ; i++) {
			System.out.print("Enter value for arr[" + i + "] : " );
			arr[i] = scan.nextInt();
		}
		
		System.out.println("Array elements : ");
		for(int i = 0; i < n ; i++) {
			System.out.println(arr[i]);
		}
		
		int max = arr[0];
		int min = arr[0];
		
		for(int i = 0; i < n ; i++) {
			if(arr[i] > max)
				max = arr[i] ;
			if(arr[i] < min)
				min = arr[i] ;
		}
		
		System.out.println("Largest = " + max);
		System.out.println("Smallest = " + min);
	}

}
