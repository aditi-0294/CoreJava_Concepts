// Simple Overloading :
public class OverloadingDemo {
	
	public int add(int v1 , int v2 , int v3)
	{
		int result = v1 + v2 +v3;
		return result;
	}
	
/*	public int add(int v1 , int v2 )
	{
		int result = v1 + v2;
		return result;
	}
	*/
	
	public double add(double v1 , double v2)
	{
		return v1+v2 ;
	}

	/* Duplicate Method (int v1 , int v2) from line no. 10 . Hence , the error : */
	 
	public double add(int v1 , int v2) 
	{
		return v1+v2;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		OverloadingDemo obj = new OverloadingDemo();
		
		System.out.println("Two integer : " + obj.add(10, 20));
		
		System.out.println("Three integer : " + obj.add(10, 20 ));
		
		System.out.println("Two double : " + obj.add(10.45, 20.55));
	}

}
