package test_links_5;

public class P3 {
	
	static int a = 1111 ;
	
	static
	{
		a = a-- - --a ;
		System.out.println("first a = " + a);
	}
	
	static
	{
		a = a++ + ++a ;
		System.out.println("second a = " + a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(a);
	}

}


// without static in second 'a' : first a = 2 and 2
// with static in second 'a' : first a = 2  second a = 6 and 6
