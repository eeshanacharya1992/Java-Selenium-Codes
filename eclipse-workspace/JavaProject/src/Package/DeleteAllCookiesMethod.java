package Package;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteAllCookiesMethod {

	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.apollopharmacy.in/");
		//driver.navigate().refresh();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
System.out.println(driver.manage().getCookies());
driver.manage().deleteAllCookies();
System.out.println(driver.manage().getCookies());

	}

}
