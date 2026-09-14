package Package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HoverOver {

	public static void main(String[] args) {
		ChromeDriver c1= new ChromeDriver();
		c1.get("https://www.amazon.in");
		c1.manage().window().maximize();
		WebElement signin= c1.findElement(By.xpath("//span[.='Hello, sign in']"));
        Actions a1= new Actions(c1);
        a1.moveToElement(signin).perform();
	}

}
