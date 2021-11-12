package practicePack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class amazonMiFirstMobile {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("MI mobiles under 15000");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		driver.findElement(By.xpath("//span[@class='a-size-base a-color-base'][normalize-space()='MI']")).click();
//		driver.findElement(By.xpath("//span[normalize-space()='MI Xiaomi Mi A2 (Black, 4GB RAM, 64GB Storage)']")).click();
//		driver.findElement(By.id("priceblock_ourprice")).getText();
		WebElement price = driver.findElement(By.xpath("//span[@class=\"a-price-whole\"]"));
		String MIPrice = price.getText();
	
			
	}
	
}
