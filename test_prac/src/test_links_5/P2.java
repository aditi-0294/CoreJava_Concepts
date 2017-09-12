package test_links_5;

public class P2 {


	public void show() {
		System.out.println("In show() method");
	}
	
	// without static - null pointer exception
	// with static - executes statemnt
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("In main() method");
		
		P2 obj = new P2() ;
		obj.show() ;
	}

}
