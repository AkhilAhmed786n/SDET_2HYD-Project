package TestNG;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {
	
	@DataProvider
	public Object[][] sendData(){
		Object[][] ob = new Object[3][2];
		
		ob[0][0]="Accnt_1";
		ob[0][1]=1234;
		
		ob[1][0]= "Accnt_2";
		ob[1][1]=2345;
		
		ob[2][0]= "Accnt_3";
		ob[2][1]=3456;
		return ob;				
	}
	
	@Test(dataProvider="sendData")
	public void getData(String Name, double bal)
	{
//		Reporter.log("Name of Account Holder : "+Name+" Balance : "+bal, true);
		System.out.println("Name of Account Holder : "+Name+" Balance : "+bal);
	}

}
