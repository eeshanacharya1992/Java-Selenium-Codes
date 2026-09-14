package testNG;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PurchaseLexmetech {
     public static String username;
     public static String pwd;
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		
		FileInputStream fs = new FileInputStream("C:\\Users\\eesha\\eclipse-workspace\\JavaProject\\ExcelSheet\\KamalaExcelSheet.xlsx");
		Workbook wb = WorkbookFactory.create(fs);
		 username = wb.getSheet("Login").getRow(0).getCell(0).getStringCellValue();
	//	String mobile= NumberToTextConverter.toText(wb.getSheet("login").getRow(2).getCell(0).getNumericCellValue());
	 pwd = wb.getSheet("Login").getRow(0).getCell(1).getStringCellValue();
		//System.out.println(username);
		//System.out.println(mobile);
		//System.out.println(pwd);
	 ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://lexmetech.com/");
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(pwd);
		driver.findElement(By.xpath("//button[.='Login']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[.='Dashboard']")).click();
		driver.findElement(By.linkText("Packages Orders")).click();
		WebElement a= driver.findElement(By.xpath("//div[@class='alert alert-warning']"));
		boolean username= a.isDisplayed();
		if(username== true)
		{
			System.out.println(a.getText()+" Is getting displayed");
		}
	}

}
