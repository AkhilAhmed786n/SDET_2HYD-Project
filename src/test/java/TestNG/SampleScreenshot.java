package TestNG;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import vtigerUtilPack.BaseClass;

@Listeners(vtigerUtilPack.ListnersImp.class)
public class SampleScreenshot extends BaseClass {
	@Test
	public void createOrg()
	{
		System.out.println(8/0);
	}
	
	public void modifyOrg()
	{
		System.out.println("Modify the Organisation");
	}

}
