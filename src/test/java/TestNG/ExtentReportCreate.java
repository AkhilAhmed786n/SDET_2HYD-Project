package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportCreate {
	WebDriver driver;
	ExtentHtmlReporter reporter;//This class will take care look and feel of report
	ExtentReports reports;// Attach the reporter
	ExtentTest test;// To make entries in test

	@BeforeSuite
	public void setupExtent() {
		String dirPath = System.getProperty("user.dir");
		String extentPath = dirPath + "/SDET2Extent.html";
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromeDriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		reporter = new ExtentHtmlReporter(extentPath);
		reporter.config().setDocumentTitle("Vtiger");
		reporter.config().setTheme(Theme.DARK);

		reports = new ExtentReports();
		reports.attachReporter(reporter);

		reports.setSystemInfo("Tester", "Akhil Syed");
		reports.setSystemInfo("Env", "Windows 10");
		reports.setSystemInfo("Build", "6.0.4");
		reports.setSystemInfo("Browser version", "64");

	}

	@Test
	public void launch_fb() {
		test = reports.createTest("launch_fb");

		driver.get("https://www.facebook.com/");
		String actualTitle = driver.getTitle();

		Assert.assertEquals(actualTitle, "Facebook");

	}

	@Test
	public void launch_Vtiger() {
		test = reports.createTest("launch_Vtiger");

		driver.get("http://localhost:8888/");
		String actualTitle = driver.getTitle();

		Assert.assertEquals(true, true);

	}

	@AfterSuite
	public void closeSetup()

	{
		reports.flush();

	}
}