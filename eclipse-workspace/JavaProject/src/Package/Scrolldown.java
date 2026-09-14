package Package;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolldown {

	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement facebook=driver.findElement(By.linkText("Facebook"));
		Point xandy=facebook.getLocation();
		int x=xandy.getX();
		int y= xandy.getY();
		System.out.println(x);
		System.out.println(y);
		JavascriptExecutor j1= driver;
		j1.executeScript("window.scrollBy(0,"+y+")");

	}

}
