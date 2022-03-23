package practiceTestng;

import org.testng.annotations.Test;

public class Class1Test   {
	
	@Test(priority=0, groups="one")
	public void class1Test()
	{
		System.out.println("Printing Class1");
	}
	
	@Test(priority=1, groups="two")
	public void class01Test()
	{
		System.out.println("printing class01");
	}

}
