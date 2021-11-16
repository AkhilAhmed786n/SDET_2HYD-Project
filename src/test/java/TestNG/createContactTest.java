package TestNG;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import vtigerUtilPack.BaseClass;
import vtigerUtilPack.PropertyFileUtility;
import vtigerUtilPack.WebDriverUtility;

public class createContactTest extends BaseClass {

	@Test
	public void CreateContact() throws Throwable
	{

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[normalize-space()='Contacts']")).click();
		driver.findElement(By.xpath("//img[@title='Create Contact...']")).click();
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Arun");
		driver.findElement(By.xpath("//tbody/tr[5]/td[2]/img[1]")).click();

		Set<String> a = driver.getWindowHandles();
		Iterator<String> b = a.iterator();
		while(b.hasNext())
		{
			String parentwindow = b.next();
			String childwindow = b.next();
			driver.switchTo().window(childwindow);
			driver.findElement(By.xpath("//a[@id='1']")).click();
			driver.switchTo().window(parentwindow);
		}

		driver.findElement(By.xpath("//input[contains(@class,'crmButton small save')]")).click();
		
		

//		WebElement mo = driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));


	}

}
