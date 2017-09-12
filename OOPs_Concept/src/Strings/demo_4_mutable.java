// StringBuffer - synchronized - works with single thread
// StringBuilder - Not synchronized 

package Strings;

public class demo_4_mutable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuffer sb = new StringBuffer() ;
		
		System.out.println("StringBuffer :- ");
		sb.append("Aditi") ;
		sb.append(" Upadhye") ;
		
		System.out.println(sb);
		
		StringBuilder sb1 = new StringBuilder() ;
		
		System.out.println("StringBuilder :- ");
		sb1.append("Aditi") ;
		sb1.append(" Upadhye") ;
		System.out.println(sb1);
	}

}
