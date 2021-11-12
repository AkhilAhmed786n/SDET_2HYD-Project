package practicePack;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MultipleCheckBoxSelect {
	@Test
	public void multipleCheckBoxSelect() throws Throwable {
//	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://localhost:8888/");
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");
		driver.findElement(By.id("submitButton")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@href=\"index.php?module=Accounts&action=index\"]")).click();
		Thread.sleep(2000);


		List<WebElement> allOrgNames = driver.findElements(By.xpath("//table[@class='lvt small']//tr[*]//td[3]//a[@title=\"Organizations\"]"));
		Thread.sleep(2000);

		List<WebElement> allBoxes = driver.findElements(By.xpath("//table[@class='lvt small']//tr[*]//input[@type=\"checkbox\"]"));
		System.out.println("No of CheckBoxes are :"+allBoxes.size());
		for(int i=2; i<allBoxes.size(); i++)
		{
			allBoxes.get(i).click();
		}

		driver.findElement(By.id("selectCurrentPageRec")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("selectCurrentPageRec")).click();

		String ParticularOrgName = driver.findElement(By.xpath("//a[text()='Shakeel']")).getText();

		for(WebElement OrgName:allOrgNames)
		{
			String OrgText = OrgName.getText();
			System.out.println(OrgText);
//			Thread.sleep(2000);
//
			if(OrgText.equalsIgnoreCase(ParticularOrgName))
			{
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				
				driver.findElement(By.xpath("//a[text()='"+ParticularOrgName+"']/ancestor::tr[@class=\"lvtColData\"]//input[@type=\"checkbox\"]")).click();
				Thread.sleep(3000);
				break;
			}
		}
		driver.close();
	}

}
