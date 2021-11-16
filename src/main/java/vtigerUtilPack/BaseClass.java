package vtigerUtilPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

public class BaseClass {
	
	public static WebDriver driver;

	public PropertyFileUtility pfu = new PropertyFileUtility();
	public WebDriverUtility wdu = new WebDriverUtility();
	public ExcelUtility eu=new ExcelUtility();
//	public static WebDriver sdriver;
	
	@BeforeSuite(groups={"SmokeTest","RegressionTest","SanityTest"})
	public void connectDB()
	{
		System.out.println("Connect to Database");
	}
	
	@BeforeClass(groups={"SmokeTest","RegressionTest","SanityTest"})
	public void openBrowser() throws Throwable
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromeDriver.exe");
		
		driver= new ChromeDriver();	
		
		String URL = pfu.propertyfileutility("url");
		driver.get(URL);
//		sdriver=driver;
	}
	
	@BeforeMethod(groups={"SmokeTest","RegressionTest","SanityTest"})
	public void login() throws Throwable
	{
		String UN = pfu.propertyfileutility("username");
		String PWD = pfu.propertyfileutility("password");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name=\"user_name\"]")).sendKeys(UN);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name=\"user_password\"]")).sendKeys(PWD);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id=\"submitButton\"]")).click();
		Thread.sleep(1000);
		wdu.waitForPageLoad(driver);
	}
	
	@AfterMethod(groups={"SmokeTest","RegressionTest","SanityTest"})
	public void logout() throws Throwable
	{
		Thread.sleep(3000);
		WebElement logout = driver.findElement(By.xpath("//img[@src=\"themes/softed/images/user.PNG\"]"));
		wdu.mouseOver(driver, logout);
		driver.findElement(By.xpath("//a[text()='Sign Out']")).click();
	}
	@AfterClass(groups={"SmokeTest","RegressionTest","SanityTest"})
	public void closeBrowser() throws Throwable
	{
		Thread.sleep(2000);
		driver.close();
	}
	
	@AfterSuite(groups={"SmokeTest","RegressionTest","SanityTest"})
	public void disconnectDB()
	{
		System.out.println("Disconnect to Database");
	}
	

}
