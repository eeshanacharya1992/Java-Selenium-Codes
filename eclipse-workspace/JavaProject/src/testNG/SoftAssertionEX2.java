package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

public class SoftAssertionEX2 {

	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("https://www.amazon.in");
	        Thread.sleep(6000);
			 driver.navigate().refresh();
	        // SoftAssert declaration
	        SoftAssert softAssert = new SoftAssert();

	        // Check if title contains "Amazon"
	        String title = driver.getTitle();
	        softAssert.assertTrue(title.contains("Amazon"), " Title does not contain 'Amazon'");

	        // Check if search box is displayed
	        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
	        softAssert.assertTrue(searchBox.isDisplayed(), " Search box not displayed");

	        // Perform search
	        searchBox.sendKeys("shoes");
	        driver.findElement(By.id("nav-search-submit-button")).click();

	        Thread.sleep(3000); // Wait for search results to load

	        // Check if results page contains "shoes"
	        String pageText = driver.getPageSource();
	        softAssert.assertTrue(pageText.toLowerCase().contains("shoes"), " 'shoes' not found in search results");

	        // Final assertion
	        softAssert.assertAll(); // Will report all failures

	}

}
