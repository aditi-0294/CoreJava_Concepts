// List Collection - Ordered Collection and can contain duplicate values 

package Collections;

import java.util.* ;

public class Listdemo {

	public static void main(String args[]) {
		
		ArrayList list = new ArrayList() ; // Created a Collection object
		
	//	ArrayList<Integer> list = new ArrayList() ; // Will not accept String values ( Aditi , Prince ) - Generics 
								// Generics - type safe collection - gives compile-time error instead of runtime exception ..
		
		/* Add elements to the lists : */
		System.out.println("Elements to be added completed ...  ");
		list.add("Aditi") ;
		list.add(new Integer(02)) ;
		list.add("Additie") ;
		list.add("Prince") ;
	//	list.add(new Student_ListDemo("E1001" , "Aditi" , 89));
		list.add(new Student_ListDemo()) ;
	//  list.add(new Student()) ;
		
		System.out.println(); // new line 
		
		
		/* Display elements of the collection object (i.e. , of the list ) */
		System.out.println("Displaying elements : ");
		System.out.println(list);
		
		
		System.out.println(); // new line
		
		
		/* Retrieveing elements from the collection object from a specific index */
		System.out.println("Retrieving elements from a specific index : ");
		
		System.out.println("Retrieved from index 0 : ");
		String str = (String)list.get(0) ; // indexing starts from 0
		System.out.print(str);
		
		
		System.out.println(); // new line
		System.out.println();
		
		
		System.out.println("Retrieved from index 1 :");
		Integer intr = (Integer) list.get(1) ; // also works 
	//	int intr = list.get(0) ;
		System.out.print(intr);
		
		
		System.out.println("Retrieved from index 4 : ");
		Student_ListDemo obj1 = (Student_ListDemo)list.get(4) ;
		obj1.display();
		
		/* Without toString() method in ( Student_ListDemo class ) , output is in the form class_name@hashcode :
		 *  Collections.Student_ListDemo@55f96302 -> Collections ( package name ) , Student_ListDemo@55f96302 ( class_name ) and
		 *  							55f96302 ( hashcode )
		 *  So result of display elements :
		 *  [Aditi, 2, Additie, Prince, Collections.Student_ListDemo@55f96302]
		 *  
		 * (non-Javadoc)
		 * @see java.lang.Object#toString()
		 * 
		 * So to display our own output , we use toString() method :
		 * Student Id : E10024  Student Name : Aditiee  Student Marks : 99
		 * 
		 * So result of display elements :  
		 * [Aditi, 2, Additie, Prince, Student Id : E10024  Student Name : Aditiee  Student Marks : 99]
		 */
		

				
	}
}
