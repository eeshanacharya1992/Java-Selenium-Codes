package Package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOver {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
		WebElement aq= driver.findElement(By.xpath("//span[.='Hello, sign in']"));
        Actions a1= new Actions(driver);
        a1.moveToElement(aq).perform();
        Thread.sleep(4000);
        WebElement Signin= driver.findElement(By.xpath("//span[.='Sign in']"));
        Signin.click();
	}

}
