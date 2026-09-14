package Package;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InputJavaScriptThroughGoogleSearch {

	public static void main(String[] args) throws AWTException {
		ChromeDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.google.com/");
    //    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement s1= driver.findElement(By.name("q"));
        JavascriptExecutor js= driver;
    	js.executeScript("arguments[0].value='India'",s1);
    	Robot e2= new Robot();
		e2.keyPress(KeyEvent.VK_ENTER);
	}

}
