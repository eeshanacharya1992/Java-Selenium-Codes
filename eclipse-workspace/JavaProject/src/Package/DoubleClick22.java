package Package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick22 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Thread.sleep(4000);
		driver.navigate().refresh();
		WebElement sell= driver.findElement(By.linkText("Sell"));
		Actions a1= new Actions(driver);
		a1.doubleClick(sell).perform();
	}

}
