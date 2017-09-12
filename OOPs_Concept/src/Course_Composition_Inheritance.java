// Composition type : "has-a" or "a-part-of" relationship exists

public class Course_Composition_Inheritance {
		
	String cid , cname ;
	int price , duration ;
	
	public Course_Composition_Inheritance(String cid , String cname , int price , int duration) {
		this.cid = cid;
		this.cname = cname;
		this.price = price;
		this.duration = duration;
	}
	
	public void displayCourse() {
		System.out.println("Course Id. : " + cid);
		System.out.println("Course Name : " + cname);
		System.out.println("Course Price : "+ price);
		System.out.println("Course Duration : " + duration);
	}
	
	
}
