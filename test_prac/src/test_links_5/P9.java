package test_links_5;

public class P9 {

	static int method1(int i) {
	
		System.out.println("In method1() .. ");
		return method2(i*=11) ;
	}
	
	static int method2(int i) {
		
		System.out.println("In method2() .. ");
		return method3(i/=11) ;
	}
	
	static int method3(int i) {
		
		System.out.println("In method3() .. ");
		return method4(i-=11) ;
	}
	
	static int method4(int i) {
		
		System.out.println("In method4() .. ");
		return i+=11 ;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("In main() method");
		System.out.println(method1(11));
	}

}
