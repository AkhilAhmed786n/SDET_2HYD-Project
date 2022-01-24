package regularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExpMobileNum {
	
	public static void main(String[] args) {
		
		
		/*
		 * for 11 digit number starting digit is zero [0] and starts the number from [6-9]
		 * and [0-9] for the remaining and {9} for repeating last expression for 9 times
		 */
//		Pattern p=Pattern.compile("[0][6-9][0-9]{9}");
		
		/*
		 * for 12digit number it can start from 0 or 91
		 */
		Pattern p=Pattern.compile("[0?/91?][6-9][0-9]{9}");
		Matcher m = p.matcher("918985588830");
		
		if(m.find() && m.group().equals("918985588830"))
		{
			System.out.println("Mobile number is matching");
		}
		else
		{
			System.out.println("Mobile number is not matching");
		}
	}

}
