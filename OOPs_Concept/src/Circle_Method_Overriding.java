// Method Overriding
public class Circle_Method_Overriding extends Shape_Method_Overriding{
	public Circle_Method_Overriding(int d1 , int d2) {
		super(d1,d2);
	}
	
	public int area() {
		return (int)3.14*dim1*dim2;
	}
}
