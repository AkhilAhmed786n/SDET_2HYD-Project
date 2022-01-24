package vtigerUtilPack;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import jdk.internal.org.jline.utils.Log;

public class BaseClassLog4j {
	
	public static WebDriver driver;

	public PropertyFileUtility pfu = new PropertyFileUtility();
	public WebDriverUtility wdu = new WebDriverUtility();
	public ExcelUtility eu = new ExcelUtility();
	Logger Log=Logger.getLogger(BaseClassLog4j.class);
	
	@BeforeSuite(groups = { "SmokeTest", "RegressionTest", "SanityTest" })
	public void connectDB() {
		Log.info("connecting to Database");
		System.out.println("Connect to Database");
	}

	@BeforeClass(groups = { "SmokeTest", "RegressionTest", "SanityTest" })
	public void openBrowser() throws Throwable {
		Log.info("opening browser");
		System.setProperty("webdriver.chrome.driver", "./drivers/chromeDriver.exe");

		driver = new ChromeDriver();

		String URL = pfu.propertyfileutility("url");
		driver.get(URL);
//		sdriver=driver;
	}

	@BeforeMethod(groups = { "SmokeTest", "RegressionTest", "SanityTest" })
	public void login() throws Throwable {
		Log.info("Login to application");
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

	@AfterMethod(groups = { "SmokeTest", "RegressionTest", "SanityTest" })
	public void logout() throws Throwable {
		Log.info("logout from application");
		Thread.sleep(3000);
		WebElement logout = driver.findElement(By.xpath("//img[@src=\"themes/softed/images/user.PNG\"]"));
		wdu.mouseOver(driver, logout);
		driver.findElement(By.xpath("//a[text()='Sign Out']")).click();
	}

	@AfterClass(groups = { "SmokeTest", "RegressionTest", "SanityTest" })
	public void closeBrowser() throws Throwable {
		Log.info("closing the browser");
		Thread.sleep(2000);
		driver.close();
	}

	@AfterSuite(groups = { "SmokeTest", "RegressionTest", "SanityTest" })
	public void disconnectDB() {
		Log.info("Disconnecting to Database");
		System.out.println("Disconnect to Database");
	}


}
