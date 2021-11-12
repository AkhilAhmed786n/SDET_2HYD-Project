package vtigerUtilPack;

import java.io.FileReader;
import java.util.HashMap;

import org.json.simple.parser.JSONParser;

public class JsonFileUtility {
	public String jsonfileutility(String key) throws Throwable {
		FileReader fir = new FileReader("./Data/commonData.json");
		JSONParser jp = new JSONParser();
		Object jObj = jp.parse(fir);
		HashMap obj=(HashMap) jObj;
		Object value = obj.get(key);
		return (String) value;
		
	}


}
