import java.util.* ;

public class Assert_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter age : ");
		int age = scan.nextInt();
		
		System.out.println("Age : " + age);
		
		assert age >= 18 : " Invalid .. " ;
		
		System.out.println("Age = " + age);
		
	}

}
