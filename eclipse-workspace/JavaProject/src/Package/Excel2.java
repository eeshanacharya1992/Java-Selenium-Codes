package Package;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel2 {

	public static void main(String[] args) {
		//create a workbook .xlxs
				XSSFWorkbook workbook=new XSSFWorkbook();
				//create sheet workbook created at line no 9
				XSSFSheet	sheet1=workbook.createSheet("First Sheet");
				//create  row in the sheet created at line12
				XSSFRow row1=	sheet1.createRow(0);
				XSSFRow row2=	sheet1.createRow(1);
				//create first cell in row1
				XSSFCell cell1=row1.createCell(0);
				XSSFCell cell2=row1.createCell(1);
				XSSFCell cell3=row1.createCell(2);
				XSSFCell cell4=row2.createCell(0);
				XSSFCell cell5=row2.createCell(1);
				XSSFCell cell6=row2.createCell(2);
				//insert values in each cell created
				cell1.setCellValue("Name");
				cell2.setCellValue("Email");
				cell3.setCellValue("Mobile Number");
				cell4.setCellValue("abc");
				cell5.setCellValue("abc@gmail.com");
				cell6.setCellValue("123456789");
				
		File f=new File("C:\\Users\\eesha\\eclipse-workspace\\JavaProject\\ExcelSheet\\EeshanSheet2.xlsx");
		FileOutputStream fo=null;
		try {
			fo=new FileOutputStream(f);//now the file will be created at the location mentioned in line 31
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			workbook.write(fo);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			fo.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
