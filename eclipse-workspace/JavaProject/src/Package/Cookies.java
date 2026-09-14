package Package;
import java.time.Duration;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.chrome.ChromeDriver;
public class Cookies {
	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.hcltech.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		System.out.println(driver.manage().getCookies());
		driver.manage().deleteAllCookies();
		driver.manage().addCookie(new Cookie("Rome","91"));
		System.out.println(driver.manage().getCookies());
		System.out.println(driver.manage().getCookieNamed("Rome"));
		driver.manage().deleteCookieNamed("Rome");
	}

}
