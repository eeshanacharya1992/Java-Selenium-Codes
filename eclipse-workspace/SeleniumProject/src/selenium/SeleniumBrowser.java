package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumBrowser {

	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
	//	driver.get("https://www.selenium.dev/");
		driver.get("https://www.amazon.in/");
		driver.navigate().refresh();
		System.out.println(driver.getTitle());
      //  WebDriver driver= new ChromeDriver();
	//	FirefoxDriver driver= new FirefoxDriver();
		driver.close();
	}

}
