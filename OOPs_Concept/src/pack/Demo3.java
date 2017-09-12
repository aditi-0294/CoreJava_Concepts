//Within the package but Inherited class :

package pack;

public class Demo3 extends Demo1 {
	
	 /* public Demo3() {
		
	//  a = 20 ; // Error ( - Demo1.a is not visible ) as 'a' is private in Demo1
		
		b = 30 ; // default
		c = 40 ; // protected
		d = 50 ; // public
	}
	
	*/
	
	public static void main(String args[]) {
		
		/* Demo3 obj3 = new Demo3() ; // Constructor
		
		//System.out.println("a = " + a);
		
		System.out.println("b = " + obj3.b); // 30
		System.out.println("c = " + obj3.c); // 40
		System.out.println("d = " + obj3.d); // 50
	 */
		
	
		//	Demo3 obj8 = new Demo1() ; // Type mismatch error
		
		Demo1 obj3 = new Demo3() ; // Constructor
		
		//System.out.println("a = " + a);
		
		System.out.println("b = " + obj3.b); // 20
		System.out.println("c = " + obj3.c); // 30
		System.out.println("d = " + obj3.d); // 400
	}

}
