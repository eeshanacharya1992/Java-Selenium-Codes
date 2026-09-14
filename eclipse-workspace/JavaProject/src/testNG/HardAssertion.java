package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
//import org.testng.asserts.Assertion;

public class HardAssertion {
	 @Test
     public void testcase() throws InterruptedException
     {
    	 ChromeDriver driver= new ChromeDriver();
    	 
    	 driver.get("https://www.amazon.in");
    	 Thread.sleep(3000);
    	 driver.navigate().refresh();
  //  driver.findElement(By.name("q")).sendKeys("India"+Keys.ENTER);
   // 	 driver.findElement(By.id("twotabsearchtextbox")).sendKeys("shoes");
	Assertion a1= new Assertion();
	//a1.assertEquals(driver.getTitle(), "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");
	a1.assertEquals(driver.getTitle(), "India");
	
	
}
}