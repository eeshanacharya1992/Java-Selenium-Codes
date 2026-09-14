package Package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabled {

	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		driver.get("file:///C:/Users/eesha/Downloads/learningHTML1%20(4).html");
       WebElement b= driver.findElement(By.id("121"));
    //   boolean enabled=b.isEnabled();
       
     //  if(enabled== false)
     //  if(enabled== false)
       if(b.isEnabled()==false)
       {
    	 // System.out.println("No actions can be performed");
    	   b.sendKeys("sap");
       }
	}

}
