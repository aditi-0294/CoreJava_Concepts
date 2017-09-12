
import java.util.Scanner ;

public class Duplicate_values {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in) ;
		
		System.out.println("Enter String : ");
		String input = sc.next();
		
		System.out.println("Sample string : " + input);
		
	//	String input = sc.next();
		
        char process[] = input.toCharArray();
        boolean status = false;
        int index = 0;
        int count = 0;
        for (int i = 0; i < process.length; i++) {
            for (int j = 0; j < process.length; j++) {

                if (i == j) {
                    continue;
                   // count++ ;
                } 
                
                else {
                    if (process[i] == process[j]) {
                        status = true;
                        index = i;
                        count++ ;
                        break;
                    } 
                    
                    else {
                        status = false;

                    }
                }

            }
            
          //  System.out.println(process[index] + " : " + count + " times ..");
        }
        if (status) {
            //  System.out.print("" + process[index]);
              System.out.println(process[index] + " : " + count + " times ..");
         }

	}

}
