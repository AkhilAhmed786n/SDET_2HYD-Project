package practicePack;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IccMatchTest {

	public static void main(String[] args) throws Throwable
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.icc-cricket.com/rankings/mens/team-rankings/odi");
		List<WebElement> teamNames = driver.findElements(By.xpath("//span[@class='u-hide-phablet']"));
		
		List<WebElement> matchesPoints = driver.findElements(By.xpath("//td[@class='table-body__cell u-center-text']"));
		
		String teamINDIA = driver.findElement(By.xpath("//span[text()='India']")).getText();
		
		for(WebElement team : teamNames )
		{
			String teamList = team.getText();
			Thread.sleep(3000);
			System.out.println(teamList);
			
			if (teamList.equalsIgnoreCase(teamINDIA)) 
			{
				String rating = driver.findElement(By.xpath("//span[text()='"+teamINDIA+"']//ancestor::table[@class='table']//descendant::td[@class='table-body__cell u-text-right rating']")).getText();
			Thread.sleep(3000);
				System.out.println(teamINDIA+"====>"+rating);
				break;
			}
		}
		driver.close();

	}
}