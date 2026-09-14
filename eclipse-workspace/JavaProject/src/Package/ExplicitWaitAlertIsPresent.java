package Package;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitAlertIsPresent {

	public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver= new ChromeDriver();
	driver.get("https://the-internet.herokuapp.com/javascript_alerts");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//button[.='Click for JS Confirm']")).click();
	Thread.sleep(3000);
	WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(10));
	wait.until(ExpectedConditions.alertIsPresent());
	driver.switchTo().alert().accept();
	}

}
