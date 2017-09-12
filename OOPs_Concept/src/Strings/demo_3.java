// Strings are Immutable by default - it means that its values cant' be changed ...
// To create Mutable String , classes used are : StringBuilder and StringBuffer ... 

package Strings;

public class demo_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Hello" ;
		
		str.concat(" Aditi") ;
		
		System.out.println(str);
		
		str = str.concat(" Aditi") ;
		
		System.out.println(str);
	}

}
