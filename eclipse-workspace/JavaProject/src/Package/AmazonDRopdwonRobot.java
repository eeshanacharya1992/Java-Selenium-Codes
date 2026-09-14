package Package;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;//nav-left
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonDRopdwonRobot {

	public static void main(String[] args) throws AWTException, InterruptedException {
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Thread.sleep(4000);
		driver.navigate().refresh();
WebElement s2= driver.findElement(By.xpath("//div[@class='nav-search-scope nav-sprite']"));
		s2.click();
		Thread.sleep(3000);
        Robot ws= new Robot();
        ws.keyPress(KeyEvent.VK_DOWN);
        ws.keyPress(KeyEvent.VK_ENTER);
	}

}
