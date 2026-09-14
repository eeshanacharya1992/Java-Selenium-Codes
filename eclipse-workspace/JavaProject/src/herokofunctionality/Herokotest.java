package herokofunctionality;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Herokotest {
    @Test
	public  void message() {
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://the-internet.herokuapp.com/login");
       driver.findElement(By.name("username")).sendKeys("tomsmith");
       driver.findElement(By.name("password")).sendKeys("SuperSecretPassword!");
       driver.findElement(By.xpath("//button[@class='radius']")).click();
	WebElement message= driver.findElement(By.xpath("//div[@class='flash error']"));
	boolean text=message.isDisplayed();
	Assert.assertEquals(text, true);
	
	}

}
