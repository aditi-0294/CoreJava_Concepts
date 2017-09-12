package Strings;

public class demo_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 = "abc" ;
		String str2 = "abc" ;
		
		if(str1 == str2)
			System.out.println("Strings are equal ... ");
		else
			System.out.println("Strings are NOT equal ... ");
		
		String a1 = new String("abc") ;
		String a2 = new String("abc") ;
		// Checks objects and not "abc" values ... .
		if(a1 == a2)
			System.out.println("Strings are equal ... ");
		else
			System.out.println("Strings are Not equal .. ");

	}

}
