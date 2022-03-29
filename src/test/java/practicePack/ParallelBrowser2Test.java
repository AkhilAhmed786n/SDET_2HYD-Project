package practicePack;


import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import vtigerUtilPack.BaseClassNew;

public class ParallelBrowser2Test  extends BaseClassNew{
	
	
	
	
	

//	@Parameters("BROWSER")
	@Test(enabled=true)
	public void parallelBrowser2Test() throws Throwable
	{
////		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
//		
		driver.get("www.amazon.in");
//		
	}
}
