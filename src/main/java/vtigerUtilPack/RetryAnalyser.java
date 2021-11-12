package vtigerUtilPack;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyser implements IRetryAnalyzer {
	
	int count=0, retryLimit=4;

	public boolean retry(ITestResult result) {
		
		if(count<retryLimit) 
		{
			count++;
			return true;
		}
		// TODO Auto-generated method stub
		return false;
	}
	

}
