// Inheritance : "is-a" or "a-kind-of" relationship exists
public class WageEmployee_Inheritance extends Employee_Inheritance {
	int wage ;
	
	public WageEmployee_Inheritance() {
		emp_id = "E1000" ;
		emp_name = "Aditi";
		
		wage = 10000 ;
	}
	
	public void displayDetail() {
		System.out.println("Employee Id. : " + emp_id);
		System.out.println("Employee Name : " + emp_name);
		System.out.println("Employee WAGE : " + wage);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WageEmployee_Inheritance obj = new WageEmployee_Inheritance();
		obj.displayDetail();

	}

}
