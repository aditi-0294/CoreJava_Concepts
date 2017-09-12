// Composition type : " is-a " or " a-part-of" relationship exists .
public class Student_Composition_Inheritance {
	String sid , sname ;
	Course_Composition_Inheritance obj ;
	
	public Student_Composition_Inheritance(String sid , String sname) {
		obj = new Course_Composition_Inheritance("DT","DTE-Java DevOps",70000,4);
		//obj.cid = sid ; //	
		this.sid = sid;
		//obj.cname = sname ; // 
		this.sname = sname;
	}
	
	public void showBoth() {
		System.out.println("Student Id. : " + sid);
		System.out.println("Student Name : " + sname);
		
		obj.displayCourse();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student_Composition_Inheritance obj = new Student_Composition_Inheritance("S1001","Aditi") ;
		obj.showBoth();
	}

}
