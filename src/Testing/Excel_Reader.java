package Testing;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Reader {

	public static void main(String[] args) throws IOException {

		FileInputStream fip = new FileInputStream("C:\\Users\\E2E\\Downloads\\Financial Sample.xlsx");
		XSSFWorkbook WB = new XSSFWorkbook(fip); 
		XSSFSheet sheet = WB.getSheetAt(0);
		XSSFRow row = sheet.getRow(0);
		XSSFCell cell = row.getCell(0);
		
		
		System.out.println(sheet.getRow(0).getCell(0));

	}

}
