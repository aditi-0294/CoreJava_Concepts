package Strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcher_demo_regex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String target_string = "Hi , My name is Aditi " ;
		
		/* Pattern search string is created to check to which string pattern is there or not ...
		 * 
		 * Compile method is a static method as this method is called by the class name . This method returns a Pattern object ... 
		 * 
		 * We cant' create a Pattern object directly ...
		 */
		
	//	Pattern p = Pattern.compile("my") ;
		Pattern p = Pattern.compile("My") ;
		
		/* Matcher is a method which takes the target string from where we need to find the pattern
		 * 
		 * This method returns the Matcher object ....
		 */
		
		Matcher m = p.matcher(target_string) ;
		
		/* find() method of Matcher class will return boolean value ..
		 * 
		 * It will return true if there is a match with the target string else it returns false . 
		 */

		if(m.find())
			System.out.println("Match found");
		else
			System.out.println("Pattern not found");
	}

}
