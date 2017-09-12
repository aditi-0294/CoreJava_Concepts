package ExceptionHandling;

public class Demo_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			int a = 10 ;
			int b = 0 ;
			
			int c = a / b ;
			
			System.out.println("c = " + c);
			
			System.out.println("Code executed");
		}
		catch(ArithmeticException ae) {
			System.out.println("Exception : " + ae);			
		}
		
		System.out.println("Code completed");

	}

}
