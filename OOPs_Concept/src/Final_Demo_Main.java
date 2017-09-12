// Final method Inheritance 

public class Final_Demo_Main extends Final_Demo{
/*
	public void display() { // Error ; as method cant be overridden .....
		
	}
*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Final_Demo_Main obj = new Final_Demo_Main() ;
		
		System.out.println(" Main final method");
		
		obj.display();
	}

}
