package Package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropdown {

	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html#google_vignette");
	  driver.manage().window().maximize();
		WebElement dropdown= driver.findElement(By.id("course"));
	Select s1= new Select(dropdown);
	s1.selectByVisibleText("Java");
	s1.selectByIndex(2);
	s1.selectByValue("java");
	
	}

}
