// Within the class - all access specifiers can be accessed ... 

package pack ;

public class Demo1 {
	
	
	
	   private int a ;
	   int b;
	   protected int c;
	   public int d ;
    
	
	 /* if static keyword is not used then error occurs in main() method :
	 * Cannot make static reference to the non-static methods ...  
	 * provided object of Demo_1 class is not created ....
	 */
	   
	   
	/*
	private static int a ;
	static int b;
	protected static int c;
	public static int d ;
	*/
	
	public Demo1 () {
		a = 100 ;
		b = 20 ;
		c = 30 ;
		d = 400 ;
	}

	public static void main(String args[]) {
		
	//	Demo1 obj = null ; // also works
		
		Demo1 obj = new Demo1() ;
		
		System.out.println("a = " + obj.a);
		System.out.println("b = " + obj.b);
		System.out.println("c = " + obj.c);
		System.out.println("d = " + obj.d);
	}
}
