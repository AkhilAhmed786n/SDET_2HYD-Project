package com.vtiger.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganisationPage {
	public OrganisationPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//img[@title='Create Organization...']")
	private WebElement createorg;

	public WebElement getCreateorg() {
		return createorg;
	}

	//	Business Logic

	public void clickOnCreateOrg()
	{
		createorg.click();
	}
}
