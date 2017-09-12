
public class thisDemo {
	
	public int base , height ;
	
	public thisDemo(int base , int height)
	{
		this.base = base;
		this.height = height;		
	}
	
	public int area()
	{
		return (1/2)*base*height ;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		thisDemo obj = new thisDemo(10 , 20);
		
		//thisDemo obj = new thisDemo();
		
		//obj.base = 10;
		
		
		System.out.println("Area : " + obj.area());

	}

}
