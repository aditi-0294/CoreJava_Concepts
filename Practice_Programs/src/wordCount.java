/* WAP to find number of words with in a given string 
 * Use Logic instead of built-in functions 
 */
public class wordCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int count = 0;
		
		String str = "This is a word Count program .";
		
		//str = str.trim();
		
		// System.out.println(str.trim());
		
		System.out.println(str);
		
		char arr[] = str.toCharArray();
		
		for(int i = 0; i < arr.length; i++)
		{
			if(arr[i] == ' ') {
				
			}
				//System.out.println(" ");
			    count++; 
		}
		
		System.out.println("Count = " + ++count);
	}

}
