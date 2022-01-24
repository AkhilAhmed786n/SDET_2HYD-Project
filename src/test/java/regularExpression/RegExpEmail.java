package regularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExpEmail {
	public static void main(String[] args) {
		
		Pattern p=Pattern.compile("[a-zA-Z0-9]{3,30}[@][a-zA-Z]{3,7}[.][A-Za-z]{0,3}");
		Matcher m = p.matcher("Shaiknoorulla55@gmail.in");
		
		if(m.find() && m.group().equals("Shaiknoorulla55@gmail.in"))
		{
			System.out.println("Gmail is matching");
		}
		else
		{
			System.out.println("Gmail is not matching");
		}
	}

}
