package Package;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Tagname {

	public static void main(String[] args) {
		 ChromeDriver driver = new ChromeDriver();


	            driver.get("https://google.com");
	       //     WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	            WebElement element = driver.findElement(By.id("elementId"));
	            element.click();  // Attempt to click the element


	}

}
