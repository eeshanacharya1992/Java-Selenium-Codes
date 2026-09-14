package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
//import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Browsering {
WebDriver driver;
@Test
@Parameters("Browser")
public void browsertesting(String nameOfBrowser)
{
	if(nameOfBrowser.equals("chrome"))
	{
		driver= new ChromeDriver();
	}
	if(nameOfBrowser.equals("firefox"))
	{
		driver= new FirefoxDriver();
	}
	if(nameOfBrowser.equals("edge"))
	{
		driver= new EdgeDriver();
	}
	driver.get("https://www.google.com/");
}
}
