package TestcaseintoScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class OrgWithIndustry {
	
	public static void main(String[] args) throws Throwable 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://localhost:8888/");
		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@id='submitButton']")).click();
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
		WebElement mo= driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
		a.moveToElement(mo).perform();
		Thread.sleep(2000);
		WebElement so= driver.findElement(By.xpath("//a[normalize-space()='Sign Out']"));
		so.click();
		Thread.sleep(2000);
		driver.close();
	}

}


