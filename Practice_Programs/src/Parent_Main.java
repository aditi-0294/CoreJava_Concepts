
public class Parent_Main implements Parent {

	public void fun() {
		
		System.out.println("Parent_1");
		System.out.println("Parent_2");
		
	}

	@Override
	public void display() {
		System.out.println("Parent Method");
	}

	
	public static void main(String main[]) {
		// Parent_Main obj = null ;
		
		Parent_Main obj = new Parent_Main() ;
		
	//	obj.fun();
		obj.display();
	}
	
	
}
