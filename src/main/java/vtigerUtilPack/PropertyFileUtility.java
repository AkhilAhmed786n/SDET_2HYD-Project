package vtigerUtilPack;

import java.io.FileInputStream;
import java.util.Properties;

import org.testng.annotations.Test;

public class PropertyFileUtility {
	@Test
	public String propertyfileutility(String key) throws Throwable {
	FileInputStream fis = new FileInputStream("./Data/commonDataSDET_2.Properties");
	Properties p = new Properties();
	p.load(fis);
	String value = p.getProperty(key, "please give correct key");
	return value;
		
	}

}
