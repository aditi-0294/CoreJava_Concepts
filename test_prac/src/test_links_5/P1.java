package test_links_5;

public class P1 {
	
	//P1 p = new P1() ;
	
	public int show() {
		
		System.out.println("In show() class");
		return (true?null:0) ;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("In main class before P1 Statement");
		P1 p = new P1() ;
		System.out.println("In main class after P1 Statement");
		p.show();
		System.out.println("In main class after p Statement");

	}

}
