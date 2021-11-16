package CreateOpportunitywithSalesStageId;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import vtigerUtilPack.BaseClass;
import vtigerUtilPack.PropertyFileUtility;
import vtigerUtilPack.WebDriverUtility;

public class CreateOpportunitywithSalesStageIdDecisionMakersTest extends BaseClass {
	@Test
//	public static void main(String args[]) throws Throwable
//	{
	public void createOppurtunityWithSalesStageIdDecisionMakers() throws Throwable {
		
		driver.findElement(By.xpath("//a[@href='index.php?module=Potentials&action=index']")).click();
		driver.findElement(By.xpath("//img[@title='Create Opportunity...']")).click();
		driver.findElement(By.xpath("//input[@name='potentialname']")).sendKeys("Akhil");
		driver.findElement(By.xpath("//tbody/tr[4]/td[2]/img[1]")).click();
		
		Set<String> a = driver.getWindowHandles();
		Iterator<String> b = a.iterator();
		while(b.hasNext())
		{
			String parentwindow = b.next();
			String childwindow = b.next();
			driver.switchTo().window(childwindow);
			driver.findElement(By.xpath("//a[@id='1']")).click();
			driver.switchTo().window(parentwindow);
		}
		
		WebElement dd = driver.findElement(By.xpath("//select[@name='sales_stage']"));
		dd.click();
		WebDriverUtility wdu=new WebDriverUtility();
		wdu.selectByIndex(dd, 4);
		driver.findElement(By.xpath("/html[1]/body[1]/table[4]/tbody[1]/tr[1]/td[2]/div[1]/form[1]/table[1]/tbody[1]/tr[2]/td[1]/div[1]/table[1]/tbody[1]/tr[1]/"
				+ "td[1]/table[1]/tbody[1]/tr[2]/td[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/input[1]")).click();
		
		
		
		
		
		
		
		
		
		
		

		
		
		
		
		
		
		
		
		
		
			
	}
}
