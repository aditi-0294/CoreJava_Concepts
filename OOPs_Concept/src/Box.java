/* 
// Method Calling example

public class Box {
	
	int height , width , depth ;
	
	}
*/

/* Getter-Setter Method :
 * Setter Method : used for assigning value to the member class
 * Getter Method : used for accessing the values  
 */

//public class Box {
	
	 //private int height , width , depth ;

	//private int height , width , depth ;

	/* For Width : */
	 
	 // Accessor - accesses the value
	 
	 /*public int getWidth()
	 {
		 return width;
	 }
	 */
	 // Mutator - changes the value
	 /*
	 public void setWidth(int w)
	 {
		 if(w > 0)
		 {
			 width = w ;
		 }
		 
		 else
		 {
			 width = 0;
		 }
		 		 
	 }
	*/
/* For height : */
	 
	 // Accessor - accessses the value
	 /*
	 public int getHeight()
	  {
		 return height ;
	  }
	 */
	 // Mutator - changes the value
	 /*
	 public void setHeight(int h)
	 {
		 height = (h > 0) ? h : 0; 
	 }
	*/
/* For depth : */
	 
	 // Accessor - accessses the value
	 /*
	 public int getDepth()
	  {
		 return depth ;
	  }
	 */
	 // Mutator - changes the value
	 /*
	 public void setDepth(int d)
	 {
		 depth = (d > 0) ? d : 0; 
	 } */

	 // Object Manipulation Method 
	/* public int volume()
	 {
		 return width*height*depth;
	 }
  }
*/

/* Method2 : - */

public class Box
{
	int width , height , depth;
	
	public void initialise()
	{
		width = 10;
		height = 20;
		depth = 30;
	}
}