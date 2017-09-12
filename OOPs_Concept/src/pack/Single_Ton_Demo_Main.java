// SingleTon Design Pattern - only one instance of class is created . Used for sharing a particular resource  ... 

package pack;

public class Single_Ton_Demo_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Single_Ton_Demo obj = Single_Ton_Demo.getInstance() ;
		
		obj.share();
	}

}
