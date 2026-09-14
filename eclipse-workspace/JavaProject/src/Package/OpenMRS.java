package Package;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenMRS {

	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://o3.openmrs.org/openmrs/spa/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.xpath("//button[.='Continue']")).click();
		driver.findElement(By.id("password")).sendKeys("Admin123");
		driver.findElement(By.id("//button[.='Log in']")).click();

	}

}
