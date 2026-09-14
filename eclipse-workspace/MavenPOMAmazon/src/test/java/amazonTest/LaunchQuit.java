package amazonTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class LaunchQuit {
  WebDriver driver;
  
  @BeforeMethod
  public void launch() throws InterruptedException
  {
	  driver= new EdgeDriver();
	  driver.get("https://www.amazon.in/");
	  Thread.sleep(4000);
	  driver.navigate().refresh();
	  driver.manage().window().maximize();
  }
  @AfterMethod
  public void quit() throws InterruptedException
  {
	  Thread.sleep(4000);
	  driver.quit();
  }
}
