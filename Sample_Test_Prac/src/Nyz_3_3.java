
public class Nyz_3_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			
		int a[] = {1 , 2 , 3 , 4 } ; // array starts from index 0
		
		for(int i = 1; i <= 4; i++) {
			System.out.println("a[" + i + "] = " + a[i] + "\n");
		}
		}
		
		/* If global catch block is written here then it gives an error as it will catch all exceptions .... 
		 * So ArrayIndex ..... Exception will not get executed ... 
		 * Hence , this block should be written at the end of specific catch block ....
		catch(Exception e) {
			System.out.println("Error = " + e);
		}
		*/
		
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException");
		}
		
		catch(Exception e) {
			System.out.println("Error = " + e);
		}
	}
		
		

}
