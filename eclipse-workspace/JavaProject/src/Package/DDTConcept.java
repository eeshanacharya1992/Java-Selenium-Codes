package Package;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;

public class DDTConcept {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream f1= new FileInputStream("C:\\Users\\eesha\\eclipse-workspace\\JavaProject\\ExcelSheet\\EeshanSheet.xlsx");
Workbook w1= WorkbookFactory.create(f1);
Sheet s1= w1.getSheet("Login");
//Row r1= s1.getRow(0);
//Row r1= s1.getRow(1);
//Cell c1= r1.getCell(0);
//Cell c1= r1.getCell(1);
//String Value=c1.getStringCellValue();
String Value=NumberToTextConverter.toText(s1.getRow(1).getCell(0).getNumericCellValue());
System.out.println(Value);
	}

}
