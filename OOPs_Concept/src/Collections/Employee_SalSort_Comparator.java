// Generics

// Sorting the Collection using Comparator Interface

package Collections;

import java.util.* ;

public class Employee_SalSort_Comparator implements Comparator <Employee_Comparator> {

	@Override
	public int compare(Employee_Comparator arg1, Employee_Comparator arg2) {
		// TODO Auto-generated method stub
		if(arg1.e_sal > arg2.e_sal)
			return 1;
		else if(arg1.e_sal < arg2.e_sal)
			return -1 ;
		else
			return 0;
	}
	

}
