package Package;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FluentWaitClass {

	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		 WebElement s1= driver.findElement(By.name("q"));
		   FluentWait<ChromeDriver> f1=new FluentWait<ChromeDriver>(driver).withTimeout(Duration.ofSeconds(10)).pollingEvery(Duration.ofSeconds(1)).ignoring(NullPointerException.class);
	        f1.until(ExpectedConditions.titleContains("Goo"));
	
	s1.sendKeys("bangalore");
	}

}
