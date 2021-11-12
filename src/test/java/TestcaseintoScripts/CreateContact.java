package TestcaseintoScripts;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import vtigerUtilPack.PropertyFileUtility;
import vtigerUtilPack.WebDriverUtility;

public class CreateContact {
	

	public static void main(String args[]) throws Throwable
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
	
	PropertyFileUtility pfu=new PropertyFileUtility();
	String URL=pfu.propertyfileutility("url");
	String UN=pfu.propertyfileutility("username");
	String PWD=pfu.propertyfileutility("password");
	driver.get(URL);
	driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys(UN);
	driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys(PWD);
	driver.findElement(By.xpath("//input[@id='submitButton']")).click();
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
	
	WebElement mo = driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
	
	WebDriverUtility wdu=new WebDriverUtility();
	wdu.mouseOver(driver, mo);
	driver.findElement(By.xpath("//a[normalize-space()='Sign Out']")).click();
	
	
	}
}
