package TestNG;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import vtigerUtilPack.BaseClass;
import vtigerUtilPack.BaseClassParallelBrowser;
import vtigerUtilPack.JavaUtility;
import vtigerUtilPack.PropertyFileUtility;
import vtigerUtilPack.WebDriverUtility;

public class OrganisationModuleTest extends BaseClass{

	@Test(groups="SmokeTest")
	public void createOrganisation() throws Throwable
	{
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[@href='index.php?module=Accounts&action=index'][normalize-space()='Organizations']")).click();
		driver.findElement(By.xpath("//img[@title='Create Organization...']")).click();
		driver.findElement(By.xpath("//input[@name='accountname']")).sendKeys("Shakeel"+JavaUtility.generateRandomNumber());
		driver.findElement(By.xpath("/html[1]/body[1]/table[4]/tbody[1]/tr[1]/td[2]/div[1]/form[1]/table[1]/tbody[1]/tr[2]/td[1]/table[1]/"
				+ "tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[2]/td[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/input[1]")).click();
//		driver.switchTo().alert().accept();
		System.out.println("Created Organisation successfully");
		System.out.println("hero");
		
	}

	@Test(groups="SanityTest")
	public void OrgWithIndustry() throws Throwable 
	{
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[@href='index.php?module=Accounts&action=index']")).click();
		driver.findElement(By.xpath("//img[@title='Create Organization...']")).click();

		Thread.sleep(2000);
		WebElement ddAddr = driver.findElement(By.xpath("//select[@name='industry']"));
		ddAddr.click();
		Select s = new Select(ddAddr);
		s.selectByValue("Environmental");	
		Thread.sleep(2000);
		Actions a = new Actions(driver);	
		System.out.println("Created Industry");
		
		
	}

	@Test(groups="RegressionTest")
	public void createContact() throws Throwable 
	{
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[normalize-space()='Contacts']")).click();
		driver.findElement(By.xpath("//img[@title='Create Contact...']")).click();
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Vali");
		driver.findElement(By.xpath("//tbody/tr[5]/td[2]/img[1]")).click();

		Set<String> a = driver.getWindowHandles();
		Iterator<String> b = a.iterator();
		while(b.hasNext())
		{
			String parentwindow = b.next();
			String childwindow = b.next();
			driver.switchTo().window(childwindow);
			driver.findElement(By.xpath("//a[@id='2']")).click();
			driver.switchTo().window(parentwindow);
		}

		driver.findElement(By.xpath("//input[contains(@class,'crmButton small save')]")).click();

		System.out.println("Created contact successfully");


	}
}




