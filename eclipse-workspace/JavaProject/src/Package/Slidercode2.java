package Package;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slidercode2 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.findElement(By.name("q")).sendKeys("sofa"+Keys.ENTER);
	Thread.sleep(2000);
WebElement slider=	driver.findElement(By.xpath("//div[@class='iToJ4v Kaqq1s']//div[@class='PYKUdo']"));
WebElement leftslider=driver.findElement(By.xpath("//div[@class='iToJ4v D0puJn']//div[@class='PYKUdo']"));
Thread.sleep(2000);
Actions action =new Actions(driver);
action.dragAndDropBy(slider, 50, 0).perform();
Thread.sleep(1000);
action.dragAndDropBy(leftslider, -40, 0).perform();
	}

}
