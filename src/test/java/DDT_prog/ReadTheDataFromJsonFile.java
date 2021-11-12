package DDT_prog;
import java.io.FileReader;
import java.util.HashMap;

import org.json.simple.parser.JSONParser;
import org.testng.annotations.Test;

public class ReadTheDataFromJsonFile {
	@Test
	public void readTheDataFromJsonFile() throws Throwable {
		
//		CONVERT THE JSON FILE INTO JSON OBJECT
		FileReader fr=new FileReader("./Data/commonData.json");
		
//		CONVERT JSON OBJECT INTO JAVA OBJECT
		JSONParser jp=new JSONParser();		
		Object jObj = jp.parse(fr);
		
//		READ THE DATA USING HASHMAP
		HashMap obj= (HashMap) jObj;
		Object value = obj.get("url");
		System.out.println(value);
	}

	
}
