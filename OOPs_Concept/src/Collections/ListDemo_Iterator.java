// Traversal of the collection : using Iterator - iterator is an interface by which we can traverse the collection ...

package Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ListDemo_Iterator {

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
			
			Iterator itr = list.iterator() ;
			
			while(itr.hasNext()) {
				
				Object ob = itr.next();
				
				if(ob instanceof String) {
					String str = (String)ob ;
					System.out.println("String : " + str);
					
					if(str.equals("Aditi"))
						itr.remove();
					
				}
				
				else if(ob instanceof Integer) {
					Integer intr = (Integer)ob ;
					System.out.println("Integer : " + intr);
				}
				
				else {
					Student_ListDemo obj = (Student_ListDemo)ob ;
					System.out.println("Student : " + obj);
					
					
				//	if(obj.equals("Adity"))
				//	 itr.
				
					
					
					
				}
			}
			
			System.out.println();
			
			System.out.println("After iterator changes :");
			System.out.println(list);
			
	}

}
