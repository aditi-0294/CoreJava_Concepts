// Implementation of interface to a class for calculator application :

public class Interface_Demo_Implementation implements Interface_Demo {
	
	public int add(int v1 , int v2) {
		return v1+v2;
	}
	
	public int subt(int v1 , int v2) {
		return v1-v2;
	}

	public int mult(int v1 , int v2) {
		return v1*v2;
	}

	public int div(int v1 , int v2) {
		return v1/v2;
	}
	
	public void display() {
		System.out.println(mult(10,300));
	}
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Interface_Demo_Implementation obj = new Interface_Demo_Implementation();
		
		obj.display();
	}

}
