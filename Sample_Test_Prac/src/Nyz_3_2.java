
public class Nyz_3_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			int a = 0 ;
			System.out.println("a = " + a + "\n");
			int b = 20 / a ;
			System.out.println("b = " + b);
		}
		
		catch(ArithmeticException e) {
			System.out.println("Divide by zero error : " + e);
		}
		
		finally {
			System.out.println("Inside the final block");
		}
		
		
	}

}
