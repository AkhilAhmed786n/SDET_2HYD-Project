package practicePack;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LenskartTooltipAndScenario {

	public static void main(String[] args)  
	{

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.lenskart.com/");
	
//		driver.findElement(By.xpath("//input[@class='search_input-bar autoSuggest']")).getAttribute("title");

//		 driver.findElement(By.xpath("//a[@href='/customer/account/']")).getAttribute("title");
//
//		String lenskartimgtp = driver.findElement(By.xpath("//a[@href='/']")).getAttribute("title");
//		System.out.println(Tryin3Dtp+" "+trackOrdertp+" "+lenskartimgtp);
		
		driver.findElement(By.xpath("//input[@class='search_input-bar autoSuggest']")).click();
		
//		System.out.println(driver.findElement(By.xpath("//a[text()='Ray ban']")).getText());
		List<WebElement> allnames = driver.findElements(By.xpath("//div[@class='trending_block']"));
		
		for (int i = 0; i <allnames.size(); i++) 
		{
			System.out.println(allnames.get(i).getText());
		}
		
		driver.close();


	}

}
