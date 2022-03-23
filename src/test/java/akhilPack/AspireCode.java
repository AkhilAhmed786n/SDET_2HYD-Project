package akhilPack;

import java.util.Iterator;

public class AspireCode {
	
	public static void main(String[] args) {
		
		String str="Good Noon Mam";
		
		String[] s1 = str.split(" ");
		
		for (int i = 0; i < s1.length; i++) 
		{
			char s2 = s1[i].charAt(0);
			
			System.out.println("Char of "+s1[i]+" is "+s2);
		}
	}

}
