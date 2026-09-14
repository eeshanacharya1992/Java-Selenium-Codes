package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertion {
     @Test
     public void testcase() throws InterruptedException
     {
    	 ChromeDriver driver= new ChromeDriver();
    	
    	 driver.get("https://www.amazon.in");
    	 Thread.sleep(6000);
    	 driver.navigate().refresh();
    	 driver.manage().window().maximize();
   // driver.findElement(By.name("q")).sendKeys("India"+Keys.ENTER);
    	 SoftAssert s1= new SoftAssert();
    
    	// Assert.assertEquals(driver.getTitle(), "India - Google Search");
    	
   	
    //	 s1.assertEquals(driver.getTitle(), "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");
     s1.assertEquals(driver.getTitle(), "Hello");
   	 //s1.assertAll();
	//	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("shoes");	 
     }
}
