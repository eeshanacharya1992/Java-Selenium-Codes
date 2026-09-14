package Package;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BackgroundColor1 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebElement logo=	driver.findElement(By.linkText("Sign in"));
	String color=logo.getCssValue("color");
	
	System.out.println(" text background colour of logo " + color);
	String backgroundcolor=logo.getCssValue("background-color");
	System.out.println("element background colour of logo " + backgroundcolor);

	}

}
