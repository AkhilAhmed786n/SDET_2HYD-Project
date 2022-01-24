package regularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExpSplit {

	public static void main(String[] args) {

		Pattern p = Pattern.compile(" ");
		String[] s = p.split("Test Yantra Solutions");

		for (String s1 : s) {
			
			System.out.println(s1);
		}

	}

}
