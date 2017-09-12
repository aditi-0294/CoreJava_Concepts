/* Constructor :- */

public class Employee {
	
		String emp_id ,emp_name ;
		
		public Employee()
		{
			emp_id = "E1000" ;
			emp_name = " Aditi ";
			
			System.out.println("This is my Constructor");
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("This is main method ");
		
		Employee emp = new Employee();

		System.out.println(emp);
	
		System.out.println(emp.emp_id);
		System.out.println(emp.emp_name);
		
		System.out.println("This is in main method ");

	}

}



/* Parameterized Constructor :- */
/*
public class Employee {
	
	String eid , ename ;

	public Employee(String eid , String ename)
	{
		this.eid = eid;
		this.ename = ename;
		
		System.out.println("This is my Parameterized Constructor");
	}
public static void main(String[] args) {
	// TODO Auto-generated method stub
	
	System.out.println("This is main method");
	
	Employee emp = new Employee("E1001","Aditi");
	
	System.out.println(emp);
	
	System.out.println(emp.eid);
	System.out.println(emp.ename);
	
	System.out.println("This is in main Method");
	
}

}
*/