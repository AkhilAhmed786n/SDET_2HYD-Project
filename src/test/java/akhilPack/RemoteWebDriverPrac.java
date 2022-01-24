package akhilPack;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class RemoteWebDriverPrac {

@Test
public void remoteEx() throws MalformedURLException, Throwable
{
	URL url=new URL("http://192.168.150.1:4444/wd/hub");
	DesiredCapabilities dc=new DesiredCapabilities().chrome();
	dc.setCapability("browser", "chrome");
	dc.setPlatform(Platform.WINDOWS);
	RemoteWebDriver driver=new RemoteWebDriver(url, dc);
	driver.get("http://amazon.com/");

	Actions ac=new Actions(driver);
}
}