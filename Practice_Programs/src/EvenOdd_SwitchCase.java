// Even - odd num check using switch-case do-while loop 

import java.util.Scanner;

class EvenOdd_SwitchCase
{
    public static void main(String args[])
    {
    	int num,i,choice,ch;
    	Scanner scan=new Scanner(System.in);
       
    	// System.out.println("Enter the no:-");
       // num=scan.nextInt();
         
    	do{
    		
    	System.out.println("Please enter Choice 1.EVEN ODD 2.Exit");
        ch=scan.nextInt();
        
        
        switch(ch)
        {
        case 1:
        	   //System.out.println("Number is Even");
        	   System.out.println("Enter the no:-");
                num=scan.nextInt();
                if(num%2==0)
                {
                	System.out.println("No is EVEN");
                }
                else
                {
                	System.out.println("No is ODD");
                }
        	   break;
          
        case 2:
        	    System.out.println("You have selected 2nd option");
        	    break;
        
         default: System.out.println("Invalid Choice");
        
        }
        
    }while(ch!=2);

}
}   