package Strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Pattern_Matching_regex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String t = " It was the best times bust bost " ;
		
		Pattern p = Pattern.compile("b.st") ;
		
		Matcher m = p.matcher(t) ;
		
		while(m.find()) {
			// group() is a method which will return the matched string in 't' ...
			
			System.out.println("Found pattern string : " + m.group());
		}
	}

}
