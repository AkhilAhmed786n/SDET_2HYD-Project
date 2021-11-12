package practicePack;

import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Makemytripfuturedatecalender {
	public static void main(String[] args) throws Throwable
	{


//			Date d=new Date();
//			String s = d.toString();
//			//		
//			String[] arr = s.split(" ");
//			//		System.out.println(s);
//			String day = arr[0];
//			String month = arr[1];
//			String currentdate = arr[2];
//			String year = arr[5];
//			System.out.println(currentdate);
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.get("https://www.makemytrip.com/");
			driver.findElement(By.xpath("//div[@id='SW']")).click();
			driver.findElement(By.xpath("//span[@class=\"langCardClose\"]")).click();
			driver.findElement(By.xpath("//input[@id='fromCity']")).click();
			driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("HYD");
			driver.findElement(By.xpath("//div[text()='HYD']")).click();
			//		driver.findElement(By.xpath("//input[@class='react-autosuggest__input react-autosuggest__input--open']")).click();
			driver.findElement(By.xpath("//input[@placeholder='To']")).sendKeys("BLR");
			driver.findElement(By.xpath("//div[text()='BLR']")).click();
//			driver.findElement(By.xpath("//div[@aria-label='"+day+" "+month+" "+currentdate+" "+year+"']")).click();
			
			
//			Thread.sleep(2000);
//			driver.close();
			
			for (int i= 0; i<11; i++) 
			{
				
				
				try {
					driver.findElement(By.xpath("//div[@aria-label='Sat Feb 19 2022']")).click();
					System.out.println("selected Feb 19 Successfully");
					break;
					
				} catch (Exception e) {
					// TODO: handle exception
					driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
				}
				
			}
			

		}

}
