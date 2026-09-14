package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class TestBrowser {

	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://lexmetech.com/");
		driver.manage().window().maximize(); // Get A Quote
		WebElement quote= driver.findElement(By.linkText("Get A Quote"));
		//String color=loginbutton.getCssValue("color");
		String color=quote.getCssValue("background-color");
		System.out.println(color);

	}

}
