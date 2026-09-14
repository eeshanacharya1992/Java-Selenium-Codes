package Package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabledEXample2 {

	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		driver.get("file:///C:/Users/eesha/Downloads/learningHTML1%20(4).html");
		WebElement a= driver.findElement(By.id("1"));
		boolean enabled=a.isEnabled();
		 if(enabled==false)
	       {  System.out.println("Actions performed in if block");
	    	 // System.out.println("No actions can be performed");
	    	   a.sendKeys("sap");
	    	   
	       }
		 else {
			 System.out.println("Actions performed in else block");
			 a.sendKeys("sap");
		 }
	}

}
