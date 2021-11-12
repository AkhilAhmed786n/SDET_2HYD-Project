package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import vtigerUtilPack.BaseClass;
import vtigerUtilPack.ExcelUtility;
import vtigerUtilPack.JavaUtility;

public class CreateOrgnisationTest extends BaseClass {
		@Test
	public void createOrganisationTest() throws Throwable
	{
	String OrgName=eu.excelutility("Sheet1", 1,2)+"_"+JavaUtility.generateRandomNumber();
	
//	Create Organisation
	
	driver.findElement(By.xpath("//a[@href='index.php?module=Accounts&action=index'][normalize-space()='Organizations']")).click();
	driver.findElement(By.xpath("//img[@title='Create Organization...']")).click();
	driver.findElement(By.xpath("//input[@name='accountname']")).sendKeys(OrgName);
	driver.findElement(By.xpath("/html[1]/body[1]/table[4]/tbody[1]/tr[1]/td[2]/div[1]/form[1]/table[1]/tbody[1]/tr[2]/td[1]/table[1]/"
			+ "tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[2]/td[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/input[1]")).click();
	Reporter.log("Organisation got Created Successfully");
	
	WebElement OrgInfo=driver.findElement(By.className("dvHeaderText"));
	String OrganisationInfo=OrgInfo.getText();
	System.out.println(OrganisationInfo);
	Assert.assertTrue(OrganisationInfo.contains(OrgName));
	Reporter.log("Verification got passed");
			
	}

}
