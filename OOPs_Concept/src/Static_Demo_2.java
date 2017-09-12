// Static Method :
public class Static_Demo_2 {
	
	int v1 = 1;
	static int v2 = 1;
	
	public static void display() {
		// v1++ ; // Error as v1 is an instance ( and not static ) variable
		v2++ ;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Static_Demo_2 obj1 = new Static_Demo_2();
		System.out.println("Obj1 : v1 = " + obj1.v1);
		System.out.println("Obj1 : v2 = " + obj1.v2);

		Static_Demo_2 obj2 = new Static_Demo_2();
		System.out.println("Obj2 : v1 = " + obj2.v1);
		System.out.println("Obj2 : v2 = " + obj2.v2);

		Static_Demo_2 obj3 = new Static_Demo_2();
		System.out.println("Obj3 : v1 = " + obj3.v1);
		System.out.println("Obj3 : v2 = " + obj3.v2);

	}

}
