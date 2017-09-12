package Strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Quantifier_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String t1 = "Long time ago , there was a long river ... " ;
		String t1 = "Longlonglong ago , in a galaxy far far away" ;
		
		Pattern p = Pattern.compile("(long){2}") ;
		//Pattern pp = Pattern.compile("(gal.{3}");
		
		Matcher m = p.matcher(t1) ;
		//Matcher mm = pp.matcher(t2) ;
		
		while(m.find()) {
			System.out.println(m.group());
		}
		
		String t2 = "Long time ago , there was a long river ... " ;
		
		Pattern pp = Pattern.compile("gal.{3}");
		Matcher mm = pp.matcher(t2) ;
		
		/*
		while(mm.find()) {
			System.out.println(mm.group(0));
		}
		*/
		
		if(mm.find()) {
			System.out.println(mm.group(0));
		}
	}

}
