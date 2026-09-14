package Package;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class AutosuggestionusingRobotClass {

	public static void main(String[] args) throws InterruptedException, AWTException {
		EdgeDriver driver= new EdgeDriver();
		driver.get("https://www.amazon.in/");
		Thread.sleep(3000);
		driver.navigate().refresh();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("shoes");
    Thread.sleep(3000);
    List<WebElement> auto= driver.findElements(By.xpath("//div[@class='two-pane-results-container']/div[1]/div"));
   int count= auto.size();
   System.out.println(count);
   Robot sa= new Robot();
   
   sa.keyPress(KeyEvent.VK_DOWN);
   Thread.sleep(4000);
   sa.keyPress(KeyEvent.VK_DOWN);
 //  sa.keyPress(KeyEvent.VK_ENTER);
 //  sa.keyPress(KeyEvent.VK_WINDOWS) ;
 //  sa.keyPress(KeyEvent.VK_PRINTSCREEN);
	}

}
