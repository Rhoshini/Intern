package testcase.testng;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WorkingBooks {

	public  String[][] excelData(String fileName) throws IOException {
		
		XSSFWorkbook wb = new XSSFWorkbook("./excelData/"+fileName+".xlsx");
		XSSFSheet sheet = wb.getSheet("sheet1");
		
		int rowcount = sheet.getLastRowNum();
		short lastCellNum = sheet.getRow(0).getLastCellNum();
		String[][]data = new String[rowcount][lastCellNum];
		
		for (int i = 1; i <= rowcount; i++) {
			for (int j = 0; j < lastCellNum; j++) {
				String stringCellValue = sheet.getRow(i).getCell(j).getStringCellValue();
				System.out.println(stringCellValue);
				data[i-1][j]= stringCellValue;
				
				
			}
			
		}

		wb.close();
		return data;
		
		
	}

}
