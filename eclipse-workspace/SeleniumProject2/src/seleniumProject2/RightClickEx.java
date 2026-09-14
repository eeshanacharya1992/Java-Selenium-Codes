package seleniumProject2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickEx {

	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
       driver.manage().window().maximize();
       WebElement rightclick= driver.findElement(By.xpath("(//a[@href='https://www.hyrtutorials.com/p/contactus.html'])[2]"));
       Actions a1= new Actions(driver);
       a1.contextClick(rightclick).perform();
	}

}
