// Generics - Comparable type

// Sorting the Collection using Comparable Interface

package Collections;

import java.util.* ;

public class Student_ComparableSort_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet <Student_Comparable> ts = new TreeSet <Student_Comparable> () ;
		
		
		ts.add(new Student_Comparable("E10024" , "Aditi" , 99)) ;
		ts.add(new Student_Comparable("E10020" , "Prince" , 98)) ;
		ts.add(new Student_Comparable("E10028" , "Brussie" , 88)) ;
		
		for(Student_Comparable s : ts) {
			System.out.println(s);
		}

	}

}
