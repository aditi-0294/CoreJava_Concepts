// Generics - type safe collection that converts Runtime Exception to Compile time error ..

// Sorting the collection using Comparable Interface 
package Collections;

public class Student_Comparable implements Comparable <Student_Comparable>   {
	
	int s_marks ;
	String s_id , s_name ;

	Student_Comparable(String s_id , String s_name , int s_marks) {
		this.s_id = s_id ;
		this.s_name = s_name ;
		this.s_marks = s_marks ;
	}
	
	public String toString() {
		return "Student Id. : " + s_id + " Student Name : " + s_name + " Student Marks : " + s_marks ;
	}

	@Override
	public int compareTo(Student_Comparable obj) {
		// TODO Auto-generated method stub
		System.out.println("this.s_marks : " + this.s_marks ); // 99 , 98 , 88
		System.out.println("obj.s_marks : " + obj.s_marks);
		System.out.println(this.s_marks + " ==== " + obj.s_marks);
		
		if(this.s_marks > obj.s_marks)
			return 1 ;
		else if(this.s_marks < obj.s_marks)
			return -1 ;
		else
			return 0;
	}
	

}
