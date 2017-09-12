package Strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Boundary_Matches_regex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String t1 = "It was the best of times or it was the worst of times" ;
		
		Pattern p = Pattern.compile("^It.*?times") ;
		
		Matcher m = p.matcher(t1) ;
		
		if(m.find()) {
			System.out.println(m.group(0));
		}

	}

}
