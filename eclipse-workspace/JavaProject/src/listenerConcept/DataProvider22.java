package listenerConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider22 {
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
	ChromeDriver c1= new ChromeDriver();
	c1.get("https://www.facebook.com/");
	c1.manage().window().maximize();
	c1.findElement(By.name("email")).sendKeys(username);
	c1.findElement(By.name("pass")).sendKeys(password);
	c1.findElement(By.name("login")).click();
}
}
