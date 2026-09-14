package Package;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InputWithoutSendKeysEx1 {

	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		driver.get("file:///C:/Users/eesha/Downloads/learningHTML1%20(5).html");
	WebElement e1=	driver.findElement(By.name("username"));
	JavascriptExecutor js= driver;
	js.executeScript("arguments[0].value='Harry'",e1);

	}

}
