package testNG;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class BrowserAutomation {
  WebDriver driver;
  @Parameters("Browser")
  @Test
  public void browsering( String nameofBrowser)
  {
	  if(nameofBrowser.equals("chrome"))
	  {
		  driver= new ChromeDriver();
	  }
	  if(nameofBrowser.equals("firefox"))
	  {
		  driver= new FirefoxDriver();
	  }
	  
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://lexmetech.com/");
  }
}
