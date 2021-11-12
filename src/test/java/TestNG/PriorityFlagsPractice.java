package TestNG;

import org.testng.annotations.Test;

public class PriorityFlagsPractice {
	
	@Test(priority=-1)
	public void vali()
	{
		System.out.println("vali");
	}
	
	@Test(priority=-4, enabled=true)
	public void noor()
	{
		System.out.println("noor");
	}
	
	@Test(priority=0, invocationCount=2, enabled=false)
	public void Aakhil()
	{
		System.out.println("Aakhil");
	}
	
	@Test(priority=-6, dependsOnMethods="noor", invocationCount=6)
	public void loginNoor()
	{
		System.out.println("noor dependency method");
	}
	
	
	

}
