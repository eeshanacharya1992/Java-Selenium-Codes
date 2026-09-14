package Package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class InputWithoutSendKeysEx3 {
  public static WebDriver driver;
  @Parameters("browser")
  public static void browsertest(String browserName)
  {
	  if(browserName.equalsIgnoreCase("chrome"))
	  {
		  driver= new ChromeDriver();
	  }
	  if(browserName.equalsIgnoreCase("firefox"))
	  {
		  driver= new FirefoxDriver();
	  }
	  if(browserName.equalsIgnoreCase("edge"))
	  {
		  driver= new EdgeDriver();
	  }
	  
  }
	@Test
	public static void add(){
	// driver= new ChromeDriver();
		driver.get("file:///C:/Users/eesha/Downloads/learningHTML1%20(5).html");
	    driver.manage().window().maximize();
	    WebElement e1=	driver.findElement(By.name("username"));
	    Actions a1= new Actions(driver);
		a1.sendKeys(e1, "Ramesh").build().perform();
	//	a1.sendKeys(e1, "Ramesh").perform();
	}

}
