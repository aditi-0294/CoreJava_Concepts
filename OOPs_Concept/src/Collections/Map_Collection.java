/* Map Collection :- it is mainly used if the data exists in key and value pair ...
 * Not a part of Collection Interface but is a separate hierarchy .....
 */
package Collections;

import java.util.* ;

public class Map_Collection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap <Integer , Employee_Comparator> hm = new HashMap <Integer , Employee_Comparator> ();
		hm.put(1001, new Employee_Comparator("E1001" , "Aditi" , 900000)) ;
		hm.put(1002, new Employee_Comparator("E1002" , "Adi" , 800000)) ;
		hm.put(1003, new Employee_Comparator("E1003" , "Adit" , 700000)) ;
		hm.put(1004, new Employee_Comparator("E1004" , "Adti" , 600000)) ;
		
		Set<Integer> keys = hm.keySet() ; // to get all keys
		
		/* keyset() method - returns all keys available in Map Collection .. It returns set type of objects .. */
		
		for(Integer intr : keys) {
			Employee_Comparator emp = hm.get(intr) ;
			System.out.println(emp);
		}
		
		
		
		
		
		
		

	}

}
