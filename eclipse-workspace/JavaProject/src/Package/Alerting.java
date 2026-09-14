package Package;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alerting {

	public static void main(String[] args) throws InterruptedException {
		FirefoxDriver driver= new FirefoxDriver();

		// driver.get("https://www.leafground.com/alert.xhtml");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://the-internet.herokuapp.com/");

		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// WebElement alert=driver.findElement(By.id("j_idt88:j_idt104"));

		// alert.click();

	

		WebElement auth= driver.findElement(By.linkText("Basic Auth"));

		auth.click();

		//driver.findElement(By.id("j_idt88:j_idt104")).click();

		Alert promptalert= driver.switchTo().alert();

	 Thread.sleep(6000);

		promptalert.sendKeys("admin");

		// promptalert.sendKeys("admin");

		// Thread.sleep(3000);

		promptalert.accept();

		

	

	}

}
