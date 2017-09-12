package Strings;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Pattern_Matcher_Digit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String t = "Jo told me 20 ways to San Jose in 15 minutes " ;
		
		Pattern p = Pattern.compile("(\\d\\d)") ; // space in 'd' doesnt' give any output ....
		
		Matcher m = p.matcher(t) ;
		
		while(m.find()) {
			System.out.println(m.group());
		}

	}

}
