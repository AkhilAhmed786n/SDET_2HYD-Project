package practicePack;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class HighestSalaryfrmExcel {
	
	@Test
	
	public void highestSalaryFromExcel() throws Throwable
	{
		FileInputStream fis=new FileInputStream("./Data/TestData.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		
		int lastrow = wb.getSheet("Sheet2").getLastRowNum();
		
		for (int i =1; i <=lastrow; i++) 
		{
			double salarycol = wb.getSheet("Sheet2").getRow(i).getCell(4).getNumericCellValue();
			String studentscol = wb.getSheet("Sheet2").getRow(i).getCell(1).getStringCellValue();
			String subjectcol = wb.getSheet("Sheet2").getRow(i).getCell(2).getStringCellValue();
			
		
			if(salarycol>15000)
			{
				System.out.println(studentscol+" "+subjectcol+" "+salarycol);
			}
			
			
		}
		
		
		
	}

}
