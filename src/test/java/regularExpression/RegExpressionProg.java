package regularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExpressionProg {
	
	public static void main(String args[])
	{
		/*
		 * If a static method returning the object of 
		 * its class then it is called as STATIC FACTORY METHOD
		 */
		
		//Pattern class will convert the RE into java Object
		
		Pattern p = Pattern.compile("aba");
		
		//Matcher() taking the target string as argument and
		//converting it to Matcher class Object
		Matcher m = p.matcher("ababaaababaababa");
		
		while(m.find())
		{
			System.out.println(m.start()+" "+m.end()+" "+m.group());
		}
		
	}

}
