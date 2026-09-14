package Package;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMover {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Thread.sleep(4000);
		driver.navigate().refresh();
		WebElement sell= driver.findElement(By.linkText("Sell"));
		Point xy= sell.getLocation();
		int x= xy.getX();
		int y= xy.getY();
		Actions a1= new Actions(driver);
		a1.moveByOffset(x, y).perform();
		//a1.moveByOffset(x, y).click().perform();
	}

}
