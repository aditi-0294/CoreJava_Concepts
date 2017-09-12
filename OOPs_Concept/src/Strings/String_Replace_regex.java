package Strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class String_Replace_regex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String header = "<h1>This is an H1</h1>" ;
		
		Pattern p1 = Pattern.compile("h1") ;
		
		Matcher m1 = p1.matcher(header) ;
		
		if(m1.find()) {
			// It will find all the h1 string and replace with strong string ..
			
			header = m1.replaceAll("Aditi") ;
			
			System.out.println(header);
		}

	}

}
