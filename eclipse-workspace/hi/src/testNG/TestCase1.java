package testNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
//@Parameters("Browser")
//
public class TestCase1 extends LaunchAndQuit {
	@Test
	public void LoginTo_Amazon() throws InterruptedException
	{driver= new ChromeDriver();
	driver.get("https://www.amazon.in/");
	  WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#nav-link-accountList-nav-line-1")));
  	element.click();
  	Thread.sleep(5000);
   	element.sendKeys("mahajangeeta123@gmail.com");
   	driver.findElement(By.cssSelector(".a-button-input")).click();
   WebElement Psw=	driver.findElement(By.cssSelector("#ap_password"));
   Psw.sendKeys("Welcome@2025");
   driver.findElement(By.cssSelector("#signInSubmit")).click();
	}
	//WebDriver driver;
   
	//	driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 	//Thread.sleep(3000);
       	//driver.get("https://www.amazon.in/");
       	//Thread.sleep(5000);
        /*  	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
       //	WebElement un=driver.findElement(By.cssSelector("#nav-link-accountList-nav-line-1"));
       	WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#nav-link-accountList-nav-line-1")));
       	element.click();
      	Thread.sleep(5000);
       	element.sendKeys("mahajangeeta123@gmail.com");
       	driver.findElement(By.cssSelector(".a-button-input")).click();
       WebElement Psw=	driver.findElement(By.cssSelector("#ap_password"));
       Psw.sendKeys("Welcome@2025");
       driver.findElement(By.cssSelector("#signInSubmit")).click();*/
       
    }

