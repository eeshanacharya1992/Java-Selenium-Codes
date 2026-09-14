package Package;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CloseMethodEx {

	public static void main(String[] args) throws AWTException, InterruptedException {
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Thread.sleep(4000);
		driver.navigate().refresh();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Shoes"+Keys.ENTER);
		driver.findElement(By.xpath("(//a[@class='a-link-normal s-no-hover s-underline-text s-underline-link-text s-link-style a-text-normal'])[4]")).click();
      WebElement sell=  driver.findElement(By.linkText("Sell"));
        Actions a1= new Actions(driver);
        a1.contextClick(sell).perform();
        Robot sw= new Robot();
        sw.keyPress(KeyEvent.VK_DOWN);
        Thread.sleep(3000);
        sw.keyPress(KeyEvent.VK_ENTER);
        driver.quit();
	}

}
