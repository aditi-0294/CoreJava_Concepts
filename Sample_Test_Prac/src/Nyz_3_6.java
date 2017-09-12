
public class Nyz_3_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = 0 , y = 0 ;
		
		int a = 0 , b = 0 ;
		
		int c = 0 , d = 0 ;
		
		int e = 0 , f = 0 ;
		
		do {
			y = x + 7 ;
			x++ ;
		} while(x < 9) ;
		
		System.out.println("Original case : ");
		System.out.println("x = " + x + "   " + " y = " + y);

		/* ********************** */
		
		System.out.println();
		
		System.out.println(" Case - 1 : ");
		b = a + 7 ;
		b++ ;
		while(a<9) {
			b = a + 7 ;
			a++ ;
		}
		System.out.println("a = " + a + "   " + " b = " + b);
		
		/* ********************** */
		
		System.out.println();
		
		System.out.println(" Case - 2 : ");
		while(c <= 9) {
			d = c + 7;
			c++ ;
		}
		System.out.println("c = " + c + "   " + " d = " + d);
		
		/* ******************** */
		
		System.out.println();
		
		System.out.println(" Case - 3 : ");
		while( e < 9 ) {
			f = e + 7 ;
			e++ ;
		}
		f = e + 7;
		e++ ;
		
		System.out.println("e = " + e + "   " + " f = " + f);
	}

}
