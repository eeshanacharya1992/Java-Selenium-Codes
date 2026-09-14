package selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumPractice2 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver= new ChromeDriver();
		//	driver.get("https://www.selenium.dev/");
			driver.get("https://www.amazon.in/");
			Thread.sleep(6000);
			driver.navigate().refresh();
			driver.navigate().refresh();
			driver.findElement(By.id("twotabsearchtextbox")).sendKeys("shoes");
			driver.findElement(By.id("nav-search-submit-button")).click();
			String windowhandle=driver.getWindowHandle();	
			System.out.println(windowhandle);
		
			driver.findElement(By.xpath("(//div[@class='a-section a-spacing-base'])[1]")).click();
	      // driver.close();
		//	driver.getWindowHandle();
			Set<String> windowhandles= driver.getWindowHandles();
			System.out.println(windowhandles);
			Iterator<String>a1= windowhandles.iterator();
			String p1=a1.next();
			String c11=a1.next();
			System.out.println(p1);
			System.out.println(c11);
			driver.switchTo().window(c11);
			driver.switchTo().window(p1);
		//	Thread.sleep(4000);
		//	driver.quit();
	}

}
