package practicePack;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VtigerTableHandle {
	public static void main(String[] args) throws Throwable
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		//		driver.manage().window().maximize();
		driver.get("http://localhost:8888/");

		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");
		driver.findElement(By.id("submitButton")).click();

		driver.findElement(By.xpath("//a[text()='Organizations']")).click();

		//		List<WebElement> OrgNames = driver.findElements(By.xpath("//table[@class='lvt small']//tr[*]//td[3]"));
		//		

		//		for (int i = 1; i <OrgNames.size(); i++)
		//		{
		//			System.out.println(OrgNames.get(i).getText());
		//		}

		//		for (WebElement webElement : OrgNames) 
		//		{
		//			System.out.println(webElement.getText());
		//		}
		List<WebElement> allCheckBox = driver.findElements(By.xpath("//table[@class='lvt small']//tr[*]//td[1]"));

		List<WebElement> allOrgName = driver.findElements(By.xpath("//table[@class=\"lvt small\"]//tr[*]//td[3]//a[@title=\"Organizations\"]"));


		String originalText = driver.findElement(By.xpath("//a[text()='sadiq1']")).getText();

		for(WebElement oneOrgName : allOrgName)
		{
			String oneText = oneOrgName.getText();
			System.out.println(oneText);
			if(oneText.equalsIgnoreCase(originalText))
			{
				Thread.sleep(3000);
				driver.findElement(By.xpath("//a[text()='"+originalText+"']/ancestor::tr[@class='lvtColData']//input[@type='checkbox']")).click();
				break;
			}

			//	System.out.println(oneOrgName.getText());

		}

		//		for(int i=1; i<allOrgName.size(); i++)
		//		{
		//			System.out.println(allOrgName.get(i).getText());
		//		}



		//	}
		//}

		//		
		//		
	}
}
