package testcase;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ReadExcel {

	public static Object[][] getExcelData(String fileName) throws IOException {
		// TODO Auto-generated method stub
		XSSFWorkbook wbook = new XSSFWorkbook("./data/"+fileName+".xlsx");
		XSSFSheet sheet = wbook.getSheetAt(0);
		int rowCount = sheet.getLastRowNum();
		System.out.println("Row count "+rowCount);
		int colCount = sheet.getRow(0).getLastCellNum();
		System.out.println("Column count "+colCount);
		Object [][] data = new Object[rowCount][colCount];
		for(int j=1; j<=rowCount;j++) {
			XSSFRow row = sheet.getRow(j);	
			for(int i=0; i<colCount; i++)
			{
				XSSFCell cell = row.getCell(i);
				data[j-1][i]  = cell.getStringCellValue();

			}
		}
		return data;

	}
}
