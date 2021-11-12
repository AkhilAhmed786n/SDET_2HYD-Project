package practicePack;

import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MakemyTripCalenderHandle {
//		public static void main(String[] args){
	@Test(dataProvider="getvalue")
	public void mnt(String src, String dest) throws Throwable
	{


		Date d=new Date();
		String s = d.toString();
		//		
		String[] arr = s.split(" ");
		//		System.out.println(s);
		String day = arr[0];
		String month = arr[1];
		String currentdate = arr[2];
		String year = arr[5];
//		System.out.println(currentdate);
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");
		driver.findElement(By.xpath("//div[@id='SW']")).click();
		driver.findElement(By.xpath("//span[@class=\"langCardClose\"]")).click();
		driver.findElement(By.xpath("//input[@id='fromCity']")).click();
		driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys(src);
		driver.findElement(By.xpath("//div[text()='"+src+"']")).click();
		//		driver.findElement(By.xpath("//input[@class='react-autosuggest__input react-autosuggest__input--open']")).click();
		driver.findElement(By.xpath("//input[@placeholder='To']")).sendKeys(dest);
		driver.findElement(By.xpath("//div[text()='"+dest+"']")).click();
		driver.findElement(By.xpath("//div[@aria-label='"+day+" "+month+" "+currentdate+" "+year+"']")).click();
		
		Thread.sleep(3000);
//		driver.close();

	}

	@DataProvider
	public Object[][] getvalue()
	{
		Object[][] obj=new Object[2][2];

		obj[0][0]="HYD";
		obj[0][1]="BLR";

		obj[1][0]="HYD";
		obj[1][1]="DEL";

		obj[2][0]="HYD";
		obj[2][1]="MAA";

		obj[3][0]="HYD";
		obj[3][1]="PNQ";

		obj[1][0]="BLR";
		obj[1][1]="HYD";
		return obj;
	}




}
