package testNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragDrop {
    @Test
    public void dragdrop()
    {
    	ChromeDriver driver= new ChromeDriver();
    	driver.get("https://grotechminds.com/registration/");
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    	driver.manage().window().maximize();
    	WebElement drag= driver.findElement(By.xpath("(//div[@id='div1'])[1]"));
    	WebElement drop=driver.findElement(By.id("div2"));
    	Actions a1= new Actions(driver);
    	a1.dragAndDrop(drag, drop).perform();
    }
}
