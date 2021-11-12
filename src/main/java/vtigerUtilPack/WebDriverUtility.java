package vtigerUtilPack;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;

public class WebDriverUtility {
	
	/*
	 * this method is to select by index
	 * @
	 * 
	 */
	
	public void selectByIndex(WebElement ele, int index)
	{
		Select sel=new Select(ele);
		sel.selectByIndex(index);
		
	}
	
	/*This method is to select by visible text
	 * 
	 */
	
	public void selectByVisibleText(WebElement ele, String visText)
	{
		Select sel=new Select(ele);
		sel.selectByVisibleText(visText);
	}
	
	/*This method will wait for the page to load
	 * 
	 */
	
	public void waitForPageLoad(WebDriver driver)
	{
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	}
	
	/*
	 * 
	 */
	
	public void waitForElementtobevisible(WebDriver driver, WebElement ele)
	{
		WebDriverWait wait = new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.visibilityOf(ele));
	}
	
	/* This method will perform mouse over actions
	 * 
	 */
	
	public void mouseOver(WebDriver driver, WebElement ele)
	{
		Actions act=new Actions(driver);
		act.moveToElement(ele).perform();
	}
	
	/* this method perform right click action
	 * 
	 */
	
	public void rightClick(WebDriver driver, WebElement ele)
	{
		Actions act= new Actions(driver);
		act.contextClick(ele).perform();
	}
	
	/* This method is to maximiseWindow
	 * 
	 */
	
	public void maximiseWindow(WebDriver driver)
	{
		driver.manage().window().maximize();
	}
	
	/* This method helps to switch from one window to another window
	 * 
	 */
	
	public void switchToWindow(WebDriver driver, String partialWinTitle)
	{
		Set<String> window = driver.getWindowHandles();
		Iterator<String> it = window.iterator();
		while(it.hasNext())
		{
			String winID = it.next();
			String title = driver.switchTo().window(winID).getTitle();
			if(title.contains(partialWinTitle))
			{
				break;
			}
		}
	}
	
	/* Accept alert popup
	 * 
	 */
	
	public void acceptAlert(WebDriver driver)
	{
		driver.switchTo().alert().accept();
	}
	
	/* Dismiss alert popUp
	 * 
	 */
	
	public void dismissAlert(WebDriver driver)
	{
		driver.switchTo().alert().dismiss();
	}
	
	/* switch to frame based on element
	 * 
	 */
	
	public void switchToFrame(WebDriver driver, WebElement element)
	{
		driver.switchTo().frame(element);
	}
	
	/* Switch to frame based on index
	 * 
	 * 
	 */
	
	public void switchToFrame(WebDriver driver, int index)
	{
		driver.switchTo().frame(index);
	}
	
	/* Switch to frame based on ID or Name
	 * 
	 * 
	 */
	
	public void switchToFrame(WebDriver driver, String idorname)
	{
		driver.switchTo().frame(idorname);
	}
	
	/* It will take the screenshot
	 * 
	 */
	
	public String takeScreenShot(WebDriver driver, String screenshotName) throws Throwable
	{
		String screenshotpath = ".screenshot/"+screenshotName+".PNG";
		TakesScreenshot ts=(TakesScreenshot) driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File dst=new File(screenshotpath);
		Files.copy(src, dst);
		return screenshotpath;
		
	}
	
	/* This will scroll to a particular web element
	 *
	 */
	
	public void scrollToWebElement(WebDriver driver, WebElement element)
	{
		JavascriptExecutor js=(JavascriptExecutor) driver;
		int y = element.getLocation().getY();
		js.executeScript("window.scrollBy(0,"+y+")", element);
	}
	
	/* This method will press the enter key on keyboard
	 * 
	 */
	
	public void pressEnter() throws Throwable
	{
		Robot rc=new Robot();
		rc.keyPress(KeyEvent.VK_ENTER);
		rc.keyRelease(KeyEvent.VK_ENTER);
	}

}
