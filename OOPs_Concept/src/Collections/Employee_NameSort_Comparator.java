// Generics

// Sorting the Collection using Comparator Interface

package Collections;

import java.util.* ;

public class Employee_NameSort_Comparator implements Comparator <Employee_Comparator> {

	@Override
	public int compare(Employee_Comparator arg1, Employee_Comparator arg2) {
		// TODO Auto-generated method stub
		
		return arg1.e_name.compareTo(arg2.e_name);
	}
	

}
