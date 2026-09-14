package hello;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Malinetor {
public static void main(String[] args) {
	
	ChromeDriver driver= new ChromeDriver();
	driver.findElement(By.id("email")).sendKeys("testuser123@mailinator.com");
	// fill rest of the registration fields and submit...

	// Step 2: Go to Mailinator and check inbox
	driver.get("https://www.mailinator.com");
	driver.findElement(By.id("search")).sendKeys("testuser123");
	driver.findElement(By.id("go_inbox")).click();

	// Step 3: Wait and open the latest email
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//td[contains(text(),'Welcome')]"))).click();

	// Step 4: Validate content
	String emailBody = driver.findElement(By.id("msg_body")).getText();
	Assert.assertTrue(emailBody.contains("Thank you for registering"));
}
}
