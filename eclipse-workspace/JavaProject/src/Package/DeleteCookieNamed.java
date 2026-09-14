package Package;

import java.time.Duration;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteCookieNamed {

	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.apollopharmacy.in/");
		driver.navigate().refresh();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
Cookie c1= new Cookie("age","91");
		driver.manage().addCookie(c1);
		System.out.println(driver.manage().getCookies());
		driver.manage().deleteCookieNamed("age");
		System.out.println(driver.manage().getCookies());

	}

}
