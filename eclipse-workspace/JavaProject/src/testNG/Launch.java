package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class Launch {
  WebDriver driver;
	@BeforeTest
	public void Before()
	{
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");

	   
   }
}
