package Package;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class KIIT {

	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.kiitsciencecollege.org/#");
		driver.findElement(By.xpath("(//li/a[@class='none'])[13]")).click();

	}

}
