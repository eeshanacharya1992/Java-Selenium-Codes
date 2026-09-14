package testNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import org.testng.annotations.Parameters;
//import com.beust.jcommander.Parameter;


 

 public class LaunchAndQuit {
	WebDriver driver;
	public static WebDriverWait wait;
	//@BeforeMethod()
	@Parameters("Browser")
	 public void LoginToAmazon(String browserName) throws InterruptedException
	    {
	    	
	    	//System.setProperty("webdriver.chrome.driver", "D:\\Mohan-Study\\chromedriver-win64\\chromedriver.exe");
			 if(browserName.equals("chrome"))
			 {
	    	    driver = new ChromeDriver();
			 }  
			 if(browserName.equals("firefox"))
				{
					driver= new FirefoxDriver();
				}
				if(browserName.equals("edge"))
				{
					driver= new EdgeDriver();
				}	
	//System.setProperty("webdriver.chrome.driver", "D:\\Mohan-Study\\chromedriver-win64\\chromedriver.exe");
	    }
  
  
 @AfterMethod() 
  public void Close_Browser()
  {
	  
  }
}
