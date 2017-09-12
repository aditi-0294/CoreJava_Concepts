package test_links_5;

public class P4 {

	int GetValue() {
		System.out.println("In GetValue() method");
		return(true?0:null) ;
	}
	
	public static void main(String args[]) {
		
	//	P4 obj = new P4() ;
		
		P4 obj = null ; // null pointer exception  
		
		obj.GetValue() ;
	}
}

// return(true ? 0 : null ) and P4 obj = new P4 : In GetValue() method
// return(true?null:0) and P4 obj = new P4 : In GetValue() then null pointer exception