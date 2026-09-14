package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class AssertClass {

	public static void main(String[] args) throws InterruptedException {
	
		 ChromeDriver driver= new ChromeDriver();
			
		 driver.get("https://www.amazon.in");
		 Thread.sleep(6000);
		 driver.navigate().refresh();
		 driver.manage().window().maximize();
		
		Assert.assertEquals(driver.getTitle(), "India - Google Search");
		 driver.findElement(By.id("twotabsearchtextbox")).sendKeys("shoes"+Keys.ENTER);
	}

}
