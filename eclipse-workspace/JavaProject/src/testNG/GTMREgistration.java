package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GTMREgistration {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/registration/");
	WebElement s1=	driver.findElement(By.name("fname"));
//	s1.sendKeys("eeshan");
//	s1.sendKeys(Keys.SHIFT);
	 Actions actions = new Actions(driver);
     actions.keyDown(Keys.SHIFT).sendKeys(s1, "EESHAN").keyUp(Keys.SHIFT).perform();

	}

}
