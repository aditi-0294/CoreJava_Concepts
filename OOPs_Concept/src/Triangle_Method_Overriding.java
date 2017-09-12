// Method Overriding
public class Triangle_Method_Overriding extends Shape_Method_Overriding {
	
	public Triangle_Method_Overriding(int d1 , int d2) {
		super(d1,d2);
	}
	
	public int area() {
		return (int)0.5*dim1*dim2 ;
	}

}
