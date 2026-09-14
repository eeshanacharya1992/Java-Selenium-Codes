package Package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropdown2 {

	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		driver.get("file:///C:/Users/eesha/Downloads/learningHTML1%20(2).html");
        WebElement sw= driver.findElement(By.id("Relegion")); 
        Select sw2= new Select(sw);
        sw2.selectByValue("3");
	}

}
