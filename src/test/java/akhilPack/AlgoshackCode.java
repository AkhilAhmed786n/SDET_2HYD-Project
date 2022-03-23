package akhilPack;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.mysql.cj.jdbc.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import vtigerUtilPack.IPathConstant;

public class AlgoshackCode {
	
	public static void main(String []args) throws Throwable
	{
	FileInputStream fis=new FileInputStream(IPathConstant.xyzExcel);
	Workbook wb=WorkbookFactory.create(fis);
	String A=wb.getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
	String B=wb.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
	String C=wb.getSheet("Sheet1").getRow(2).getCell(0).getStringCellValue();
	
	System.out.println(A);
	System.out.println(B);
	System.out.println(C);

	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();

	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

	driver.get("file:///X:/@QSPIDERS/Selenium/HTML/text.html");
	driver.findElement(By.className("textbox1")).sendKeys(A);
	driver.findElement(By.className("textbox2")).sendKeys(B);
	driver.findElement(By.className("textbox3")).sendKeys(C);

	driver.findElement(By.xpath("//a[text()='Save']")).click();

	Driver d=new Driver();
	DriverManager.registerDriver(d);
	Connection con=DriverManager.getConnection("urlofDatabase","username","password");
	Statement stmt=con.createStatement();
	ResultSet res=stmt.executeQuery("select * from table;");

	while(res.next())
	{
	if(res.getString(A).equals(A))
	{
	System.out.println(A+" is present");
	}
	else
	{
	System.out.println(A+" is not present");
	}
//	if(getString().equals(B))
//	{
//	System.out.println(B+" is present");
//	}
//	else
//	{
//	System.out.println(B+" is not present");
//	}
//	if(getString().equals(C))
//	{
//	System.out.println(C+" is present");
//	}
//	else
//	{
//	System.out.println(C+" is not present");
//	}
	}


	}

}
