package testNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Calenderhandling {
	WebDriver driver;

	@Test
	public void Calender() {
	//	WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.booking.com/");
		
		//deleteing cookies 
		
		driver.manage().deleteAllCookies();
		
		
		// applying wait

	//	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// clicking on pop up
		Actions act = new Actions(driver);
		act.build().perform();

		// clicking on dropdown
		WebElement dropdown = driver.findElement(By.xpath("//input[@placeholder='Where are you going?']"));
		dropdown.click();

		// getting size of elements in dropdown
		List<WebElement> listofoptions = driver
				.findElements(By.xpath("(//div[@id='autocomplete-results']//li[@class='be14df8bfb'])[5]"));
		System.out.println(listofoptions.size());
////input[@name='ss']
		// print list of options in dropdown
		for (WebElement dp : listofoptions) {
			String s = dp.getText();
			System.out.println(s);
		}

		
		for(WebElement dp:listofoptions) { 
		 if(dp.getText().equals("New Delhi")) ;
		 {
		 dp.click();
		break;
		 
		 }}
	

	}

	@AfterMethod(enabled = true)
	public void tear_down() {
		//driver.quit();
	}
}
