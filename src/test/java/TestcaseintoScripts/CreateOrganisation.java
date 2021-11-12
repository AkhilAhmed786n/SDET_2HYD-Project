package TestcaseintoScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import vtigerUtilPack.PropertyFileUtility;
import vtigerUtilPack.WebDriverUtility;

public class CreateOrganisation {

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
		driver.findElement(By.xpath("//a[@href='index.php?module=Accounts&action=index'][normalize-space()='Organizations']")).click();
		driver.findElement(By.xpath("//img[@title='Create Organization...']")).click();
		driver.findElement(By.xpath("//input[@name='accountname']")).sendKeys("Shakeel");
		driver.findElement(By.xpath("/html[1]/body[1]/table[4]/tbody[1]/tr[1]/td[2]/div[1]/form[1]/table[1]/tbody[1]/tr[2]/td[1]/table[1]/"
				+ "tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[2]/td[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/input[1]")).click();

		WebDriverUtility wdu=new WebDriverUtility();
		WebElement mo = driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));


		wdu.mouseOver(driver, mo);
		driver.findElement(By.xpath("//a[normalize-space()='Sign Out']")).click();
		driver.close();




	}
}
