package akhilPack;

import org.testng.annotations.Test;

public class AlphaNumeric_NumAddition {

	@Test
	public void alphaNumericAddition() {

		String s = "12ak3hil456";
		String temp = "";
		int sum = 0;
		char[] ch = s.toCharArray();
		
		/*
		 * For Single Single number addition
		 */
//		for (int i = 0; i < ch.length; i++) {
//			if (Character.isDigit(ch[i])) {
//				temp = temp + ch[i];
//
//				sum = sum + Integer.parseInt(temp);
//				temp = "0";
//
//			}
//		}
//		System.out.println(sum);
//	}
		//Answer is 21
		
		/*
		 * for group of number addition
		 */
		for (int i = 0; i < ch.length; i++) {
			if (Character.isDigit(ch[i])) {
				temp = temp + ch[i];

				

			}
			else
			{
				sum = sum + Integer.parseInt(temp);
				temp = "0";
			}
		}
		sum = sum + Integer.parseInt(temp);
		temp = "0";
		System.out.println(sum);
	}
	//Answer is 471
		
}
