// SingleTon Design pattern - used to share particular resource and only one instance of class will be created ...

package pack ;

public class Single_Ton_Demo {
	
	private static Single_Ton_Demo obj = new Single_Ton_Demo() ;
	
	private Single_Ton_Demo() {
		
	}
	
	public static Single_Ton_Demo getInstance() {
		
		return obj ;
		
	}
	
	public void share() {
		
		System.out.println("Share the resource");
	}

}
