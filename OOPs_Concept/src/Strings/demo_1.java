package Strings;

public class demo_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Aditi Upadhye" ;
		
		System.out.println("Sample string : " + str);
		
		System.out.println("Length of the string : " + str.length());
		
		System.out.println("UpperCase : " + str.toUpperCase());
		
		System.out.println("aditi".length());
		
		String record = "1001 , Aditi , 890000 , Mumbai " ;
		

		String empdata[]=record.split(",");
		
		System.out.println("Employee ID:"+empdata[0]);
		System.out.println("Employee Name:"+empdata[1]);
		System.out.println("Employee Salary:"+empdata[2]);
		System.out.println("Employee Address:"+empdata[3]);
		
		String s_id="S180060100002";
		
		String center_code=s_id.substring(3,8);
		System.out.println("Center Code:"+center_code);
		
		if(center_code.equals("00221"))
			System.out.println("Center:Janakpuri");
		else if(center_code.equals("00601"))
			System.out.println("Center:Baseerbagh");
		
		String sid=s_id.substring(8);
		System.out.println(sid);

	}

}
