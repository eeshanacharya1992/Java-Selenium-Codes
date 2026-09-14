package Package;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitTitleIs {

	public static void main(String[] args) throws AWTException, InterruptedException {
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(40));
      //  wait.until(ExpectedConditions.titleContains("You"));
		//wait.until(ExpectedConditions.titleIs("You"));
		//wait.until(ExpectedConditions.urlToBe("https://www.google.com/"));
	//	wait.until(ExpectedConditions.urlContains("c"));
		//wait.until(ExpectedConditions.alertIsPresent());
		//driver.switchTo().alert().accept();
		 WebElement s1= driver.findElement(By.name("q"));
	        s1.sendKeys("India");
	       s1.sendKeys(Keys.ENTER);
	      Thread.sleep(10000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[.='India']"))).click();
      /*  WebElement s1= driver.findElement(By.name("q"));
        s1.sendKeys("India");
       s1.sendKeys(Keys.ENTER);*/
	
	}

}
