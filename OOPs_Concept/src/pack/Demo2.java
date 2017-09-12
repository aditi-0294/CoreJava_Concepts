// Within the package but Other class :

package pack;

public class Demo2 {
	
	public static void main(String args[]) {
	
	/* should be compulsorily declared in main() method :
	 * use of constructor will not help .... 
	private int a ;
	protected int c ;
	int b ;
	public int d ;
	*/
	
 	Demo1 obj = new Demo1() ;
	
	//obj.a = 10 ; // Error ( - Demo1.a is not visible ) as 'a' is private : Option - change visibility ( access_specifier ) of 'a'
				 // OR create getter-setter method 
	
//	obj.b = 20 ; // default
	
//	obj.c = 30 ; // protected
	
//	obj.d = 40 ; // public
	
	// Demo1.d = 40 ; // Cannot make static reference to a non-static method
	
	//System.out.println("a =  " + obj.a);
	
		// Demo2 obj = new Demo2() ;
	System.out.println("b = " + obj.b);
	System.out.println("c = " + obj.c);
	System.out.println("d = " + obj.d);
	
	}
}
