package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class PracticeTestng {

	@BeforeSuite
	public void ConnectToDB()
	{
		System.out.println("Connect to Database");
	}

	@BeforeClass
	public void launchTheBrowser()
	{
		System.out.println("Open the Browser");
	}

	@BeforeMethod
	public void login()
	{
		System.out.println("Login into the Application");
	}

	@Test
	public void CreateOrganisation() 
	{
		System.out.println("Create the Organisation");
	}

	@Test
	public void ModifyTheOrganisation()
	{
		System.out.println("Modify the Organisation");
	}

	@AfterMethod
	public void logout()
	{
		System.out.println("Logout from the Application");
	}

	@AfterClass
	public void CloseTheBrowser()
	{
		System.out.println("Close the Browser");
	}

	@AfterSuite
	public void DisconnectTODatabase()
	{
		System.out.println("DisConnect to Database");
	}


}
