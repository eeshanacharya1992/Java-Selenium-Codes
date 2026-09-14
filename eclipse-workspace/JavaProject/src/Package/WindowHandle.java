package Package;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {
public static void main(String[] args) {
	//System.setProperty("webdriver.chrome.driver","Path to the driver"); 
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.navigate().refresh();
	driver.navigate().refresh();
	driver.manage().window().maximize();

	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("shoes");

	driver.findElement(By.id("nav-search-submit-button")).click();

	driver.findElement(By.xpath("(//div[@class='a-section aok-relative s-image-tall-aspect'])[1]")).click();


	

	// Load the website
//	driver.get("http://www.naukri.com/");
	//driver.get("https://www.naukri.com/registration/createAccount");

//	driver.findElement(By.xpath("//span[.='Google']")).click();
	// It will return the parent window name as a String
	String parent=driver.getWindowHandle();

	Set<String>s=driver.getWindowHandles();

	// Now iterate using Iterator
	Iterator<String> I1= s.iterator();

	while(I1.hasNext())
	{

	String child_window=I1.next();


	if(!parent.equals(child_window))
	{
	driver.switchTo().window(child_window);

	System.out.println(driver.switchTo().window(child_window).getTitle());

	//driver.close();
	}

	}
	//switch to the parent window
	driver.switchTo().window(parent);
	  System.out.println("Back to Parent Window Title: " + driver.getTitle());

      // Close parent window
     // driver.quit();
}
}
