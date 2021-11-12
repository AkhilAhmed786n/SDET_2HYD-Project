package TestNG;

import org.testng.annotations.Test;

public class SampleRetryAnalyserTest {
	
	@Test(retryAnalyzer = vtigerUtilPack.RetryAnalyser.class)
	public void CreateOrg()
	{
		System.out.println(10/0);
	}

}
