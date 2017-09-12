package Strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Greediness_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String t1 = "Longlonglonglong ago , in a galaxy far far away" ;
		
		Pattern p = Pattern.compile("ago.*?far") ;
		
		Matcher m = p.matcher(t1) ;
		
		if(m.find()) 
			System.out.println(m.group(0));
		

	}

}
