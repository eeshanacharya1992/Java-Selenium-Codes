package Package;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ExcelSheetAmazon {
   public static  String username;
   public static String password;
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		FileInputStream f1= new FileInputStream("C:\\Users\\eesha\\eclipse-workspace\\JavaProject\\ExcelSheet\\EeshanSheet.xlsx");
		Workbook w1= WorkbookFactory.create(f1);
		Sheet s1= w1.getSheet("Login");
		//Row r1= s1.getRow(0);
		//Row r1= s1.getRow(1);
		//Cell c1= r1.getCell(0);
		//Cell c1= r1.getCell(1);
		//String Value=c1.getStringCellValue();
	username=NumberToTextConverter.toText(s1.getRow(1).getCell(0).getNumericCellValue());
		System.out.println(username);
	password=NumberToTextConverter.toText(s1.getRow(1).getCell(0).getNumericCellValue());	
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Thread.sleep(3000);
		driver.navigate().refresh();
		WebElement signin= driver.findElement(By.xpath("//span[.='Hello, sign in']"));
		Actions a1= new Actions(driver);
		a1.moveToElement(signin).perform();
		driver.findElement(By.xpath("//span[.='Sign in']")).click();
		driver.findElement(By.name("email")).sendKeys(username);
		driver.findElement(By.xpath("//input[@class='a-button-input']")).click();

	}

}
