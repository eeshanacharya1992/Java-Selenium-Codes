package Package;

import java.time.Duration;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCookieNamed {

	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
Cookie c1= new Cookie("Fruit","Mango");
		driver.manage().addCookie(c1);
		System.out.println(driver.manage().getCookies());
		System.out.println(driver.manage().getCookieNamed("Fruit"));
	//	System.out.println(driver.manage().getCookieNamed("expires"));
		

	}

}
