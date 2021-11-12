package vtigerUtilPack;

import java.util.Random;

public class JavaUtility {
	public static int generateRandomNumber()
	{
		Random r = new Random();
		int number = r.nextInt(1000);
		return number;
	}

}
