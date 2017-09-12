// Method Calling ( Use of Scanner Class ) :

import java.util.Scanner;

public class MethodDemoMain {
	
	protected int add(int n1 , int n2)
	{
		int result = n1 + n2 ;
		return result ;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		Scanner scan = new Scanner(System.in); // creating a scanner object
		
		MethodDemoMain obj = new MethodDemoMain(); // creating instance of class
		
		int num1,num2, result ;
		
		System.out.println("Enter num_1 : "); 
		num1 = scan.nextInt(); // Accept first number 
		
		System.out.println("Enter num_2 : "); 
		num2 = scan.nextInt(); // Accept second number
		
		result = obj.add(num1,num2); // calling the method
		
		System.out.println(" Result : " + num1 + " + " +  num2  + " = " + result);
		
		}
		
		catch(Exception e)
		{
			System.out.println("Exception occured : " + e);
		}
	}

}
