
public class Nyz_3_4 {
	
	public static void throwit() {
		System.out.println("throw it");
		//throw new RuntimeException() ; /////
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			System.out.println("hello");
			throwit() ;
		}
		catch(Exception re) {
			System.out.println("Caught");
		}
		
		finally {
			System.out.println("finally ");
		}
		
		System.out.println("after");
		
	}

}
