package Package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelectedMethod {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver= new ChromeDriver();
		driver.get("file:///C:/Users/eesha/Downloads/learningHTML1%20(4).html");
		WebElement a= driver.findElement(By.id("123"));
		boolean isselected=a.isSelected();
		 if(isselected==false)
	       {  System.out.println("Actions performed in if block");
	    	 // System.out.println("No actions can be performed");
	    	Thread.sleep(4000);
	       a.click();
	    	   
	       }
		 else
		 {
			 System.out.println("No Action");
		 }
	}

}
