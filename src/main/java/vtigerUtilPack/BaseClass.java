package vtigerUtilPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.vtiger.ObjectRepository.Login;

public class BaseClass {

	public WebDriver driver;
	public static WebDriver sdriver;
	public WebDriverUtility wUtil = new WebDriverUtility();
	public ExcelUtility eu = new ExcelUtility();
	public PropertyFileUtility pUtil = new PropertyFileUtility();

	@BeforeSuite(groups={"SmokeTest","RegressionTest","SanityTest"})
	public void connectDB() {
		Reporter.log("Connect the Database", true);
	}

//	@Parameters("BROWSER")
	@BeforeClass(groups={"SmokeTest","RegressionTest","SanityTest"})
	public void openBrowser() throws Throwable {
		Reporter.log("Open the Browser", true);

		String BROWSER = pUtil.propertyfileutility("browser");

		if (BROWSER.equalsIgnoreCase("chrome")) {
			System.setProperty(IPathConstant.ChromeKey, IPathConstant.ChromePath);
			driver = new ChromeDriver();
		} else if (BROWSER.equalsIgnoreCase("firefox")) {
			System.setProperty(IPathConstant.GeckoKey, IPathConstant.GeckoPath);
			driver = new FirefoxDriver();
		} else {
			Reporter.log("Please Enter Proper Browser Name", true);
		}
	}

	@BeforeMethod(groups={"SmokeTest","RegressionTest","SanityTest"})
	public void login() throws Throwable {
		Reporter.log("Login to Application", true);

		driver.get(pUtil.propertyfileutility("url"));
		Thread.sleep(3000);
//		driver.findElement(By.xpath("//input[@name=\"user_name\"]")).sendKeys(pUtil.propertyFileUtility("username"));
//		driver.findElement(By.xpath("//input[@name=\"user_password\"]"))
//				.sendKeys(pUtil.propertyFileUtility("password"));
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//input[@id=\"submitButton\"]")).click();
//		Thread.sleep(3000);
		Login l = new Login(driver);
		l.loginIntoVtiger(pUtil.propertyfileutility("username"), pUtil.propertyfileutility("password"));

		wUtil.waitForPageLoad(driver);
	}

	@AfterMethod(groups={"SmokeTest","RegressionTest","SanityTest"})
	public void logout() throws Throwable {
		Reporter.log("Logout from Application", true);

		Thread.sleep(4000);
		wUtil.mouseOver(driver, driver.findElement(By.xpath("//img[@src=\"themes/softed/images/user.PNG\"]")));
		driver.findElement(By.xpath("//a[text()='Sign Out']")).click();

//		HomePage hp = new HomePage(driver);
//		
//		hp.signOutFromVtiger();

	}

	@AfterClass(groups={"SmokeTest","RegressionTest","SanityTest"})
	public void closeBrowser() throws InterruptedException {
		Reporter.log("Close the Browser", true);

		Thread.sleep(4000);
		driver.close();
	}

	@AfterSuite(groups={"SmokeTest","RegressionTest","SanityTest"})
	public void disconnectDB() {
		Reporter.log("DisConnect the Database", true);

	}
}
