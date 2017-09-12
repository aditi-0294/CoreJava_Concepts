// Set Collection - Ordered set of Collection and cannot contain duplicate values ...

package Collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Set_Demo {
	
	public static void main(String args[]) {
		
		/* 1. HashSet() - It will add element using the hash algorithm . So we cannot anticipate the output ...
		 * 	It will not contain duplicate values .
		 */
		
		HashSet hs = new HashSet() ;
		
		/* Adding elements to the list ...... */
		hs.add("Aditi") ;
		hs.add("Prince");
		hs.add(new Integer(2)) ;
		hs.add("Prince") ;
		hs.add(new Student_SetDemo("E1002" , "Aadiitee" , 89)) ;
		
		System.out.println();
		
		/* Display Output - */
		
		System.out.println("Hashset Output :- ");
		System.out.println(hs);
		
		System.out.println();
		
		/* TreeSet() - Sorts the element */
		
		TreeSet ts  = new TreeSet() ;
		
		/* Adding elements to the list ........ */
		ts.add("Prince") ;
		ts.add("Aditi") ;
	//	ts.add(new Integer(2)) ;
	//	ts.add(new Integer(1)) ;
		ts.add("Prince") ;
	//	ts.add(new Student_SetDemo("E1004" , "Adiittii" , 99)) ;
		
		System.out.println();
		
		/* Display Output */
		System.out.println("TreeSet Output :- ");
		System.out.println(ts);
		
		System.out.println();
		
		/* LinkedHashSet() - shows data according to the way it has been entered */
		LinkedHashSet lhs = new LinkedHashSet() ;
		
		/*Adding elements to the list : */
		lhs.add("Prince") ;
	//	lhs.add(new Integer(4)) ;
		lhs.add("Prince") ;
	//	lhs.add(new Student_SetDemo("E1006" , "Adiittteee" , 80)) ;
		lhs.add("Aditi") ;
		
		System.out.println();
		
		/* Display Output */
		System.out.println("LinkedHashSet Output :- ");
		System.out.println(lhs);
		
		
		
	}

}
