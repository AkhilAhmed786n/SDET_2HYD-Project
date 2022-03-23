package akhilPack;

import java.sql.DriverManager;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JaiBhimPrime {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		driver.get("https://www.primevideo.com/");
		driver.findElement(By.xpath("//input[@class='pv-nav-search-query']")).sendKeys("jai bhim");
		List<WebElement> list = driver.findElements(By.xpath("//a[@class='pv-nav-search-suggestion-item']"));
		
		for (WebElement sl : list) 
		{
			String act="Jai Bhim";
			String ele = sl.getText();
			if(ele.equalsIgnoreCase(act))
			{
				sl.click();
				
			}
			break;
		}
		
		driver.findElement(By.xpath("//div[@class='_38SAO3 tst-hover-container _1pYuE7 _1aBOAx']//"
				+ "descendant::a[text()='Jai Bhim (Telugu)']")).click();
		
		
		

	}

}
