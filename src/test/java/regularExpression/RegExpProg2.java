package regularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExpProg2 {
	
	public static void main(String args[])
	{
		/*
		 * If a static method returning the object of 
		 * its class then it is called as STATIC FACTORY METHOD
		 */
		
		//Pattern class will convert the RE into java Object
		
		Pattern p = Pattern.compile("[A-Za-z0-9]");
		
		//Matcher() taking the target string as argument and
		//converting it to Matcher class Object
		Matcher m = p.matcher("akhilAHMED@786");
		
		while(m.find())
		{
			System.out.print(m.start()+m.group()+" ");
		}
		
	}
}
