// Constructor Overloading :
public class Box_ConstructorOverloadingDemo {
	
	public int Box_ConstructorOverloadingDemo()
	{
		System.out.println(" I am in Box");
		int width = 10;
		int height = 20;
		int depth = 30;
		
		int volume = width * height * depth ;
		
		return volume;
	}
	
	public Box_ConstructorOverloadingDemo(int vol)
	{
		int side ;
		//vol = side*side*side ;
		//return side ;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Box_ConstructorOverloadingDemo obj1 = new Box_ConstructorOverloadingDemo();
				
		Box_ConstructorOverloadingDemo obj2 = new Box_ConstructorOverloadingDemo(10);
		
	//	System.out.println(" Box Volume : " + obj1.volume());
		
	//	System.out.println(" Square Volume : " + obj2.volume());
		
	}

}
