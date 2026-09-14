package Package;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptPopup {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
	//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebElement click=	driver.findElement(By.xpath("(//button[@class='btn btn-primary'])[1]"));
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("arguments[0].click();", click);
		Thread.sleep(4000);
	//	driver.switchTo().alert().accept();
		driver.findElement(By.xpath("(//button[.='Click me'])[2]")).click();
		//driver.findElement(By.id("c_bs_1")).click();
	//	WebElement submit=driver.findElement(By.name("Submit"));
	//	js.executeScript("arguments[0].click();", submit);
	}

}
