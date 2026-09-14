package Package;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadowRoot {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.airindia.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//locate accept all locator
		WebElement acceptALL= driver.findElement(By.id("onetrust-accept-btn-handler"));
		acceptALL.click();
		
		//	copy js path of one way put in notepad- replace " with ' and store that js path in one string with return keyword
		String onewayJSPath = "return document.querySelector('#ai-booking-widget > ai-tab-group > ai-tab:nth-child(1) > ai-search-flight > slot-fb > div.ai-search-flight-wrapper > div.ai-search-trip > div > div.ai-search-trip-type > ai-radio-group').shadowRoot.querySelector('#radio0')";
		
		//use javascript executor to locate that element and click on one way
		//direct locator of one way is not possible bcoz it was stored in #shadow root tag
		//therefore we have use indirect way js path
        
//JavascriptExecutor js = (JavascriptExecutor) driver;
 //   WebElement ws =   (WebElement)    js.executeScript(onewayJSPath);
WebElement ws =      (WebElement) driver.executeScript(onewayJSPath);
ws.click();
//driver.close();

	}

}
