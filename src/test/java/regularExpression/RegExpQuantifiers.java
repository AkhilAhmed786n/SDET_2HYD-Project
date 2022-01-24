package regularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExpQuantifiers {
	
	public static void main(String[] args) 
	{
		//a+ is used 
//		Pattern p = Pattern.compile("a+");
		
		//a* is used
		Pattern p = Pattern.compile("a*");
		
		//a? is used 
//		Pattern p = Pattern.compile("a?");
		
		Matcher m = p.matcher("aakhilaHMEDaa@786a");
		
		while(m.find())
		{
			System.out.print(m.start()+" "+m.group()+" ");
		}
		
		
	}

}
