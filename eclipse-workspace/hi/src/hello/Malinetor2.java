package hello;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Malinetor2 {
	 WebDriver driver;
	    WebDriverWait wait;
	    String testEmail = "testuser123@mailinator.com";
	    String mailinatorInbox = "testuser123";

	    @BeforeClass
	    public void setup() {
	     //   System.setProperty("webdriver.chrome.driver", "path/to/chromedriver"); // update path
	        driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	    }

	    @Test
	    public void testEmailSentAfterRegistration() {
	        // Step 1: Register on demo site
	        driver.get("https://demo.automationtesting.in/Register.html");  // demo registration form :contentReference[oaicite:1]{index=1}
	        driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Test");
	        driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("User");
	        driver.findElement(By.xpath("//textarea[@ng-model='Adress']")).sendKeys("123 Main St");
	        driver.findElement(By.xpath("//input[@ng-model='EmailAdress']")).sendKeys(testEmail);
	        driver.findElement(By.xpath("//input[@ng-model='Phone']")).sendKeys("1234567890");
	        driver.findElement(By.id("submitbtn")).click();

	        // Optionally wait for success — adjust locator if your app shows one
	        // wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("successMessage")));

	        // Step 2: Navigate to Mailinator
	        driver.get("https://www.mailinator.com");
	        WebElement searchBox = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("search")));
	        searchBox.clear();
	        searchBox.sendKeys(mailinatorInbox);
	        driver.findElement(By.id("go_inbox")).click();

	        // Step 3: Wait for incoming email
	        WebElement emailRow = wait.until(ExpectedConditions.visibilityOfElementLocated(
	                By.xpath("//td[contains(text(),'Welcome')]"))); // adjust subject keyword
	        emailRow.click();

	        // Step 4: Switch to iframe and verify email content
	        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("msg_body"));
	        String emailBody = driver.findElement(By.tagName("body")).getText();
	        Assert.assertTrue(emailBody.contains("Thank you for registering"),
	                "Expected confirmation text not found in email!");

	        // Go back to main page
	        driver.switchTo().defaultContent();
	    }

	    @AfterClass
	    public void teardown() {
	        if (driver != null) {
	            driver.quit();
	        }
	    }	
}
