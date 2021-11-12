package practicePack;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OlympicsNameandMedal {
	
	public static void main(String[] args) throws Throwable
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://olympics.com/");
		driver.findElement(By.id("onetrust-accept-btn-handler")).click();
		
//		String oneAthletName = driver.findElement(By.xpath("//span[text()='Eliud KIPCHOGE']")).getText();
		
		 List<WebElement> medalsofathlets = driver.findElements(By.xpath("//span[text()='Eliud KIPCHOGE']/ancestor::ul/li/div[@class='featured-athlete__medals text-body-sm']"));
		 List<WebElement> namesofathlets = driver.findElements(By.xpath("//span[text()='Eliud KIPCHOGE']/ancestor::ul/li/descendant::a[@class='featured-athlete__name d-flex text-body']"));
		
		 
		 
//		String namesText = namesofathlets.getText();
//		String medalsText = medalsofathlets.getText();
//		System.out.println(medalsText+"=========>"+namesText);
		
		for (int i = 0; i <namesofathlets.size(); i++) 
		{
			
			
			System.out.println(namesofathlets.get(i).getText());
			System.out.println(medalsofathlets.get(i).getText());
			
			
		}
		
//		System.out.println(namesText);
		driver.close();
		
		
		
		
		
	

}
}
