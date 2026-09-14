package seleniumProject2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownEx {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		driver.manage().window().maximize();
		WebElement sq= driver.findElement(By.id("course"));
		Select s1= new Select(sq);
	//	s1.selectByValue("net");
	//	s1.selectByIndex(1);
		s1.selectByVisibleText("Dot Net");

	}

}
