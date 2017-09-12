// Inheritance - Constructor Calling
public class WageEmployee_Constructor_Calling extends Employee_Constructor_Calling {
	
	int wage ;
	
	public WageEmployee_Constructor_Calling() {
		super("E1006","Prince");
		System.out.println("Sub-class Default Constructor - WageEmployee");
		wage = 12000;		
	}
	
	public void showDetails() {
		System.out.println("Employee Id. : " + emp_id);
		System.out.println("Employee name : " + emp_name);
		System.out.println("Employee WAGE : " + wage);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Employee_Constructor_Calling obj = new Employee_Constructor_Calling(); // Error as method is undefined in that class
		WageEmployee_Constructor_Calling obj = new WageEmployee_Constructor_Calling() ;
		obj.showDetails();

	}

}
