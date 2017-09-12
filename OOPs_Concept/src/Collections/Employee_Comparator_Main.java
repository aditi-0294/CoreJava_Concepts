// Generics

// Sorting the Collection using Comparator Interface

package Collections;

import java.util.* ;

public class Employee_Comparator_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList <Employee_Comparator> list = new ArrayList <Employee_Comparator> () ;
		
		list.add(new Employee_Comparator("E10024" , "Aditi" , 10000)) ;
		list.add(new Employee_Comparator("E10020" , "Prince" , 20000)) ;
		list.add(new Employee_Comparator("E10022" , "Brussie" , 20000)) ;

		System.out.println("Before Sorting :- ");
		
		for(Employee_Comparator e : list) {
			System.out.println(e);
		}
		
		System.out.println();
		
		
		System.out.println("After Sorting Salary wise :- ");
		Collections.sort(list , new Employee_SalSort_Comparator());
		for(Employee_Comparator e : list) {
			System.out.println(e);
		}
		
		
		System.out.println();
		
		
		System.out.println("After sorting Name wise :- ");
		Collections.sort(list , new Employee_NameSort_Comparator()) ;
		for(Employee_Comparator e : list) {
			System.out.println(e);
		}
	}
	
	

}
