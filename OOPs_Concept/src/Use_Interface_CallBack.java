// Interface implementation :

public class Use_Interface_CallBack implements Interface_CallBack {
	
	public void callback(int v1) {
		System.out.println("v1 = " + v1);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Use_Interface_CallBack obj = new Use_Interface_CallBack();
		
		obj.callback(10);

	}

}
