package com.vtiger.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import vtigerUtilPack.WebDriverUtility;

public class CreateOrganisation extends WebDriverUtility {
	WebDriver driver;
	
	public CreateOrganisation(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(name="accountname")
	private WebElement orgName;
	
	@FindBy(name="industry")
	private WebElement indType;
	
	@FindBy(xpath="//input[@title='Save [Alt+S]']")
	private WebElement saveBtn;

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getOrgName() {
		return orgName;
	}

	public WebElement getIndType() {
		return indType;
	}

	public WebElement getSaveBtn() {
		return saveBtn;
	}
	
	
	
//	Business Logic
	
	public void createOrgName(String organisationName)
	{
		orgName.sendKeys(organisationName);
		saveBtn.click();
	}
	
	public void createOrganisationWithIndustry(String organisationName, String Finance)
	{
		orgName.sendKeys(organisationName);
		selectByVisibleText(indType, Finance);
		saveBtn.click();
	}
	
	
	
	
	
	
	
	

}
