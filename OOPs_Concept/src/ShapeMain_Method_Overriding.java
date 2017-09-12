// Method Overriding
public class ShapeMain_Method_Overriding {
	
	public void calArea(Shape_Method_Overriding obj) {
		if(obj instanceof Rectangle_Method_Overriding)
			System.out.println("Area of Rectangle = " + obj.area());
		
		if(obj instanceof Triangle_Method_Overriding)
			System.out.println("Area of Triangle = " + obj.area());
		
		if(obj instanceof Circle_Method_Overriding)
			System.out.println("Area of Circle = " + obj.area());
	}
	
public static void main(String arg[]) {
	
	Rectangle_Method_Overriding obj1 = new Rectangle_Method_Overriding(10,20);
	Triangle_Method_Overriding obj2 = new Triangle_Method_Overriding(10,30);
	Circle_Method_Overriding obj3 = new Circle_Method_Overriding(30,30);
	
	ShapeMain_Method_Overriding Obj = new ShapeMain_Method_Overriding();
	Obj.calArea(obj1);
	Obj.calArea(obj2);
	Obj.calArea(obj3);
	
	
	
}

	

}
