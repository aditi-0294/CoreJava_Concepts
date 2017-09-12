
// Method calling example 

/*
public class BoxMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	*/	
		/* 'new' operator allocates memory to an object.
		 * 'Box obj' declares reference to object .
		 * since no memory is allocated hence it point to null .
		 */
//		Box obj = new Box();
		
		/* Initialising the object */
		
	//	obj.width  = 10;
		//obj.height = 15;
		//obj.depth = 20;
		
/*		
		System.out.println("Width = " + obj.width);
		System.out.println("Height = " + obj.height);
		System.out.println("Depth = " + obj.depth);
		
		int vol;
		vol = obj.width * obj.height * obj.depth ;
		System.out.println("Volume = " + vol);

	}

}
*/


/*  Getter-Setter Method : */

/* Getter - Setter Method : 
 * Setter Method : used for assigning value to the member class
 * Getter Method : used for accessing the values  
 */

// import java.util.Scanner ;
/*
public class BoxMain
{
	public static void main(String args[])
	{
		Box obj = new Box() ; 
		
		// Initialising the object

		
		obj.setWidth(10);
		obj.setHeight(9);
		obj.setDepth(4);
		*/
		
	/* Not Accessible :	
		Scanner scan = new Scanner(System.in) ;
		
		System.out.println(" Enter Width : ");
		width = scan.nextInt();
		
		System.out.println(" Enter Height : ");
	    height = scan.nextInt();
		
		System.out.println(" Enter Depth : ");
		depth = scan.nextInt();
	*/
	   // Accessing the value and printing
	/*	
		System.out.println("Width = " + obj.getWidth());
		System.out.println("Height = " + obj.getHeight());
		System.out.println("Width = " + obj.getDepth());
		
		System.out.println("Volume = " + obj.volume());
		
	}
}

*/

/* Method2 : - */

public class BoxMain
{
	public static void main(String args[])
	{
		Box obj = new Box() ;
		
	// obj.initialise();
		
		//System.out.println(" Respective Width(10) , Height(20) and Depth(30) are : " + obj.initialise());
		
		//obj.width = 15;
		//obj.height  = 25 ;
		//obj.depth = 12 ;
		
		int volume ;
		
	//	volume = obj.width * obj.height * obj.depth ;
		
	//	System.out.println(" Volume = " + volume);
	}
}