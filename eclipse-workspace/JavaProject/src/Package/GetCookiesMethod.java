package Package;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;

public class GetCookiesMethod {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.apollopharmacy.in/");
		Thread.sleep(4000);
		driver.navigate().refresh();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
System.out.println(driver.manage().getCookies());

	}

}
