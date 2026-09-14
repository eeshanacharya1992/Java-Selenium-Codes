package Package;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider3 {

	public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver = new ChromeDriver();
	   driver.get("https://www.amazon.in/");
       driver.navigate().refresh();
       driver.navigate().refresh();
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
       // Search for "sofa"
       driver.findElement(By.id("twotabsearchtextbox")).sendKeys("sofa", Keys.ENTER);
	 // Locate the slider handles
    WebElement leftSlider = driver.findElement(By.xpath("(//input[@class='s-range-input'])[1]"));
    WebElement rightSlider = driver.findElement(By.xpath("(//input[@class='s-range-input'])[2]"));

    // Move the sliders
    Actions move = new Actions(driver);

    // Move left slider to right by 50 pixels
    move.dragAndDropBy(leftSlider, 50, 0).build().perform();
    Thread.sleep(2000);

    // Move right slider to left by 50 pixels
    move.dragAndDropBy(rightSlider, -50, 0).build().perform();
    Thread.sleep(3000);

	}

}
