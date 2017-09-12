// Inherited class outside the package using fully qualified classname :

import pack.Demo1 ;
public class package_Demo4 extends pack.Demo1 {

	/*
		public package_Demo4() {
			
		//  a = 10 ; // Error (- Demo1.a is not visible ) as 'a' is private in Demo1 class of package pack - private

		//	b = 20 ; // Error (- Demo1.a is not visible ) as 'b' is package scope member in Demo1 class of package pack - default
			
			c = 300 ; // protected
			
			d = 40 ; // public
		}
		
		*/
		
		
		public static void main(String args[]) {
			
		/*
			package_Demo4 obj4 = new package_Demo4() ;
			
			//  System.out.println("a = " + obj4.a);
			
			//  System.out.println("b = " + obj4.b);
			
			System.out.println("c = " + obj4.c); // 300 if constructor package_Demo4() is Uncommented ..
			
			System.out.println("d = " + obj4.d); // 40 if constructor package_Demo4() is Uncommented ..
		*/
			
		/*	
			
			package_Demo4 obj4 = new package_Demo4() ;
			
			//  System.out.println("a = " + obj4.a);
			
			//  System.out.println("b = " + obj4.b);
			
			System.out.println("c = " + obj4.c); // 30 if constructor package_Demo4() is commented ..
			
			System.out.println("d = " + obj4.d); // 400 if constructor package_Demo4() is commented ..
		*/
			
//  Outside the package , other class :
			
			Demo1 obj9 = new Demo1() ; // Importing pack.Demo1 is compulsory for this case
			
			//  System.out.println("a = " + obj4.a);
			
			//  System.out.println("b = " + obj4.b);
			
			// System.out.println("c = " + obj9.c); // 30 if constructor package_Demo4() is commented ..
			
			System.out.println("d = " + obj9.d); // 400 if constructor package_Demo4() is commented ..
			
		}
}
