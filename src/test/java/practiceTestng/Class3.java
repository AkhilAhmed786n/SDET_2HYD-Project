package practiceTestng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Class3 {

	@Parameters("browser")
	@Test(enabled=false)
	public void class3()
	{
		System.out.println("printing class3");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
	}
	
	@Parameters("browser")
	@Test(groups="three")
	public void class03()
	{
		System.out.println("printing class03");
	}
}
