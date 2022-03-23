package practiceTestng;

import org.testng.annotations.Test;

public class Class2 {
	
	@Test(groups="two")
	public void class2()
	{
		System.out.println("printing class2");
	}
	
	@Test(groups="three")
	public void class02()
	{
		System.out.println("printing class02");
	}
}
