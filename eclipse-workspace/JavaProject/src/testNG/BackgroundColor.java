package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BackgroundColor {

	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
	//	driver.findElement(By.name("email")).sendKeys("ramesh@gmail.com");
	//	driver.findElement(By.name("pass")).sendKeys("pass");
		WebElement loginbutton= driver.findElement(By.linkText("Sign in"));
		//String color=loginbutton.getCssValue("color");
		String color=loginbutton.getCssValue("background-color");
		System.out.println(color);

	}

}
