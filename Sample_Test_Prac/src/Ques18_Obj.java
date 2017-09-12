
public class Ques18_Obj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try
		{
			int arr[] = {1 , 2};
			
			arr[2] = 3/0;
			
			System.out.println(arr[0]);
		}
		
		catch(Exception e)
		{
			System.out.println("Exception");
		}
		
		/*
		catch(ArithematicException ae)
		{
			System.out.println("Divide by Zero");
		}
		
		ARR[i] = nextInt
		*/
	}

}
