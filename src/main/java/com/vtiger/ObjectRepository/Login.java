package com.vtiger.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class Login {

//	1. create separate java class for every page in a application &
//	        class name should be same page name

//	4. For Every POM class  create Constructor to get an Object of the class & 
//	initialize the Page Elements ,  in order to initialize all the page Elements
//	we should use Pagefactory.initElement() (Element initialization)
	
	public Login(WebDriver driver)   
	{
		PageFactory.initElements(driver, this);
	}

//	2. Identify all the elements using @findBy & @findAll , @FindBys annotations & 
//	        store them in specific POM / java class (Element declaration)
	
//	4. Declare all the WebElements as private & provide getters methods to accesses elements
//	in testScripts class [this processes is called Encapsulation]

//		@FindBy(name="user_name") 
//		private WebElement usernameTxtFld;

	@FindAll({@FindBy(name="user_name"),@FindBy(xpath="//input[@type='text']")})
	private WebElement usernameTxtFld;

//		@FindBy(name="user_password")
//		private WebElement passwordTxtFld;

	@FindBys({@FindBy(name="user_password"),@FindBy(xpath="//input[@type='password']\"")})
	private WebElement passwordTxtFld;

	@FindBy(id="submitButton")
	private WebElement loginbtn;
	
//	3. Generate getter methods by right click/source/generate getter/Generate

	public WebElement getUsernameTxtFld() {
		return usernameTxtFld;
	}

	public WebElement getPasswordTxtFld() {
		return passwordTxtFld;
	}

	public WebElement getLoginbtn() {
		return loginbtn;
	}
	
//	5. Go to every & identify the reusable business libraries & implement them in
//	same POM class 
//	i.e; Create Business Logic for all the classes
	
	public void loginIntoVtiger(String username, String password)
	{
		usernameTxtFld.sendKeys(username);
		passwordTxtFld.sendKeys(password);
		loginbtn.click();
	}
	
	










}
