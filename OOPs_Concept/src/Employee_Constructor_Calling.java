// Inheritance - Constructor Calling
public class Employee_Constructor_Calling {
	
	String emp_name , emp_id;
	
	public Employee_Constructor_Calling() {
		System.out.println("Super Class - Employee Constructor");
		emp_name = "Aditi" ;
		emp_id = "E1000" ;
	}
	
	public Employee_Constructor_Calling(String e_name , String e_id) {
		System.out.println("OverLoaded Constructor - Employee Class");
		emp_name = e_name ;
		emp_id = e_id ;
	}

}
