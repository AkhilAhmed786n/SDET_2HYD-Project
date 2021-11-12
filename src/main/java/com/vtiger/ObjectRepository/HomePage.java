package com.vtiger.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import vtigerUtilPack.WebDriverUtility;

public class HomePage extends WebDriverUtility  {
	WebDriver driver;
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText="Organizations")
	private WebElement orgLink;
	
	@FindBy(xpath="//img[@src='themes/softed/images/user.PNG']")
	private WebElement admImg;
	
	@FindBy(linkText="Sign Out")
	private WebElement signOutbtn;

	public WebElement getOrgLink() {
		return orgLink;
	}

	public WebElement getAdmImg() {
		return admImg;
	}

	public WebElement getSignOutbtn() {
		return signOutbtn;
	}
	
//	Business logic for clicking on Organisation
	
	public void clickOnOrganisation()
	{
		orgLink.click();
	}
	
	public void signOutFromVtiger()
	{
		mouseOver(driver, admImg);
		signOutbtn.click();
	}
	
}
