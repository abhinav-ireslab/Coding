package Testing;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Writer {

	public static void main(String[] args) throws IOException {

		XSSFWorkbook Workbook = new XSSFWorkbook();
		XSSFSheet sheet = Workbook.createSheet("Sheet");
		XSSFRow row = sheet.createRow(0);
		XSSFCell cell = row.createCell(0);
		cell.setCellValue("Testoutput");

		FileOutputStream fout = new FileOutputStream("C:\\Users\\E2E\\Downloads\\Financials.xlsx");
		Workbook.write(fout);
		fout.close();
		//Workbook.close();

	}

}
