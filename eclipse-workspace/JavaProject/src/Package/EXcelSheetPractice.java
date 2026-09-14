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

public class EXcelSheetPractice {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream f1= new FileInputStream("");
		Workbook wi= WorkbookFactory.create(f1);
		Sheet s1= wi.getSheet("");
		Row r1= s1.getRow(1);
		Cell c1= r1.getCell(0);
		String cc= c1.getStringCellValue();
		String dd=NumberToTextConverter.toText(s1.getRow(1).getCell(2).getNumericCellValue());
	}

}
