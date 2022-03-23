package akhilPack;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlgoshackCode2 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("selenium");
		List<WebElement> list = driver.findElements(By.xpath("//div[@class='pcTkSc']"));
		
		System.out.println(list.size());	
		
		for (int i = 0; i <list.size()-1; i++) 
		{
		 String text=list.get(i).getText();
		 System.out.println(text);
		}

		driver.close();
	}

}
