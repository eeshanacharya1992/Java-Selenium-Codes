package Package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickEx {

	public static void main(String[] args) {
		ChromeDriver c1= new ChromeDriver();
		c1.get("https://www.amazon.in");
		c1.manage().window().maximize();
		c1.navigate().refresh();
		WebElement d1= c1.findElement(By.partialLinkText("Mob"));
		Actions a1= new Actions(c1);
		a1.doubleClick(d1).perform();
		

	}

}
