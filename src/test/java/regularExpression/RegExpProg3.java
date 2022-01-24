package regularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExpProg3 {
	
	public static void main(String args[])
	{
		
		
//		Pattern p = Pattern.compile("[a-zA-Z0-9\\W");
		
		// for special characters use \\W
		//for digits use \\d
		//for alphabets use \\S
		
		Pattern p = Pattern.compile("[\\S\\d\\W]");
		Matcher m = p.matcher("akhilAHMED@786");
		
		while(m.find())
		{
			System.out.print(m.start()+m.group()+" ");
		}
		
	}

}
