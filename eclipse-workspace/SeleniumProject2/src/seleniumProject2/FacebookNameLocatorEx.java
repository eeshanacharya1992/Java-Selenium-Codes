package seleniumProject2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookNameLocatorEx {

	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/login.php");
		driver.findElement(By.name("email")).sendKeys("Harry");

	}

}
