package akhilPack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AspireCode3 {

	public static void main(String[] args) {

		String s = "word";

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		List<WebElement> list = driver.findElements(By.xpath("tbody//tr[*]//td[2]"));
		
		   String a = list.toString();
		  
		
		int rowscount = driver.findElements(By.tagName("tr")).size();
			for (WebElement s1 : list) {
				String s2 = s1.getText();
				if (s2.equalsIgnoreCase(s)) {
					System.out.println(s2 + " is present");
					
				}
				

			}
			
			
			for (int i = 0; i < rowscount; i++) 
			{
				
			}
		}

	}


