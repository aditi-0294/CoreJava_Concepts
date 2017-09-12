// Generics - for implementing type safe collection

// Sorting the Collection using Comparator interface

package Collections;

import java.util.* ;

public class Employee_Comparator {
	int e_sal ;
	String e_name , e_id ;
	
	Employee_Comparator(String emp_id , String emp_name , int emp_sal) {
		e_id = emp_id ;
		e_name = emp_name ;
		e_sal = emp_sal ;
	}
	
	public String toString() {
		return "Employee Id. : " + e_id + " Employee Name : " + e_name + " Employee Salary : " + e_sal ;
	}

}
