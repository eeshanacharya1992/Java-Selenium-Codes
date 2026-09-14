package Package;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SliderCode {

	public static void main(String[] args) throws InterruptedException {
	      WebDriver driver = new ChromeDriver();
	        driver.get("https://www.amazon.in/");
	        driver.navigate().refresh();
	        driver.navigate().refresh();
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	        // Search for "sofa"
	        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("sofa", Keys.ENTER);
	        Thread.sleep(2000);
	        // Locate the slider element (Lower Bound slider)
	        WebElement slider = driver.findElement(By.xpath("//input[contains(@id, 'lower-bound-slider')]"));
	        // Setting the slider value to 15000 using JavascriptExecutor
	        ((JavascriptExecutor) driver).executeScript("arguments[0].value = '15000'; arguments[0].dispatchEvent(new Event('change'));", slider);
	        Thread.sleep(1000);
	        // Create Actions object
	        Actions actions = new Actions(driver);
	        // Sliding Right (increase value)
	        actions.clickAndHold(slider).moveByOffset(30, 0).release().perform();
	        Thread.sleep(2000);
	        // Sliding Left (decrease value) with direct JavaScript manipulation
	        ((JavascriptExecutor) driver).executeScript("arguments[0].value = '10000'; arguments[0].dispatchEvent(new Event('change'));", slider);
	        Thread.sleep(2000);
	        // Alternatively, sliding left using moveByOffset (if the JavaScript solution doesn't work)
	        actions.clickAndHold(slider).moveByOffset(-30, 0).release().perform();
	        Thread.sleep(2000);
	        // Close the browser
	       // driver.quit();
	}

}
