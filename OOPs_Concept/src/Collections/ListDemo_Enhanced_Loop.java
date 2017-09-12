// Traversal of the collection : using Enhanced for loop / for-each / advanced loop :

package Collections;

import java.util.ArrayList;

public class ListDemo_Enhanced_Loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList list = new ArrayList() ; // Created a Collection object
		
	//	ArrayList<Integer> list = new ArrayList() ; // Will not accept String values ( Aditi , Prince )
		
		/* Add elements to the lists : */
		System.out.println("Elements to be added completed ...  ");
		list.add("Aditi") ;
		list.add(new Integer(02)) ;
		list.add("Additie") ;
		list.add("Prince") ;
	//	list.add(new Student_ListDemo("E1001" , "Aditi" , 89));
		list.add(new Student_ListDemo()) ;
		
		
		System.out.println(); // new line 
		
		
		/* Display elements of the collection object (i.e. , of the list ) */
		System.out.println("Displaying elements : ");
		System.out.println(list);
		
		
		System.out.println(); // new line
		
		for(Object ob : list) {
			if(ob instanceof String) {
				String str = (String)ob ;
				System.out.println("String : " + str);
			}
			
		//	System.out.println();
				
			else if(ob instanceof Integer) {
				  Integer intr = (Integer)ob ;
				  System.out.println("Integer : " + intr);
			}
			
		//	System.out.println();
			  
			else {
				  Student_ListDemo obj = (Student_ListDemo)ob ;
				  System.out.println("Student : " + obj );
			  }
				
		}
		

	}

}


/* Output of program : 
 * Elements to be added completed ...  
Enter Student Id. : 
E10024
Enter Student Name : 
Adity
Enter Student Marks : 
99

Displaying elements : 
[Aditi, 2, Additie, Prince, Student Id : E10024  Student Name : Adity  Student Marks : 99]

String : Aditi
Integer : 2
String : Additie
String : Prince
Student : Student Id : E10024  Student Name : Adity  Student Marks : 99
*/
