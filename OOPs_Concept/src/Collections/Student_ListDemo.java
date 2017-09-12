// List Collection

package Collections;

import java.util.* ;

public class Student_ListDemo {
	
	int s_marks ;
	String s_id , s_name ;
	
	/* Dynamic Values : */
	Student_ListDemo() {
		Scanner scan = new Scanner(System.in) ;
		
		System.out.println("Enter Student Id. : ");
		s_id = scan.next();
				
		System.out.println("Enter Student Name : ");
		s_name = scan.next();
		
		System.out.println("Enter Student Marks : ");
		s_marks = scan.nextInt();
		
	}
	
	
	/* Static values 
	Student_ListDemo(String s_name , String s_id , int s_marks) {
		
		this.s_name = s_name ;
		this.s_id = s_id ;
		this.s_marks = s_marks ;
	}
	*/
	
	public void display() {
		System.out.println("Student Id. : " + s_id);
		System.out.println("Student Name : " + s_name);
		System.out.println("Student Marks : " + s_marks);

	}
	
	/* Without toString() method in ( Student_ListDemo class ) , output is in the form class_name@hashcode ... 
	 * (non-Javadoc)
	 * @see java.lang.Object#toString()
	 * So to display our own output , we use toString() method
	 */
	
	
	public String toString() {
		return "Student Id : " + s_id + "  Student Name : " + s_name + "  Student Marks : " + s_marks ;
	}
	
	
	public static void main(String args[]) {
		
		// Student_ListDemo obj ; // obj is not initialized , hence gives an error
		Student_ListDemo obj = new Student_ListDemo() ; // Dynamic
		
		//Student_ListDemo obj = new Student_ListDemo("Princy" , "E1001" , 89 ) ; // Static - Paramenterised Contructor executed in same order 
		obj.display();
	}

}
