// Method Calling :

public class MethodDemo {

	public int add(int v1 , int v2) { // formal parameters
		
		return v1+v2;
	}
	
	
	public static void main(String args[]) {
		
		MethodDemo obj1 = new MethodDemo();
		
		int result = obj1.add(10, 20); // Calling the method
		
		System.out.println("Result = " + result);
	}
}
