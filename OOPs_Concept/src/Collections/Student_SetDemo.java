// Set Collection

package Collections;

import java.util.Scanner;

public class Student_SetDemo {
	
	String s_name , s_id ;
	int s_marks ;
	
	/* Dynamic 
	Student_SetDemo() {
		Scanner scan = new Scanner(System.in) ;
		
		System.out.println("Enter Student Id. : ");
		s_id = scan.next();
		
		System.out.println("Enter Student Name : ");
		s_name = scan.next() ;
		
		System.out.println("Enter Student Marks : ");
		s_marks = scan.nextInt() ;
		
	}
	*/
	
	Student_SetDemo(String s_id , String s_name , int s_marks) {
		this.s_id = s_id ;
		this.s_name = s_name ;
		this.s_marks = s_marks ;
	}
	
	public void display() {
		System.out.println("Student Id. : " + s_id);
		System.out.println("Student Name : " + s_name);
		System.out.println("Student Marks : " + s_marks);
	}
	
	public String toString() {
		return "Student Id. : " + s_id + " Student Name : " + s_name + " Student Marks : " + s_marks ;
	}

	
	public static void main(String args[]) {
		
	//	Student_SetDemo obj = new Student_SetDemo() ; // Dynamic
		
		Student_SetDemo obj = new Student_SetDemo("E10024" , "Prince" , 99) ; // Static
		obj.display();
	}
}
