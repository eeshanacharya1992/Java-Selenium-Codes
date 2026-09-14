package Package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayedMethod {

	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		driver.get("file:///C:/Users/eesha/Downloads/learningHTML1%20(4).html");
		WebElement a= driver.findElement(By.id("1"));
		boolean username= a.isDisplayed();
		if(username== true)
		{
			a.sendKeys("Akp");
		}

	}

}
