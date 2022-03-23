package TestNG;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BrokenLinks {

	@Test
	public void brokenlinks() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.get("http://www.zlti.com");
		List<WebElement> totalLinks = driver.findElements(By.tagName("a"));
		int NumOflinks = totalLinks.size();
		System.out.println("Total number of links are" + NumOflinks);
		int count = 0;

		for (WebElement singlelink : totalLinks) {

			String url = singlelink.getAttribute("href");

			try {
				URL link = new URL(url);

				HttpURLConnection httpurlcon = (HttpURLConnection) link.openConnection();

				httpurlcon.setConnectTimeout(2000);

				httpurlcon.connect();
				if (httpurlcon.getResponseCode() == 200) {
					System.out.println(url + "-" + httpurlcon.getResponseMessage());
					count++;
				} else

				if (httpurlcon.getResponseCode() == 404) {
					System.out.println(url + "-" + httpurlcon.getResponseMessage());
				}

			} catch (Throwable	 e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		System.out.println(count);

	}

}
