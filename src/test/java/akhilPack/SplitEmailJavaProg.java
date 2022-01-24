package akhilPack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SplitEmailJavaProg {
	public static void main(String args[])
	{
		String str="akhil786@gmail.com";
		
		StringBuffer sb=new StringBuffer(),
		num=new StringBuffer(), spcl=new StringBuffer();
		
		for(int i=0; i<str.length();i++)
		{
		if(Character.isAlphabetic(str.charAt(i)))
			sb.append(str.charAt(i));
		else if (Character.isDigit(str.charAt(i)))
			num.append(str.charAt(i));
		else 
			spcl.append(str.charAt(i));
		
		}
//		System.out.println(sb);
//		System.out.println(num);
//		System.out.println(spcl);
		
		StringBuffer sa=new StringBuffer(str);
		StringBuffer a = sa.reverse();
		System.out.println(a);

}
}
