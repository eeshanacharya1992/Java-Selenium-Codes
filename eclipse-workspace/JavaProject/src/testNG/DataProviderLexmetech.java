package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderLexmetech {
	@DataProvider(name="Different datas")
	public Object testdata()
	{
		Object data[][]= new Object[3][2];
		data[0][0]="Ram";
		data[0][1]="51";
		data[1][0]="Sita";
		data[1][1]="39";
		data[2][0]="Harry";
		data[2][1]="34";
		//data[2][2]="Sam";
		return data;
	}
	@Test(dataProvider="Different datas")
	public void testcase(String username, String password)
	{
	
	ChromeDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://lexmetech.com/");
	driver.findElement(By.linkText("Login")).click();
	driver.findElement(By.name("username")).sendKeys(username);
	driver.findElement(By.name("password")).sendKeys(password);
	driver.findElement(By.xpath("//button[.='Login']")).click();
}}
