// Java - student guide - pg115 of 237
public class B2 {
	
	String a ;
	int b ;
	
	void print() {
		System.out.println("Print1");
	}
	
	void print(String a) {
		System.out.println("Print2");
		this.a = a ;
		System.out.println(a);
	}
	
	String print(int b) {
		System.out.println("Print3");
		return "Print3" ;
		//this.b = b ; // error - unreachable code ......
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			B2 obj = new B2() ;
			obj.print();
			obj.print("Aditi");
			obj.print(2) ;
	}

}
