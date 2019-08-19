package practice;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Exceltestdata {

	public static void main(String[] args) throws IOException {
		/*XSSFWorkbook Wbook = new XSSFWorkbook("./testcase/TestData.xlsx");
		XSSFSheet Wsheet= Wbook.getSheetAt(0);
		XSSFRow row = Wsheet.getRow(1);
		XSSFCell cell = row.getCell(0);
		String cellvalue = cell.getStringCellValue();
		System.out.println(cellvalue);
		int colcount = Wsheet.getRow(0).getLastCellNum();
		System.out.println(colcount);
		int rowcount = Wsheet.getLastRowNum();
		for (int j = 1;j<=rowcount;j++)
		{
			XSSFRow row1 = getRow(j);
		}
		for (int i = 0;i<colcount;i++)
		{
			XSSFCell cell1 = row.getCell(i);
		}
		 */
		XSSFWorkbook Wbook = new XSSFWorkbook("D:\\TestData.xlsx");
		XSSFSheet Wsheet= Wbook.getSheetAt(0);
		XSSFRow row = Wsheet.getRow(0);
		XSSFCell cell = row.getCell(0);
		System.out.println(cell.getStringCellValue());
		//cell.setCellValue("I am Thirunavukkarasu");
		//cell.setCellValue("10/06/2018");
		cell.setCellValue(58588.45455);
		System.out.println(cell);
		//System.out.println(Wsheet.getRow(0).getCell(0));	
	}
}
