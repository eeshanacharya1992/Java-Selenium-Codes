package Package;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptPopupHandlingwithoutpopup {

	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.switchTo().alert().accept();
		driver.findElement(By.name("q")).sendKeys("India"+Keys.ENTER);
	//	driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		

	}

}
