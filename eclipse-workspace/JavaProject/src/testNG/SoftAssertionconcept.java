package testNG;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

public class SoftAssertionconcept {
  public static void main(String[] args) throws InterruptedException {
	  ChromeDriver driver= new ChromeDriver();
		
		 driver.get("https://www.amazon.in");
		 Thread.sleep(6000);
		 driver.navigate().refresh();
		 driver.manage().window().maximize();
	//driver.findElement(By.name("q")).sendKeys("India"+Keys.ENTER);
		 SoftAssert s1= new SoftAssert();
		 s1.assertEquals(driver.getTitle(), "India");
		 System.out.println(driver.getTitle());
	     driver.findElement(By.id("twotabsearchtextbox")).sendKeys("shoes"+Keys.ENTER);
	  WebElement sw=  driver.findElement(By.xpath("(//a[@class='a-link-normal s-line-clamp-2 s-line-clamp-3-for-col-12 s-link-style a-text-normal'])[2]"));
	   s1.assertEquals(sw.getText(), "Text is not displayed");
	   sw.click();
	 
		Set<String>s=driver.getWindowHandles();
		Iterator<String> I1= s.iterator();
		String parentWindow=I1.next();
		String childWindow=I1.next();
		driver.switchTo().window(childWindow);
	
		Thread.sleep(4000);
		 s1.assertEquals(driver.getTitle(),driver.getTitle().contains("Mobile"));
		System.out.println(driver.getTitle());
	    s1.assertAll();
}
}
