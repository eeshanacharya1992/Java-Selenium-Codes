package Package;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream f1= new FileInputStream("C:\\Users\\eesha\\eclipse-workspace\\JavaProject\\ExcelSheet\\EeshanSheet.xlsx");

		// Workbook w1= WorkbookFactory.create(f1);

		Workbook w1= WorkbookFactory.create(f1);

		Sheet s1= w1.getSheet("Login");

		Row r1= s1.getRow(0);

		Cell c1= r1.getCell(0);

		String Value=c1.getStringCellValue();

		System.out.println(Value);
	}

}
