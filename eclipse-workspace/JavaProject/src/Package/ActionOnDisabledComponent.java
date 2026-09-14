package Package;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActionOnDisabledComponent {

	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		driver.get("file:///C:/Users/eesha/Downloads/learningHTML1%20(5).html");
	    driver.manage().window().maximize();
	    JavascriptExecutor js= driver;
	    WebElement e1=	driver.findElement(By.id("121"));
	    js.executeScript("arguments[0].removeAttribute('disabled')", e1);
	    e1.sendKeys("Rout");
	}

}
