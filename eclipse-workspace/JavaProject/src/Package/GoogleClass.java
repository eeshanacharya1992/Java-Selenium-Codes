package Package;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleClass {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();

		driver.get(" https://www.example.com");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.id("dynamic element")).click();

	}

}
