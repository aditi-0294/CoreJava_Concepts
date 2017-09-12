// Method Overriding
public class Rectangle_Method_Overriding extends Shape_Method_Overriding {
	
	public Rectangle_Method_Overriding(int d1 , int d2) {
		super(d1,d2) ;
	}

	public int area() {
		return dim1*dim2 ;
	}
}
	
/*	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Rectangle_Method_Overriding obj = new Rectangle_Method_Overriding(10 , 20);
		
		//Rectangle_Method_Overriding obj = new Rectangle_Method_Overriding();
		
		System.out.println("Area = " + obj.area());

	}

} */
