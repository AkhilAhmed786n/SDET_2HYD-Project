package DDT_prog;

import org.testng.annotations.Test;
import org.testng.xml.XmlTest;

public class CreateCustomerTest {
	
	@Test
	public void createCustomerTest(XmlTest xml) {
		System.out.println("Execute Test1");
		
		String Browser = xml.getParameter("browser");
		System.out.println(Browser);
	}
	

}
